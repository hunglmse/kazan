package com.kazan.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.KazanObject;

@Repository
public class ObjectRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<KazanObject> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from KazanObject").list();
	}

	@Transactional
	public int deleteBySymbol(String symbol) {
		String hql = "delete from KazanObject where symbol= :symbolToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql).setString("symbolToDelete", symbol).executeUpdate();
	}

	@Transactional
	public int deleteBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		String hql = "delete from KazanObject where symbol= :symbolToDelete and user_id = :userIdToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("userIdToDelete", userId).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<KazanObject> getBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from KazanObject where symbol = :symbolToSelect and user_id = :userIdToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("userIdToSelect", userId);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@Transactional
	public KazanObject add(KazanObject t) {
		sessionFactory.getCurrentSession().persist(t);
		sessionFactory.getCurrentSession().flush();
		return t;
	}
}
