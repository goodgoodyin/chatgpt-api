package cn.goodyin.chatgpt.api.test;

import cn.goodyin.chatgpt.api.doman.wb.IWebApi;
import cn.goodyin.chatgpt.api.doman.wb.model.aggregates.ChatQuestionBlogAggregates;
import cn.goodyin.chatgpt.api.doman.wb.model.vo.Blog;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 23:58
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRunTest {

    private Logger logger = LoggerFactory.getLogger(SpringBootRunTest.class);

    @Value("${chatgpt-api.userId}")
    private String userId;

    @Value("${chatgpt-api.cookie}")
    private String cookie;

    @Resource
    private IWebApi webApi;

    @Test
    public void testBlogList() throws IOException {
        ChatQuestionBlogAggregates chatQuestionBlogAggregates = webApi.queryChatQuestionBlog(cookie, userId);
        logger.info("测试结果:{}", JSON.toJSONString(chatQuestionBlogAggregates));
        List<Blog> list = chatQuestionBlogAggregates.getData().getList();
        for (Blog blog : list) {
            String blogId = blog.getId();
            String textRaw = blog.getText_raw();
            logger.info("blogId :{} textRaw {}", blogId, textRaw);
        }
    }

    @Test
    public void testAnswer() throws IOException {
        webApi.answer(userId, cookie, "xxx", "hello3");
    }

}
