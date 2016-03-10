package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.EditDAO;

public class EditAction extends ActionSupport implements SessionAware{
	private String newUserName;
	private String newPass;
	private Map<String,Object>session;
	private String res;
	private boolean rs;

	public String execute(){
		res = ERROR;
		EditDAO dao = new EditDAO();
		rs = dao.insert(newUserName, newPass);
		if(rs){
			res = SUCCESS;
			System.out.println("成功");
		}
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


}
