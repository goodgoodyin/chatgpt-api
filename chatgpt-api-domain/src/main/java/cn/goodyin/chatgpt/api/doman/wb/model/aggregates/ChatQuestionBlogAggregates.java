package cn.goodyin.chatgpt.api.doman.wb.model.aggregates;

import cn.goodyin.chatgpt.api.doman.wb.model.res.RespData;


/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:52
 */
public class ChatQuestionBlogAggregates {

    private RespData data;

    private int ok;

    public RespData getData() {
        return data;
    }

    public void setData(RespData data) {
        this.data = data;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }
}
