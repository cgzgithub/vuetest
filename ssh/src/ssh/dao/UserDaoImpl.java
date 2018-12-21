package ssh.dao;
import java.io.Serializable;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import ssh.entity.User;

@SuppressWarnings("deprecation")
@Transactional
public class UserDaoImpl {
	//property constants
public static final String USER_NAME = "userName";
public static final String PASSWORD = "password";




private SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sessionFactory){
  this.sessionFactory = sessionFactory;
}

private Session getCurrentSession(){
return sessionFactory.getCurrentSession(); 
}
protected void initDao() {
	//do nothing
}







public User findByUserNameAndPassword( String username,String password) {
   User user = null;
   try {
       SQLQuery sql= getCurrentSession().createSQLQuery("select * from user where name='"+username+"' and password='"+password+"'").addEntity(User.class);
       List<User> list = sql.list();
       if(list.size()>0)
       	user = list.get(0);
       return user;
   } catch (RuntimeException re) {
       throw re;
   }
}


public List<User> findAll() {
	try {
		 String queryString = "from User";
         Query queryObject = getCurrentSession().createQuery(queryString);
		 return queryObject.list();
	} catch (RuntimeException re) {
		throw re;
	}
}
  












public static UserDaoImpl getFromApplicationContext(ApplicationContext ctx) {
	return (UserDaoImpl) ctx.getBean("UserDao");
}
}
