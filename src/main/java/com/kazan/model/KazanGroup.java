package com.kazan.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPS")
public class KazanGroup {
	@Id
	@GeneratedValue
	@Column(name="group_id")
	private Integer groupId;
	
	@Column(name="group_name")
	private String groupName;
	
	@Column(name="group_notify_bot")
	private String groupNotifyBot;
	
	@Column(name="group_alert_bot")
	private String groupAlertBot;
	
	@Column(name="group_image")
	private String groupImage;
	
	@Column(name="mt4_account")
	private String mt4Account;
	
	@Column(name="mt4_server")
	private String mt4Server;
	
	@Column(name="mt4_password")
	private String mt4Password;
	
	@Column(name="notify_value")
	private Double notifyValue;
	
	@Column(name="notify_object_type")
	private String notifyObjectType;
	
	@Column(name="notify_re_time")
	private String notifyReTime;
	
	@Column(name="creater")
	private String creater;
	
	@Column(name="group_private")
	private String groupPrivate;
	
	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupNotifyBot() {
		return groupNotifyBot;
	}

	public void setGroupNotifyBot(String groupNotifyBot) {
		this.groupNotifyBot = groupNotifyBot;
	}

	public String getGroupAlertBot() {
		return groupAlertBot;
	}

	public void setGroupAlertBot(String groupAlertBot) {
		this.groupAlertBot = groupAlertBot;
	}

	public String getGroupImage() {
		return groupImage;
	}

	public void setGroupImage(String groupImage) {
		this.groupImage = groupImage;
	}

	public String getMt4Account() {
		return mt4Account;
	}

	public void setMt4Account(String mt4Account) {
		this.mt4Account = mt4Account;
	}

	public String getMt4Server() {
		return mt4Server;
	}

	public void setMt4Server(String mt4Server) {
		this.mt4Server = mt4Server;
	}

	public String getMt4Password() {
		return mt4Password;
	}

	public void setMt4Password(String mt4Password) {
		this.mt4Password = mt4Password;
	}

	public Double getNotifyValue() {
		return notifyValue;
	}

	public void setNotifyValue(Double notifyValue) {
		this.notifyValue = notifyValue;
	}

	public String getNotifyObjectType() {
		return notifyObjectType;
	}

	public void setNotifyObjectType(String notifyObjectType) {
		this.notifyObjectType = notifyObjectType;
	}

	public String getNotifyReTime() {
		return notifyReTime;
	}

	public void setNotifyReTime(String notifyReTime) {
		this.notifyReTime = notifyReTime;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getGroupPrivate() {
		return groupPrivate;
	}

	public void setGroupPrivate(String groupPrivate) {
		this.groupPrivate = groupPrivate;
	}
	
	public String getTokenBot(int botType) {
		if(null == groupNotifyBot && null == groupAlertBot) return "";
		if(botType==1) {
			if(null != groupNotifyBot) {
				return groupAlertBot;
			} else {
				return groupNotifyBot;
			}
		}else if(botType==2) {
			if(null != groupAlertBot) {
				return groupNotifyBot;
			} else {
				return groupAlertBot;
			}
		}
		return "";
	}
	
	
}
