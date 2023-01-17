package com.revature.app;

import java.sql.SQLException;

import com.revature.dao.UserDao;
import com.revature.dao.impl.UserDaoImpl;
import com.revature.model.User;
import com.revature.util.DateTimeUtil;

public class Main {

	public static void main(String[] args) {
		User user1=new User("user1","user1pass@123",DateTimeUtil.getCurrentDateTime()); 
		User user2=new User("user2","user2pass@123",DateTimeUtil.getCurrentDateTime()); 
		UserDao userDao= new  UserDaoImpl();
		try {
			//INSERT
			System.out.println("INSERT user1:"+userDao.add(user1));
			System.out.println("INSERT user2:"+userDao.add(user2));
			//SELECT SPECIFIC
			System.out.println("SELECT user1 :"+userDao.getUser("user1"));
			//SELECT ALL
			System.out.println("SELECT ALL :"+userDao.getUsers());
			//UPDATE
			System.out.println("UPDATE user1:"+userDao.update(new User("user1","newpass@123",DateTimeUtil.getCurrentDateTime())));
			//DELETE
			System.out.println("UPDATE user2:"+userDao.delete("user2"));
			//SELECT ALL
			System.out.println("SELECT ALL :"+userDao.getUsers());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
