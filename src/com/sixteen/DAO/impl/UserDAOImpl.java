package com.sixteen.DAO.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;

import com.sixteen.DAO.IUserDAO;
import com.sixteen.entity.User;
import com.sixteen.utils.SessionFactoryUtil;

public class UserDAOImpl implements IUserDAO {
	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		StandardServiceRegistryImpl registryImpl = (StandardServiceRegistryImpl) builder
				.build();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(registryImpl);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
		return true;
	}

	@Override
	public User get(User user) {
		// TODO Auto-generated method stub
		User result;
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		result = (User) session.get(User.class, 1);
		transaction.commit();
		session.close();
		SessionFactoryUtil.getSessionFactory().close();
		return result;
	}

}
