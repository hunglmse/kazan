package com.kazan.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER_GROUP_ROLE")
public class UserGroupRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6698307116255363423L;

	@Id
	@Column(name="telegram_id")
	private Integer telegramId;	
	
	@Id
	@Column(name="group_id")
	private Integer groupId;	
	
	@Id
	@Column(name="role_id")
	private Integer roleId;	
	
	@Column(name="group_alias")
	private String groupAlias;
	
	@Column(name="symbol_master")
	private String symbolMaster;
	
	@Column(name = "expiry_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;

	public Integer getTelegramId() {
		return telegramId;
	}

	public void setTelegramId(Integer telegramId) {
		this.telegramId = telegramId;
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

	public String getSymbolMaster() {
		return symbolMaster;
	}

	public void setSymbolMaster(String symbolMaster) {
		this.symbolMaster = symbolMaster;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
