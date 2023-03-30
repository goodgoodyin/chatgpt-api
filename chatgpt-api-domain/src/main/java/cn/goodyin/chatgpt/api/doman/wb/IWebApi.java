package cn.goodyin.chatgpt.api.doman.wb;

import cn.goodyin.chatgpt.api.doman.wb.model.aggregates.ChatQuestionBlogAggregates;

import java.io.IOException;

/**
 * @author GoodYin
 * @description  微博 API 接口
 * @date 2023/3/29 22:37
 */
public interface IWebApi {

    /**
     * 查询用户的微博
     * @param cookie
     * @param userId
     * @return
     * @throws IOException
     */
    ChatQuestionBlogAggregates queryChatQuestionBlog(String cookie, String userId) throws IOException;

    /**
     * 回复
     * @param userId
     * @param cookie
     * @param blogId
     * @param comment
     * @return
     * @throws IOException
     */
    boolean answer(String userId, String cookie, String blogId, String comment) throws IOException;
}
