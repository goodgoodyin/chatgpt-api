package cn.goodyin.chatgpt.api.doman.wb.model.vo;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:11
 */
public class Title {

    private String text;

    private int base_color;

    private String icon_url;

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setBase_color(int base_color){
        this.base_color = base_color;
    }
    public int getBase_color(){
        return this.base_color;
    }
    public void setIcon_url(String icon_url){
        this.icon_url = icon_url;
    }
    public String getIcon_url(){
        return this.icon_url;
    }
}
