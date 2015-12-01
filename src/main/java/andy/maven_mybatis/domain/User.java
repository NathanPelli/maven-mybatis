package andy.maven_mybatis.domain;
/**
 * @author man
 * 2015年10月22日 下午3:56:42
 */
public class User {
	private int id;
	private String userAge;
	private String userName;
	private String userAddress;
	public User(){}
	public User(String userAge,String userName,String userAddress){
		this.userAddress = userAddress;
		this.userAge = userAge;
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String toString(){
		return this.userAddress+","+this.userName+","+this.userAge;
	}
}
