package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware{
	private String user_name;
	private String pass;
	private Map<String, Object> session;
	public String execute(){
		LoginDAO dao = new LoginDAO();
		boolean res = dao.selectDB(user_name, pass);
		if(!res){
			return "error";
		}
		LoginDTO dto =new LoginDTO(user_name,pass);
		session.put("user_name",dto.getUser_name());



		return "success";
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
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
