package com.kazan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_GROUP_ROLE")
public class UserGroupRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6698307116255363423L;

	@Id
	@Column(name="user_id")
	private Integer userId;	
	
	@Id
	@Column(name="group_id")
	private Integer groupId;	
	
	@Id
	@Column(name="role_id")
	private Integer roleId;	
	
	@Column(name="group_alias")
	private String groupAlias;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getGroupAlias() {
		return groupAlias;
	}

	public void setGroupAlias(String groupAlias) {
		this.groupAlias = groupAlias;
	}
	
}
