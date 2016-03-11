package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.EditDAO;
import dto.EditDTO;

public class EditAction extends ActionSupport implements SessionAware{
	private String newUserName;
	private String newPass;
	private int sessionUserId;
	private Map<String,Object>session;
	private String res;
	private boolean rs;

	public String execute(){
		res = ERROR;
		EditDAO dao = new EditDAO();
		EditDTO dto = new EditDTO();
		rs = dao.insert(newUserName, newPass);
		if(rs){
			dao.selct(newUserName, dto);
			sessionUserId = dto.getUserId();
			res = SUCCESS;
			System.out.println("成功");
		}
		session.put("sessionUserId", sessionUserId);
		System.out.println(sessionUserId);
		return res;
	}

	public String getNewUserName() {
		return newUserName;
	}

	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getSessionUserId() {
		return sessionUserId;
	}

	public void setSessionUserId(int sessionUserId) {
		this.sessionUserId = sessionUserId;
	}


}
