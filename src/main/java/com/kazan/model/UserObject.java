package com.kazan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class UserObject {
	@Column(name = "updated_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_date;

	@Column(name = "user_id")
	private Integer userId;
	
	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
