package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.GoLoginSuccess2DAO;
import dto.GoLoginSuccess2DTO;

public class GoLoginSuccess2Action extends ActionSupport implements SessionAware{
private Map<String, Object> session;
private int user_id;
private String pass;
private String user_name;
private String credit_number;
private String address;
	public String execute(){
		user_id = (int)session.get("user_id");
		GoLoginSuccess2DAO dao = new GoLoginSuccess2DAO();
		GoLoginSuccess2DTO dto = new GoLoginSuccess2DTO();
		dao.selectToUser(user_id,dto);
		pass = dto.getPass();
		user_name= dto.getUser_name();
		credit_number = dto.getCredit_number();
		address = dto.getAddress();
		return "success";

	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getCredit_number() {
		return credit_number;
	}
	public void setCredit_number(String credit_number) {
		this.credit_number = credit_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
