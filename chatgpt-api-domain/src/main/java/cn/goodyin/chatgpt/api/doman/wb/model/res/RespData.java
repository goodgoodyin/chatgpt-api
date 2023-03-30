package cn.goodyin.chatgpt.api.doman.wb.model.res;

import cn.goodyin.chatgpt.api.doman.wb.model.vo.Blog;

import java.util.List;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:20
 */
public class RespData {

    private Long since_id;

    private List<Blog> list;

    private int status_visible;

    private boolean bottom_tips_visible;

    private String bottom_tips_text;

    private List<String> topicList;

    private int total;

    public Long getSince_id() {
        return since_id;
    }

    public void setSince_id(Long since_id) {
        this.since_id = since_id;
    }

    public void setList(List<Blog> list){
        this.list = list;
    }
    public List<Blog> getList(){
        return this.list;
    }
    public void setStatus_visible(int status_visible){
        this.status_visible = status_visible;
    }
    public int getStatus_visible(){
        return this.status_visible;
    }
    public void setBottom_tips_visible(boolean bottom_tips_visible){
        this.bottom_tips_visible = bottom_tips_visible;
    }
    public boolean getBottom_tips_visible(){
        return this.bottom_tips_visible;
    }
    public void setBottom_tips_text(String bottom_tips_text){
        this.bottom_tips_text = bottom_tips_text;
    }
    public String getBottom_tips_text(){
        return this.bottom_tips_text;
    }
    public void setTopicList(List<String> topicList){
        this.topicList = topicList;
    }
    public List<String> getTopicList(){
        return this.topicList;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
}
