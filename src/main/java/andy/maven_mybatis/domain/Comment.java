package andy.maven_mybatis.domain;

public class Comment {
	private int id;
	private int commentId;
	private int articleId;
	private String content;
	private String commentRemark;
	public Comment(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCommentRemark() {
		return commentRemark;
	}
	public void setCommentRemark(String commentRemark) {
		this.commentRemark = commentRemark;
	}
	public String toString(){
		return "commentId:"+this.commentId+", articleId:"+this.articleId+", content:"+this.content+", commentRemark:"+this.commentRemark;
	}
}
