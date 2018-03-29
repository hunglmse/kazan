package com.kazan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "OBJECT")
public class KazanObject {

	@Id
	@GeneratedValue
	@Column(name = "object_id")
	private Integer objectId;

	@Column(name = "symbol")
	private String symbol;

	@Column(name = "objprop_type")
	private Integer objprop_type;

	@Column(name = "objprop_time1")
	@Temporal(TemporalType.TIMESTAMP)
	private Date objprop_time1;

	@Column(name = "objprop_time2")
	@Temporal(TemporalType.TIMESTAMP)
	private Date objprop_time2;

	@Column(name = "objprop_time3")
	@Temporal(TemporalType.TIMESTAMP)
	private Date objprop_time3;

	@Column(name = "objprop_price1")
	private Double objprop_price1;

	@Column(name = "objprop_price2")
	private Double objprop_price2;

	@Column(name = "objprop_price3")
	private Double objprop_price3;

	@Column(name = "objprop_style")
	private Integer objprop_style;

	@Column(name = "objprop_width")
	private Integer objprop_width;

	@Column(name = "objprop_ray_right")
	private Integer objprop_ray_right;

	@Column(name = "objprop_color")
	private Integer objprop_color;

	@Column(name = "objprop_back")
	private Integer objprop_back;

	@Column(name = "objprop_text")
	private String objprop_text;

	@Column(name = "objprop_font")
	private String objprop_font;

	@Column(name = "objprop_fontsize")
	private Integer objprop_fontsize;

	@Column(name = "objprop_angle")
	private Double objprop_angle;

	@Column(name = "objprop_scale")
	private Double objprop_scale;

	@Column(name = "objprop_deviation")
	private Double objprop_deviation;

	@Column(name = "objprop_direction")
	private Integer objprop_direction;

	@Column(name = "objprop_ellipse")
	private Integer objprop_ellipse;

	@Column(name = "objprop_corner")
	private Integer objprop_corner;

	@Column(name = "objprop_fibolevels")
	private Integer objprop_fibolevels;

	@Column(name = "objprop_levelcolor")
	private Integer objprop_levelcolor;

	@Column(name = "objprop_levelstyle")
	private Integer objprop_levelstyle;

	@Column(name = "objprop_levelwidth")
	private Integer objprop_levelwidth;

	@Column(name = "updated_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_date;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "group_id")
	private Integer groupId;

	public KazanObject() {

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

	@JsonIgnore
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

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_type() {
		return objprop_type;
	}

	public void setObjprop_type(Integer objprop_type) {
		this.objprop_type = objprop_type;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Date getObjprop_time1() {
		return objprop_time1;
	}

	public void setObjprop_time1(Date objprop_time1) {
		this.objprop_time1 = objprop_time1;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Date getObjprop_time2() {
		return objprop_time2;
	}

	public void setObjprop_time2(Date objprop_time2) {
		this.objprop_time2 = objprop_time2;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Double getObjprop_price1() {
		return objprop_price1;
	}

	public void setObjprop_price1(Double objprop_price1) {
		this.objprop_price1 = objprop_price1;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Double getObjprop_price2() {
		return objprop_price2;
	}

	public void setObjprop_price2(Double objprop_price2) {
		this.objprop_price2 = objprop_price2;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_width() {
		return objprop_width;
	}

	public void setObjprop_width(Integer objprop_width) {
		this.objprop_width = objprop_width;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_color() {
		return objprop_color;
	}

	public void setObjprop_color(Integer objprop_color) {
		this.objprop_color = objprop_color;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Double getObjprop_scale() {
		return objprop_scale;
	}

	public void setObjprop_scale(Double objprop_scale) {
		this.objprop_scale = objprop_scale;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Date getObjprop_time3() {
		return objprop_time3;
	}

	public void setObjprop_time3(Date objprop_time3) {
		this.objprop_time3 = objprop_time3;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Double getObjprop_price3() {
		return objprop_price3;
	}

	public void setObjprop_price3(Double objprop_price3) {
		this.objprop_price3 = objprop_price3;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_style() {
		return objprop_style;
	}

	public void setObjprop_style(Integer objprop_style) {
		this.objprop_style = objprop_style;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_ray_right() {
		return objprop_ray_right;
	}

	public void setObjprop_ray_right(Integer objprop_ray_right) {
		this.objprop_ray_right = objprop_ray_right;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_back() {
		return objprop_back;
	}

	public void setObjprop_back(Integer objprop_back) {
		this.objprop_back = objprop_back;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public String getObjprop_text() {
		return objprop_text;
	}

	public void setObjprop_text(String objprop_text) {
		this.objprop_text = objprop_text;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public String getObjprop_font() {
		return objprop_font;
	}

	public void setObjprop_font(String objprop_font) {
		this.objprop_font = objprop_font;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_fontsize() {
		return objprop_fontsize;
	}

	public void setObjprop_fontsize(Integer objprop_fontsize) {
		this.objprop_fontsize = objprop_fontsize;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Double getObjprop_angle() {
		return objprop_angle;
	}

	public void setObjprop_angle(Double objprop_angle) {
		this.objprop_angle = objprop_angle;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Double getObjprop_deviation() {
		return objprop_deviation;
	}

	public void setObjprop_deviation(Double objprop_deviation) {
		this.objprop_deviation = objprop_deviation;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_direction() {
		return objprop_direction;
	}

	public void setObjprop_direction(Integer objprop_direction) {
		this.objprop_direction = objprop_direction;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_ellipse() {
		return objprop_ellipse;
	}

	public void setObjprop_ellipse(Integer objprop_ellipse) {
		this.objprop_ellipse = objprop_ellipse;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_corner() {
		return objprop_corner;
	}

	public void setObjprop_corner(Integer objprop_corner) {
		this.objprop_corner = objprop_corner;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_fibolevels() {
		return objprop_fibolevels;
	}

	public void setObjprop_fibolevels(Integer objprop_fibolevels) {
		this.objprop_fibolevels = objprop_fibolevels;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_levelcolor() {
		return objprop_levelcolor;
	}

	public void setObjprop_levelcolor(Integer objprop_levelcolor) {
		this.objprop_levelcolor = objprop_levelcolor;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_levelstyle() {
		return objprop_levelstyle;
	}

	public void setObjprop_levelstyle(Integer objprop_levelstyle) {
		this.objprop_levelstyle = objprop_levelstyle;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public Integer getObjprop_levelwidth() {
		return objprop_levelwidth;
	}
	
	public void setObjprop_levelwidth(Integer objprop_levelwidth) {
		this.objprop_levelwidth = objprop_levelwidth;
	}

}
