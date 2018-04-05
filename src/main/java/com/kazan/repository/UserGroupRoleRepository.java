package com.kazan.repository;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.UserGroupRole;

@Repository
public class UserGroupRoleRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int getGroupIdByUserIdAlias(int userId, String groupAlias) {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("from UserGroupRole where userId = :userIdToSelect and groupAlias = :aliasToSelect ");
			query.setParameter("userIdToSelect", userId);
			query.setParameter("aliasToSelect", groupAlias);
			query.setMaxResults(1);
			UserGroupRole result = (UserGroupRole) query.uniqueResult();
			if (null == result)
				return -1;
			else
				return result.getGroupId();
		} catch (Exception e) {		
			System.out.println("UserGroupRoleRepository.getGroupIdByUserIdAlias:" + e);
			return -1;
		}
	}
}
