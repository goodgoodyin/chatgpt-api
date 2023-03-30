package cn.goodyin.chatgpt.api.doman.wb.model.vo;/**
* @author GoodYin
* @description
* @date 2023/3/30 06:10
*/
public class CommentManageInfo {

    private int comment_manage_button;

    private int comment_permission_type;

    private int approval_comment_type;

    private int comment_sort_type;

    public void setComment_manage_button(int comment_manage_button){
        this.comment_manage_button = comment_manage_button;
    }
    public int getComment_manage_button(){
        return this.comment_manage_button;
    }
    public void setComment_permission_type(int comment_permission_type){
        this.comment_permission_type = comment_permission_type;
    }
    public int getComment_permission_type(){
        return this.comment_permission_type;
    }
    public void setApproval_comment_type(int approval_comment_type){
        this.approval_comment_type = approval_comment_type;
    }
    public int getApproval_comment_type(){
        return this.approval_comment_type;
    }
    public void setComment_sort_type(int comment_sort_type){
        this.comment_sort_type = comment_sort_type;
    }
    public int getComment_sort_type(){
        return this.comment_sort_type;
    }
}
