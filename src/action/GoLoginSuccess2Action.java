package action;

import dto.LoginDTO;

public class GoLoginSuccess2Action {
	private String pass;
	public String execute(){
		LoginDTO dto =new LoginDTO();
		pass="aaa";
		return "success";

	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
