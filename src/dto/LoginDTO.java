package dto;

public class LoginDTO {
	private String user_name;
	private String pass;
	public LoginDTO(String userName, String userPass){
		this.user_name = userName;
		this.pass = userPass;
	}
	public LoginDTO(){

	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
