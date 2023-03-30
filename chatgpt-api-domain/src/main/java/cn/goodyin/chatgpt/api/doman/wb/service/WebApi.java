package cn.goodyin.chatgpt.api.doman.wb.service;

import cn.goodyin.chatgpt.api.doman.wb.IWebApi;
import cn.goodyin.chatgpt.api.doman.wb.model.aggregates.ChatQuestionBlogAggregates;
import cn.goodyin.chatgpt.api.doman.wb.model.res.AnswerRes;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 07:01
 */
@Service
public class WebApi implements IWebApi {
    private Logger logger = LoggerFactory.getLogger(WebApi.class);


    @Override
    public ChatQuestionBlogAggregates queryChatQuestionBlog(String cookie, String userId) throws IOException {
        HttpGet httpGet = new HttpGet("https://weibo.com/ajax/statuses/mymblog?uid=" + userId + "&page=1&feature=0");
        httpGet.addHeader("cookie", cookie);
        httpGet.addHeader("Content-Type", "application/json;charset=utf8");
        httpGet.addHeader("authority", "weibo.com");
        httpGet.addHeader("accept", "application/json, text/plain, */*");
        httpGet.addHeader("accept-language", "zh-CN,zh;q=0.9");
        httpGet.addHeader("client-version", "v2.40.20");
        httpGet.addHeader("referer", "https://weibo.com/u/" + userId);
        httpGet.addHeader("sec-ch-ua", "\"Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111\"");
        httpGet.addHeader("sec-ch-ua-mobile", "?0");
        httpGet.addHeader("sec-ch-ua-platform", "\"macOS\"");
        httpGet.addHeader("sec-fetch-dest", "empty");
        httpGet.addHeader("sec-fetch-mode", "cors");
        httpGet.addHeader("sec-fetch-site", "same-origin");
        httpGet.addHeader("server-version", "v2023.03.30.1");
        httpGet.addHeader("traceparent", "00-d4d5cc247fa3deaf3700a93c0e9eef7b-9798969db83af05a-00");
        httpGet.addHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36");
        httpGet.addHeader("x-requested-with", "XMLHttpRequest");
        httpGet.addHeader("x-xsrf-token", getXXsrfToken(cookie));

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            logger.info("拉取, userId:{} 微博信息 res:{}", userId, res);
            return JSON.parseObject(res, ChatQuestionBlogAggregates.class);
        } else {
            throw new RuntimeException("queryChatQuestionBlog Err Code is " + response.getStatusLine().getStatusCode());
        }
    }

    @Override
    public boolean answer(String userId, String cookie, String blogId, String comment) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost("https://weibo.com/ajax/comments/create");
        httpPost.addHeader("cookie", cookie);
        httpPost.setHeader("content-type", "application/x-www-form-urlencoded");
        httpPost.setHeader("authority", "weibo.com");
        httpPost.setHeader("accept", "application/json, text/plain, */*");
        httpPost.setHeader("accept-language", "zh-CN,zh;q=0.9");
        httpPost.setHeader("client-version", "v2.40.16");
        httpPost.setHeader("origin", "https://weibo.com");
        httpPost.setHeader("referer", "https://weibo.com/u/" + userId);
        httpPost.setHeader("sec-ch-ua", "\"Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110\"");
        httpPost.setHeader("sec-ch-ua-mobile", "?0");
        httpPost.setHeader("sec-ch-ua-platform", "\"macOS\"");
        httpPost.setHeader("sec-fetch-dest", "empty");
        httpPost.setHeader("sec-fetch-mode", "cors");
        httpPost.setHeader("sec-fetch-site", "same-origin");
        httpPost.setHeader("server-version", "v2023.03.27.3");
        httpPost.setHeader("traceparent", "00-ee73a80e85825f1d57406f106977cbb9-bfcf4fa1327f797e-00");
        httpPost.setHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
        httpPost.setHeader("x-requested-with", "XMLHttpRequest");
        httpPost.setHeader("x-xsrf-token", getXXsrfToken(cookie));


        // 构建请求参数
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("id", blogId));
        params.add(new BasicNameValuePair("comment", comment));
        params.add(new BasicNameValuePair("pic_id", ""));
        params.add(new BasicNameValuePair("is_repost", "0"));
        params.add(new BasicNameValuePair("comment_ori", "0"));
        params.add(new BasicNameValuePair("is_comment", "0"));
        HttpEntity requestEntity = new UrlEncodedFormEntity(params);
        httpPost.setEntity(requestEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            logger.info("回复微博结果： userId:{}, blogId:{}: res:{}", userId, blogId, res);
            AnswerRes answerRes = JSON.parseObject(res, AnswerRes.class);
            return answerRes.getOk() == 1;
        } else {
            throw new RuntimeException("answer Err Code is " + response.getStatusLine().getStatusCode());
        }
    }

    private String getXXsrfToken(String cookie) {
        return Arrays.stream(cookie.split(";"))
                .filter(v -> v.contains("XSRF-TOKEN"))
                .findFirst()
                .map(v -> v.replace("XSRF-TOKEN=", "").replace(" ", ""))
                .orElse(null);

    }
}
