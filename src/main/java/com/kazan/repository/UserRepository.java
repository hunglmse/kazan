package com.kazan.repository;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.KazanUser;

@Repository
public class UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int getIdByUsername(String username) {
		KazanUser result = (KazanUser) geByUsername(username);
		if (null == result)
			return -1;
		else
			return result.getTelegramId();
	}
	
	@Transactional
	public KazanUser geByUsername(String username) {
		Query query = sessionFactory.getCurrentSession().createQuery("from KazanUser where username = :usernameToSelect ");
		query.setParameter("usernameToSelect", username);
		return (KazanUser) query.uniqueResult();
	}

}
