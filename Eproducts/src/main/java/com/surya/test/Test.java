package com.surya.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.surya.config.DbConfig;
import com.surya.dao.UserDAO;
import com.surya.dao.UserDAOImpl;
import com.surya.model.User;

public class Test {

	@Autowired
	static User user;

	@Autowired
	static UserDAO userDao;

	public static void main(String[] args) {

		//ApplicationContext
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.surya.*");
		context.refresh();
		System.out.println("context loaded=" + context);

		//fetch the user  Bean
		User user = (User) context.getBean(User.class);
		
		//Prepare the user Bean
		user.setUserName("surya");
		user.setPassword("007");

		
		
		//Fetch the UserDAOImpl bean
		UserDAO udao = context.getBean(UserDAOImpl.class);
		//use the UserDAOImpl bean
		udao.save(user);

		System.out.println("User is  saved!");

	}

}
