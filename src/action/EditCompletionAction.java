package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.EditCompletionDAO;
import dto.EditDTO;

public class EditCompletionAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private int sessionUserId;
	private String userName;
	private String pass;
	private String res;
	private boolean rs;

	public String execute(){
		res = ERROR;
		EditDTO dto = new EditDTO();
		EditCompletionDAO dao = new EditCompletionDAO();
		sessionUserId = (int)session.get("sessionUserId");
		dao.sessionGetAndSelct(sessionUserId, dto);
		userName = dto.getUserName();
		pass = dto.getPassword();
		rs = dao.insert(userName, pass);
		if(rs){
			session.remove("sessionUserId");
			dao.putSession(pass, dto);
			session.put("sessionUserId", dto.getUserId());
			res = SUCCESS;
		}
		dao.resetTemp();
		return res;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
