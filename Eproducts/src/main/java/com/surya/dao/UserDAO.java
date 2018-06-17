package com.surya.dao;

import com.surya.model.User;

///Operation ProtoType
public interface UserDAO {

	void save(User user);

	void update(User user);

	void delete(User user);

	User getUser();

}
