package com.kazan.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.ObjectNormal;

@Repository
public class ObjectNormalRepository implements AbstractObjectRepository<ObjectNormal> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectNormal> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from ObjectNormal").list();
	}

	@Transactional
	public int deleteBySymbol(String symbol) {
		String hql = "delete from ObjectNormal where symbol= :symbolToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql).setString("symbolToDelete", symbol).executeUpdate();
	}

	@Transactional
	public int deleteBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		String hql = "delete from ObjectNormal where symbol= :symbolToDelete and user_id = :userIdToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("userIdToDelete", userId).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@Transactional
	public int deleteBySymbolGroup(String symbol, Integer groupId) {
		String hql = "delete from ObjectNormal where symbol= :symbolToDelete and group_id = :groupIdToDelete";
		return sessionFactory.getCurrentSession().createQuery(hql)
				.setString("symbolToDelete", symbol).setInteger("groupIdToDelete", groupId)
				.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectNormal> getBySymbolUserGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from ObjectNormal where symbol = :symbolToSelect and user_id = :userIdToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("userIdToSelect", userId);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<ObjectNormal> getBySymbolGroup(String symbol, Integer userId, Integer groupId) {
		Query query = sessionFactory.getCurrentSession().createQuery("from ObjectNormal where symbol = :symbolToSelect and group_id = :groupIdToSelect ");
		query.setString("symbolToSelect", symbol);
		query.setInteger("groupIdToSelect", groupId);
		return query.list();
	}

	@Transactional
	public ObjectNormal add(ObjectNormal t) {
		sessionFactory.getCurrentSession().persist(t);
		sessionFactory.getCurrentSession().flush();
		return t;
	}
	
	@Transactional
	public String [][] getUserIdAndUpdateTime(String symbol, Integer groupId) {
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("SELECT u.username, (o.updated_date - to_date('1970-01-01', 'YYYY-MM-DD')) * 86400000"
																			+ " FROM object o JOIN users u on o.user_id = u.user_id"
																			+ " WHERE o.group_id = " + groupId + " and o.symbol = '" + symbol + "'"
																			+ " GROUP BY o.updated_date, o.user_id, u.username"
																			+ " ORDER BY o.updated_date desc");
		List<Object> queryResult = query.list();
		String [][] userUpdate = new String [queryResult.size()][2];
		for (int i = 0; i < queryResult.size(); i++) {
			Object [] record = (Object []) queryResult.get(i);
			userUpdate[i][0] = record[0].toString();
			userUpdate[i][1] = record[1].toString();
		}
		return userUpdate;
	}
}
