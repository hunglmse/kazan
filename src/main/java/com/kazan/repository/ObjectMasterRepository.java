package com.kazan.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.ObjectMaster;

@Repository
public class ObjectMasterRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectMaster> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from ObjectMaster").list();
	}

	@Transactional
	public int deleteBySymbol(String symbol) {
		String hql = "delete from ObjectMaster where symbol= :symbolToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql).setString("symbolToDelete", symbol).executeUpdate();
	}

	@Transactional
	public int deleteBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		String hql = "delete from ObjectMaster where symbol= :symbolToDelete and user_id = :userIdToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("userIdToDelete", userId).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@Transactional
	public int deleteBySymbolGroup(String symbol, Integer groupId) {
		String hql = "delete from ObjectMaster where symbol= :symbolToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectMaster> getBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from ObjectMaster where symbol = :symbolToSelect and user_id = :userIdToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("userIdToSelect", userId);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectMaster> getBySymbolGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from ObjectMaster where symbol = :symbolToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@Transactional
	public ObjectMaster add(ObjectMaster t) {
		sessionFactory.getCurrentSession().persist(t);
		sessionFactory.getCurrentSession().flush();
		return t;
	}

}
