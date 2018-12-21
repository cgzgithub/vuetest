package ssh.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ssh.entity.User;
import ssh.service.UserServiceImpl;
public class UserAction extends ActionSupport {

	private User user;

	private UserServiceImpl userservice;

	private List<User> list; 



	
	


	public String login(){
		user = userservice.getUser(user.getName(),user.getPassword());
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		if(user != null){
			session.setAttribute("userid", user.getId());
			session.setAttribute("username", user.getName());
			session.setAttribute("password", user.getPassword());
			session.setAttribute("user", user);
			return "success";
		}
		else{
			ActionContext.getContext().put("result", "false");
			return "error";
		}
	}








	



	public String getAllUsers(){
		list = userservice.getAllUsers();
		if(list.size()>0){
			return SUCCESS;
		}
		else{
			return "error";
		}
	}


	
	public UserServiceImpl getUserservice() {
		return userservice;
	}

	public void setUserservice(UserServiceImpl userservice) {
		this.userservice = userservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}


	


}