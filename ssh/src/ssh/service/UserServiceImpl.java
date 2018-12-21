package ssh.service;
import java.util.ArrayList;
import java.util.List;

import ssh.dao.UserDaoImpl;
import ssh.entity.User;
public class UserServiceImpl {
	private UserDaoImpl userdao;
	
	public User getUser(String username,String password){
		return userdao.findByUserNameAndPassword(username, password);
	}
	
	
	public List<User> getAllUsers(){
		return userdao.findAll();
	}
	

	public UserDaoImpl getUserDao() {
		return userdao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userdao = userDao;
	}
}
