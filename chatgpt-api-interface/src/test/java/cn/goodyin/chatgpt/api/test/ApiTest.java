package cn.goodyin.chatgpt.api.test;

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
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApiTest {

    @Test
    public void query_unanswered_questions() throws IOException {

        HttpGet httpGet = new HttpGet("https://weibo.com/ajax/statuses/mymblog?uid=xxx&page=1&feature=0");
        httpGet.addHeader("cookie", "xxx");
        httpGet.addHeader("Content-Type", "application/json;charset=utf8");

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost("https://weibo.com/ajax/comments/create");
        httpPost.addHeader("cookie", "xxx");
        httpPost.setHeader("content-type", "application/x-www-form-urlencoded");
        httpPost.setHeader("authority", "weibo.com");
        httpPost.setHeader("accept", "application/json, text/plain, */*");
        httpPost.setHeader("accept-language", "zh-CN,zh;q=0.9");
        httpPost.setHeader("client-version", "v2.40.16");
        httpPost.setHeader("origin", "https://weibo.com");
        httpPost.setHeader("referer", "https://weibo.com/u/xxx");
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
        httpPost.setHeader("x-xsrf-token", "xxx");


        // 构建请求参数
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("id", "xxx"));
        params.add(new BasicNameValuePair("comment", "hello"));
        params.add(new BasicNameValuePair("pic_id", ""));
        params.add(new BasicNameValuePair("is_repost", "0"));
        params.add(new BasicNameValuePair("comment_ori", "0"));
        params.add(new BasicNameValuePair("is_comment", "0"));
        HttpEntity requestEntity = new UrlEncodedFormEntity(params);
        httpPost.setEntity(requestEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
