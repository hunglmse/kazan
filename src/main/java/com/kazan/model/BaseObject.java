package com.kazan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("deprecation")
@MappedSuperclass
public class BaseObject {
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

	public BaseObject() {

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

	protected void copyProperties(BaseObject bo) {
		this.setGroupId(bo.getGroupId());
		this.setObjectId(bo.getObjectId());
		this.setObjprop_angle(bo.getObjprop_angle());
		this.setObjprop_back(bo.getObjprop_back());
		this.setObjprop_color(bo.getObjprop_color());
		this.setObjprop_corner(bo.getObjprop_corner());
		this.setObjprop_deviation(bo.getObjprop_deviation());
		this.setObjprop_direction(bo.getObjprop_direction());
		this.setObjprop_ellipse(bo.getObjprop_ellipse());
		this.setObjprop_fibolevels(bo.getObjprop_fibolevels());
		this.setObjprop_font(bo.getObjprop_font());
		this.setObjprop_fontsize(bo.getObjprop_fontsize());
		this.setObjprop_levelcolor(bo.getObjprop_levelcolor());
		this.setObjprop_levelstyle(bo.getObjprop_levelstyle());
		this.setObjprop_levelwidth(bo.getObjprop_levelwidth());
		this.setObjprop_price1(bo.getObjprop_price1());
		this.setObjprop_price2(bo.getObjprop_price2());
		this.setObjprop_price3(bo.getObjprop_price3());
		this.setObjprop_ray_right(bo.getObjprop_ray_right());
		this.setObjprop_scale(bo.getObjprop_scale());
		this.setObjprop_style(bo.getObjprop_style());
		this.setObjprop_text(bo.getObjprop_text());
		this.setObjprop_time1(bo.getObjprop_time1());
		this.setObjprop_time2(bo.getObjprop_time2());
		this.setObjprop_time3(bo.getObjprop_time3());
		this.setObjprop_type(bo.getObjprop_type());
		this.setObjprop_width(bo.getObjprop_width());
		this.setSymbol(bo.getSymbol());
		this.setUpdated_date(bo.getUpdated_date());
		this.setUserId(bo.getUserId());		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((objectId == null) ? 0 : objectId.hashCode());
		result = prime * result + ((objprop_angle == null) ? 0 : objprop_angle.hashCode());
		result = prime * result + ((objprop_back == null) ? 0 : objprop_back.hashCode());
		result = prime * result + ((objprop_color == null) ? 0 : objprop_color.hashCode());
		result = prime * result + ((objprop_corner == null) ? 0 : objprop_corner.hashCode());
		result = prime * result + ((objprop_deviation == null) ? 0 : objprop_deviation.hashCode());
		result = prime * result + ((objprop_direction == null) ? 0 : objprop_direction.hashCode());
		result = prime * result + ((objprop_ellipse == null) ? 0 : objprop_ellipse.hashCode());
		result = prime * result + ((objprop_fibolevels == null) ? 0 : objprop_fibolevels.hashCode());
		result = prime * result + ((objprop_font == null) ? 0 : objprop_font.hashCode());
		result = prime * result + ((objprop_fontsize == null) ? 0 : objprop_fontsize.hashCode());
		result = prime * result + ((objprop_levelcolor == null) ? 0 : objprop_levelcolor.hashCode());
		result = prime * result + ((objprop_levelstyle == null) ? 0 : objprop_levelstyle.hashCode());
		result = prime * result + ((objprop_levelwidth == null) ? 0 : objprop_levelwidth.hashCode());
		result = prime * result + ((objprop_price1 == null) ? 0 : objprop_price1.hashCode());
		result = prime * result + ((objprop_price2 == null) ? 0 : objprop_price2.hashCode());
		result = prime * result + ((objprop_price3 == null) ? 0 : objprop_price3.hashCode());
		result = prime * result + ((objprop_ray_right == null) ? 0 : objprop_ray_right.hashCode());
		result = prime * result + ((objprop_scale == null) ? 0 : objprop_scale.hashCode());
		result = prime * result + ((objprop_style == null) ? 0 : objprop_style.hashCode());
		result = prime * result + ((objprop_text == null) ? 0 : objprop_text.hashCode());
		result = prime * result + ((objprop_time1 == null) ? 0 : objprop_time1.hashCode());
		result = prime * result + ((objprop_time2 == null) ? 0 : objprop_time2.hashCode());
		result = prime * result + ((objprop_time3 == null) ? 0 : objprop_time3.hashCode());
		result = prime * result + ((objprop_type == null) ? 0 : objprop_type.hashCode());
		result = prime * result + ((objprop_width == null) ? 0 : objprop_width.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((updated_date == null) ? 0 : updated_date.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseObject other = (BaseObject) obj;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (objectId == null) {
			if (other.objectId != null)
				return false;
		} else if (!objectId.equals(other.objectId))
			return false;
		if (objprop_angle == null) {
			if (other.objprop_angle != null)
				return false;
		} else if (!objprop_angle.equals(other.objprop_angle))
			return false;
		if (objprop_back == null) {
			if (other.objprop_back != null)
				return false;
		} else if (!objprop_back.equals(other.objprop_back))
			return false;
		if (objprop_color == null) {
			if (other.objprop_color != null)
				return false;
		} else if (!objprop_color.equals(other.objprop_color))
			return false;
		if (objprop_corner == null) {
			if (other.objprop_corner != null)
				return false;
		} else if (!objprop_corner.equals(other.objprop_corner))
			return false;
		if (objprop_deviation == null) {
			if (other.objprop_deviation != null)
				return false;
		} else if (!objprop_deviation.equals(other.objprop_deviation))
			return false;
		if (objprop_direction == null) {
			if (other.objprop_direction != null)
				return false;
		} else if (!objprop_direction.equals(other.objprop_direction))
			return false;
		if (objprop_ellipse == null) {
			if (other.objprop_ellipse != null)
				return false;
		} else if (!objprop_ellipse.equals(other.objprop_ellipse))
			return false;
		if (objprop_fibolevels == null) {
			if (other.objprop_fibolevels != null)
				return false;
		} else if (!objprop_fibolevels.equals(other.objprop_fibolevels))
			return false;
		if (objprop_font == null) {
			if (other.objprop_font != null)
				return false;
		} else if (!objprop_font.equals(other.objprop_font))
			return false;
		if (objprop_fontsize == null) {
			if (other.objprop_fontsize != null)
				return false;
		} else if (!objprop_fontsize.equals(other.objprop_fontsize))
			return false;
		if (objprop_levelcolor == null) {
			if (other.objprop_levelcolor != null)
				return false;
		} else if (!objprop_levelcolor.equals(other.objprop_levelcolor))
			return false;
		if (objprop_levelstyle == null) {
			if (other.objprop_levelstyle != null)
				return false;
		} else if (!objprop_levelstyle.equals(other.objprop_levelstyle))
			return false;
		if (objprop_levelwidth == null) {
			if (other.objprop_levelwidth != null)
				return false;
		} else if (!objprop_levelwidth.equals(other.objprop_levelwidth))
			return false;
		if (objprop_price1 == null) {
			if (other.objprop_price1 != null)
				return false;
		} else if (!objprop_price1.equals(other.objprop_price1))
			return false;
		if (objprop_price2 == null) {
			if (other.objprop_price2 != null)
				return false;
		} else if (!objprop_price2.equals(other.objprop_price2))
			return false;
		if (objprop_price3 == null) {
			if (other.objprop_price3 != null)
				return false;
		} else if (!objprop_price3.equals(other.objprop_price3))
			return false;
		if (objprop_ray_right == null) {
			if (other.objprop_ray_right != null)
				return false;
		} else if (!objprop_ray_right.equals(other.objprop_ray_right))
			return false;
		if (objprop_scale == null) {
			if (other.objprop_scale != null)
				return false;
		} else if (!objprop_scale.equals(other.objprop_scale))
			return false;
		if (objprop_style == null) {
			if (other.objprop_style != null)
				return false;
		} else if (!objprop_style.equals(other.objprop_style))
			return false;
		if (objprop_text == null) {
			if (other.objprop_text != null)
				return false;
		} else if (!objprop_text.equals(other.objprop_text))
			return false;
		if (objprop_time1 == null) {
			if (other.objprop_time1 != null)
				return false;
		} else if (!objprop_time1.equals(other.objprop_time1))
			return false;
		if (objprop_time2 == null) {
			if (other.objprop_time2 != null)
				return false;
		} else if (!objprop_time2.equals(other.objprop_time2))
			return false;
		if (objprop_time3 == null) {
			if (other.objprop_time3 != null)
				return false;
		} else if (!objprop_time3.equals(other.objprop_time3))
			return false;
		if (objprop_type == null) {
			if (other.objprop_type != null)
				return false;
		} else if (!objprop_type.equals(other.objprop_type))
			return false;
		if (objprop_width == null) {
			if (other.objprop_width != null)
				return false;
		} else if (!objprop_width.equals(other.objprop_width))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (updated_date == null) {
			if (other.updated_date != null)
				return false;
		} else if (!updated_date.equals(other.updated_date))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
}
