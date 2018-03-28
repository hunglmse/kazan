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
@Table(name = "OBJECT")
public class KazanObject {
	
	@Id
	@GeneratedValue
	@Column(name="object_id")
	private Integer objectId;
	
	@Column(name="symbol")
	private String symbol;
	
	@Column(name="objprop_type")
	private Integer objprop_type;
	
	@Column(name="objprop_time1")
	@Temporal(TemporalType.TIMESTAMP)
	private Date objprop_time1;
	
	@Column(name="objprop_time2")
	@Temporal(TemporalType.TIMESTAMP)
	private Date objprop_time2;
	
	@Column(name="objprop_price1")
	private Double objprop_price1;
	
	@Column(name="objprop_price2")
	private Double objprop_price2;

	@Column(name="objprop_width")
	private Integer objprop_width;
	
	@Column(name="objprop_color")
	private Integer objprop_color;
	
	@Column(name="objprop_scale")
	private Double objprop_scale;	
	
	@Column(name="updated_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_date;

	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="group_id")
	private Integer groupId;

	public KazanObject(String symbol, Integer objprop_type, Date objprop_time1, Date objprop_time2,
			Double objprop_price1, Double objprop_price2, Integer objprop_width, Integer objprop_color,
			Double objprop_scale, Date updated_date, Integer userId, Integer groupId) {
		super();
		this.symbol = symbol;
		this.objprop_type = objprop_type;
		this.objprop_time1 = objprop_time1;
		this.objprop_time2 = objprop_time2;
		this.objprop_price1 = objprop_price1;
		this.objprop_price2 = objprop_price2;
		this.objprop_width = objprop_width;
		this.objprop_color = objprop_color;
		this.objprop_scale = objprop_scale;
		this.updated_date = updated_date;
		this.userId = userId;
		this.groupId = groupId;
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

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public Integer getObjectId() {
		return objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getObjprop_type() {
		return objprop_type;
	}

	public void setObjprop_type(Integer objprop_type) {
		this.objprop_type = objprop_type;
	}

	public Date getObjprop_time1() {
		return objprop_time1;
	}

	public void setObjprop_time1(Date objprop_time1) {
		this.objprop_time1 = objprop_time1;
	}

	public Date getObjprop_time2() {
		return objprop_time2;
	}

	public void setObjprop_time2(Date objprop_time2) {
		this.objprop_time2 = objprop_time2;
	}

	public Double getObjprop_price1() {
		return objprop_price1;
	}

	public void setObjprop_price1(Double objprop_price1) {
		this.objprop_price1 = objprop_price1;
	}

	public Double getObjprop_price2() {
		return objprop_price2;
	}

	public void setObjprop_price2(Double objprop_price2) {
		this.objprop_price2 = objprop_price2;
	}

	public Integer getObjprop_width() {
		return objprop_width;
	}

	public void setObjprop_width(Integer objprop_width) {
		this.objprop_width = objprop_width;
	}

	public Integer getObjprop_color() {
		return objprop_color;
	}

	public void setObjprop_color(Integer objprop_color) {
		this.objprop_color = objprop_color;
	}

	public Double getObjprop_scale() {
		return objprop_scale;
	}

	public void setObjprop_scale(Double objprop_scale) {
		this.objprop_scale = objprop_scale;
	}
	
}
