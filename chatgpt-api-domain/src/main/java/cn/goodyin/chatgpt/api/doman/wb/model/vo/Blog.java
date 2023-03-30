package cn.goodyin.chatgpt.api.doman.wb.model.vo;

import java.util.List;

/**
 * @author GoodYin
 * @description
 * @date 2023/3/30 06:15
 */
public class Blog {
    private Visible visible;

    private String created_at;

    private String id;

    private String idstr;

    private String mid;

    private String mblogid;

    private User user;

    private boolean can_edit;

    private String text_raw;

    private String text;

    private int textLength;

    private String source;

    private boolean favorited;

    private String rid;

    private int reads_count;

    private List<String> pic_ids;

    private String geo;

    private int pic_num;

    private boolean is_paid;

    private int mblog_vip_type;

    private NumberDisplayStrategy number_display_strategy;

    private int reposts_count;

    private int comments_count;

    private int attitudes_count;

    private int attitudes_status;

    private boolean isLongText;

    private int mlevel;

    private int content_auth;

    private int is_show_bulletin;

    private CommentManageInfo comment_manage_info;

    private int share_repost_type;

    private Title title;

    private int mblogtype;

    private boolean showFeedRepost;

    private boolean showFeedComment;

    private boolean pictureViewerSign;

    private boolean showPictureViewer;

    private List<String> rcList;

    private String region_name;

    private List<String> customIcons;

    public void setVisible(Visible visible){
        this.visible = visible;
    }
    public Visible getVisible(){
        return this.visible;
    }
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getCreated_at(){
        return this.created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdstr(String idstr){
        this.idstr = idstr;
    }
    public String getIdstr(){
        return this.idstr;
    }
    public void setMid(String mid){
        this.mid = mid;
    }
    public String getMid(){
        return this.mid;
    }
    public void setMblogid(String mblogid){
        this.mblogid = mblogid;
    }
    public String getMblogid(){
        return this.mblogid;
    }
    public void setUser(User user){
        this.user = user;
    }
    public User getUser(){
        return this.user;
    }
    public void setCan_edit(boolean can_edit){
        this.can_edit = can_edit;
    }
    public boolean getCan_edit(){
        return this.can_edit;
    }
    public void setText_raw(String text_raw){
        this.text_raw = text_raw;
    }
    public String getText_raw(){
        return this.text_raw;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setTextLength(int textLength){
        this.textLength = textLength;
    }
    public int getTextLength(){
        return this.textLength;
    }
    public void setSource(String source){
        this.source = source;
    }
    public String getSource(){
        return this.source;
    }
    public void setFavorited(boolean favorited){
        this.favorited = favorited;
    }
    public boolean getFavorited(){
        return this.favorited;
    }
    public void setRid(String rid){
        this.rid = rid;
    }
    public String getRid(){
        return this.rid;
    }
    public void setReads_count(int reads_count){
        this.reads_count = reads_count;
    }
    public int getReads_count(){
        return this.reads_count;
    }
    public void setPic_ids(List<String> pic_ids){
        this.pic_ids = pic_ids;
    }
    public List<String> getPic_ids(){
        return this.pic_ids;
    }
    public void setGeo(String geo){
        this.geo = geo;
    }
    public String getGeo(){
        return this.geo;
    }
    public void setPic_num(int pic_num){
        this.pic_num = pic_num;
    }
    public int getPic_num(){
        return this.pic_num;
    }
    public void setIs_paid(boolean is_paid){
        this.is_paid = is_paid;
    }
    public boolean getIs_paid(){
        return this.is_paid;
    }
    public void setMblog_vip_type(int mblog_vip_type){
        this.mblog_vip_type = mblog_vip_type;
    }
    public int getMblog_vip_type(){
        return this.mblog_vip_type;
    }
    public void setNumber_display_strategy(NumberDisplayStrategy number_display_strategy){
        this.number_display_strategy = number_display_strategy;
    }
    public NumberDisplayStrategy getNumber_display_strategy(){
        return this.number_display_strategy;
    }
    public void setReposts_count(int reposts_count){
        this.reposts_count = reposts_count;
    }
    public int getReposts_count(){
        return this.reposts_count;
    }
    public void setComments_count(int comments_count){
        this.comments_count = comments_count;
    }
    public int getComments_count(){
        return this.comments_count;
    }
    public void setAttitudes_count(int attitudes_count){
        this.attitudes_count = attitudes_count;
    }
    public int getAttitudes_count(){
        return this.attitudes_count;
    }
    public void setAttitudes_status(int attitudes_status){
        this.attitudes_status = attitudes_status;
    }
    public int getAttitudes_status(){
        return this.attitudes_status;
    }
    public void setIsLongText(boolean isLongText){
        this.isLongText = isLongText;
    }
    public boolean getIsLongText(){
        return this.isLongText;
    }
    public void setMlevel(int mlevel){
        this.mlevel = mlevel;
    }
    public int getMlevel(){
        return this.mlevel;
    }
    public void setContent_auth(int content_auth){
        this.content_auth = content_auth;
    }
    public int getContent_auth(){
        return this.content_auth;
    }
    public void setIs_show_bulletin(int is_show_bulletin){
        this.is_show_bulletin = is_show_bulletin;
    }
    public int getIs_show_bulletin(){
        return this.is_show_bulletin;
    }
    public void setComment_manage_info(CommentManageInfo comment_manage_info){
        this.comment_manage_info = comment_manage_info;
    }
    public CommentManageInfo getComment_manage_info(){
        return this.comment_manage_info;
    }
    public void setShare_repost_type(int share_repost_type){
        this.share_repost_type = share_repost_type;
    }
    public int getShare_repost_type(){
        return this.share_repost_type;
    }
    public void setTitle(Title title){
        this.title = title;
    }
    public Title getTitle(){
        return this.title;
    }
    public void setMblogtype(int mblogtype){
        this.mblogtype = mblogtype;
    }
    public int getMblogtype(){
        return this.mblogtype;
    }
    public void setShowFeedRepost(boolean showFeedRepost){
        this.showFeedRepost = showFeedRepost;
    }
    public boolean getShowFeedRepost(){
        return this.showFeedRepost;
    }
    public void setShowFeedComment(boolean showFeedComment){
        this.showFeedComment = showFeedComment;
    }
    public boolean getShowFeedComment(){
        return this.showFeedComment;
    }
    public void setPictureViewerSign(boolean pictureViewerSign){
        this.pictureViewerSign = pictureViewerSign;
    }
    public boolean getPictureViewerSign(){
        return this.pictureViewerSign;
    }
    public void setShowPictureViewer(boolean showPictureViewer){
        this.showPictureViewer = showPictureViewer;
    }
    public boolean getShowPictureViewer(){
        return this.showPictureViewer;
    }
    public void setRcList(List<String> rcList){
        this.rcList = rcList;
    }
    public List<String> getRcList(){
        return this.rcList;
    }
    public void setRegion_name(String region_name){
        this.region_name = region_name;
    }
    public String getRegion_name(){
        return this.region_name;
    }
    public void setCustomIcons(List<String> customIcons){
        this.customIcons = customIcons;
    }
    public List<String> getCustomIcons(){
        return this.customIcons;
    }

}
