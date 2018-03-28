package com.kazan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ALERT")
public class Alert {
	
	@Id
	@GeneratedValue
	@Column(name="alert_id")
	private Integer alertId;	
	
	@Column(name = "alert_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date alertTime;
	
	@Column(name="content")
	private String content;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="group_id")
	private Integer groupId;
	
	@Column(name="sended")
	private Integer sended;
	
	@Column(name="alert_type")
	private Integer alertType;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getSended() {
		return sended;
	}

	public void setSended(Integer sended) {
		this.sended = sended;
	}

	public Integer getAlertType() {
		return alertType;
	}

	public void setAlertType(Integer alertType) {
		this.alertType = alertType;
	}

	public Integer getAlertId() {
		return alertId;
	}

	public void setAlertId(Integer alertId) {
		this.alertId = alertId;
	}

	public Date getAlertTime() {
		return alertTime;
	}

	public void setAlertTime(Date actionTime) {
		this.alertTime = actionTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

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
	
	
}
