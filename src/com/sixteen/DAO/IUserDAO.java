package com.sixteen.DAO;

import com.sixteen.entity.User;

public interface IUserDAO {
	public boolean save(User user) ;
	public User	   get (User user) ;	
}
