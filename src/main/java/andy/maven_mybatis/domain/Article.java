package andy.maven_mybatis.domain;

import java.util.List;

/**
 * @author man
 * 2015年10月22日 下午4:39:46
 */
public class Article {

	private int id;
	private User user;
	private String title;
	private String content;
	private Comment comment;
	private List<Comment> posts;
	public Article(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	public List<Comment> getPosts() {
		return posts;
	}
	public void setPosts(List<Comment> posts) {
		this.posts = posts;
	}
	public String toString(){
		return "id: "+this.id+" ,title: "+this.title+" ,content:"+this.content+", comment:"+this.comment+",user:"+this.user+",posts:"+this.posts;
	}

}
