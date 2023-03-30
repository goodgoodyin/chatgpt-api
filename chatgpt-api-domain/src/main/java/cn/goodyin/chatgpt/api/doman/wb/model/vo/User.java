package cn.goodyin.chatgpt.api.doman.wb.model.vo;

import java.util.List;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:09
 */
public class User {
    private int id;

    private String idstr;

    private int pc_new;

    private String screen_name;

    private String profile_image_url;

    private String profile_url;

    private boolean verified;

    private int verified_type;

    private String domain;

    private String weihao;

    private String avatar_large;

    private String avatar_hd;

    private boolean follow_me;

    private boolean following;

    private int mbrank;

    private int mbtype;

    private int v_plus;

    private boolean planet_video;

    private List<String> icon_list;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setIdstr(String idstr){
        this.idstr = idstr;
    }
    public String getIdstr(){
        return this.idstr;
    }
    public void setPc_new(int pc_new){
        this.pc_new = pc_new;
    }
    public int getPc_new(){
        return this.pc_new;
    }
    public void setScreen_name(String screen_name){
        this.screen_name = screen_name;
    }
    public String getScreen_name(){
        return this.screen_name;
    }
    public void setProfile_image_url(String profile_image_url){
        this.profile_image_url = profile_image_url;
    }
    public String getProfile_image_url(){
        return this.profile_image_url;
    }
    public void setProfile_url(String profile_url){
        this.profile_url = profile_url;
    }
    public String getProfile_url(){
        return this.profile_url;
    }
    public void setVerified(boolean verified){
        this.verified = verified;
    }
    public boolean getVerified(){
        return this.verified;
    }
    public void setVerified_type(int verified_type){
        this.verified_type = verified_type;
    }
    public int getVerified_type(){
        return this.verified_type;
    }
    public void setDomain(String domain){
        this.domain = domain;
    }
    public String getDomain(){
        return this.domain;
    }
    public void setWeihao(String weihao){
        this.weihao = weihao;
    }
    public String getWeihao(){
        return this.weihao;
    }
    public void setAvatar_large(String avatar_large){
        this.avatar_large = avatar_large;
    }
    public String getAvatar_large(){
        return this.avatar_large;
    }
    public void setAvatar_hd(String avatar_hd){
        this.avatar_hd = avatar_hd;
    }
    public String getAvatar_hd(){
        return this.avatar_hd;
    }
    public void setFollow_me(boolean follow_me){
        this.follow_me = follow_me;
    }
    public boolean getFollow_me(){
        return this.follow_me;
    }
    public void setFollowing(boolean following){
        this.following = following;
    }
    public boolean getFollowing(){
        return this.following;
    }
    public void setMbrank(int mbrank){
        this.mbrank = mbrank;
    }
    public int getMbrank(){
        return this.mbrank;
    }
    public void setMbtype(int mbtype){
        this.mbtype = mbtype;
    }
    public int getMbtype(){
        return this.mbtype;
    }
    public void setV_plus(int v_plus){
        this.v_plus = v_plus;
    }
    public int getV_plus(){
        return this.v_plus;
    }
    public void setPlanet_video(boolean planet_video){
        this.planet_video = planet_video;
    }
    public boolean getPlanet_video(){
        return this.planet_video;
    }
    public void setIcon_list(List<String> icon_list){
        this.icon_list = icon_list;
    }
    public List<String> getIcon_list(){
        return this.icon_list;
    }
}
