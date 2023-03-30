package cn.goodyin.chatgpt.api.doman.wb.model.vo;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:09
 */
public class NumberDisplayStrategy {

    private int apply_scenario_flag;

    private int display_text_min_number;

    private String display_text;

    public void setApply_scenario_flag(int apply_scenario_flag){
        this.apply_scenario_flag = apply_scenario_flag;
    }
    public int getApply_scenario_flag(){
        return this.apply_scenario_flag;
    }
    public void setDisplay_text_min_number(int display_text_min_number){
        this.display_text_min_number = display_text_min_number;
    }
    public int getDisplay_text_min_number(){
        return this.display_text_min_number;
    }
    public void setDisplay_text(String display_text){
        this.display_text = display_text;
    }
    public String getDisplay_text(){
        return this.display_text;
    }
}
