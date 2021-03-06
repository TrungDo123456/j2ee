package uit.edu.vn.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
 
import com.opensymphony.xwork2.ActionSupport;
 

public class ValidatedLoginAction extends ActionSupport implements SessionAware {
     
    private Map<String, Object> sessionMap;
    private String username;
    private String password;
    
    public String login() {
        String loggedUserName = null;
        HttpServletRequest request = ServletActionContext.getRequest();
        // check if the userName is already stored in the session
        if (sessionMap.containsKey("username")) {
            loggedUserName = (String) sessionMap.get("username");
        }
        if (loggedUserName != null && loggedUserName.equals("admin@smc.com")) {
            return SUCCESS; // return welcome page
        }
        else
         
        // if no userName stored in the session,
        // check the entered userName and password
        if (username != null && username.equals("admin@smc.com") && password != null && password.equals("admin")) {
             
            // add userName to the session
            sessionMap.put("username", username);
            HttpSession session = request.getSession();
			session.setAttribute("user", this.username);
			session.setMaxInactiveInterval( 1 * 60);// tinh bang giay 30 phut
             
            return SUCCESS; // return welcome page
        }
        // in other cases, return login page
        return INPUT;
    }
     
    public String logout() {
        // remove userName from the session
        if (sessionMap.containsKey("username")) {
            sessionMap.remove("username");
            HttpServletRequest request = ServletActionContext.getRequest();
    		HttpSession session = request.getSession();
    		session.removeAttribute("user");
    		session.invalidate();
        }
        return SUCCESS;
    }
    

	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
		
	}
}
