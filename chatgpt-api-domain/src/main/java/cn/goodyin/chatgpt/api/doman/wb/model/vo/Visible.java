package cn.goodyin.chatgpt.api.doman.wb.model.vo;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:07
 */
public class Visible {
    private int type;

    private int list_id;

    public void setType(int type){
        this.type = type;
    }
    public int getType(){
        return this.type;
    }
    public void setList_id(int list_id){
        this.list_id = list_id;
    }
    public int getList_id(){
        return this.list_id;
    }
}
