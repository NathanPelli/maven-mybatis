package andy.maven_mybatis.dao;

import java.util.List;
import java.util.Map;

import andy.maven_mybatis.domain.Article;
import andy.maven_mybatis.domain.Comment;
import andy.maven_mybatis.domain.User;

/**
 * @author man
 * 2015年10月22日 下午3:59:20
 */
public interface UserDao {
	/**查询单个用户数据**/
	public User selectUserById(int id);
	/**查询多个用户数据**/
	public List<User> selectUsers(String userName);
	/**增加用户数据**/
	public void addUser(User user);
	/**删除用户数据**/
	public void deleteUser(User user);
	/**查询某个用户发表的所有文章**/
	public List<Article> getUserArticles(int id);
	/**查询某篇文章,包括他的作者**/
	public Article selectArticleAllInfoById(int articleId);
	/**查出某篇文章,包括作者和评论**/
	public Article selectArticleComments(int articleId);
	/**查出某篇文章的所有评论**/
	public Article selectAllCommentsForArticle(int article_id);
	/**测试查询结果为HashMap类型**/
	@SuppressWarnings("rawtypes")
	public Map selectMap(int id);
	/**修改指定id用户的用户名**/
	public void updateUserName(int tmp, String name);
	/**向用户表中插入一条记录信息**/
	public void insertUserInfo(int id, String userName, int userAge, String userAddress);
	/**向用户表中插入一条记录信息,主键自动生成**/
	public void insertUser(String userName, int userAge, String userAddress);
	public User queryUser(User user);
	
	public Article queryArticle(int id);
	
	public Article queryArticleByProcedure(int id);//通过调用存储过程来查询指定id的文章信息
	
	public Comment selectCommentForArticle(int id);//查询某篇文章的评论
	
	public Article selectArticle(int id);
	
	public Article selectCollectionTest(int id);//测试collection元素的嵌入式结果
}
