package ssh.entity;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String name;
	private String password;
	private String phone;
	private String comment;
	public User(String name, String password, String phone, String comment) {
		// TODO Auto-generated constructor stub
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.comment = comment;
	}
	public User(){};
	public int getId () {
		return id;
	}
	public void  setId (int id) {
		this.id = id;
	}
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getPassword () {
		return password;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public String getPhone () {
		return phone;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
	public String getComment () {
		return comment;
	}
	public void setComment (String comment) {
		this.comment = comment;
	}
}
