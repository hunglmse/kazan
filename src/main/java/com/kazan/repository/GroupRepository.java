package com.kazan.repository;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kazan.model.KazanGroup;

@Repository
public class GroupRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public KazanGroup getGroupById(int groupId) {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("from KazanGroup where group_id = :groupIdToSelect");
			query.setParameter("groupIdToSelect", groupId);
			query.setMaxResults(1);
			KazanGroup result = (KazanGroup) query.uniqueResult();
			if (null == result)
				return new KazanGroup();
			else
				return result;
		} catch (Exception e) {		
			System.out.println("UserGroupRoleRepository.getGroupIdByTelegramIdAlias:" + e);
			return new KazanGroup();
		}
	}
}
