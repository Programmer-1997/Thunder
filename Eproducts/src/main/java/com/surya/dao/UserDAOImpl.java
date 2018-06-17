package com.surya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.surya.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sf;

	public void delete(User user) {

	}

	public User getUser() {
		return null;
	}

	//save the user
	public void save(User user) {

		//Hibernate code
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);//Puts into the db

		tx.commit();
		session.close();
		System.out.println("User is finally saved in the databse!");

	}

	public void update(User user) {

	}
}
