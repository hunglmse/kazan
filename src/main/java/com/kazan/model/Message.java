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
@Table(name = "MESSAGE")
public class Message {
	
	@Id
	@GeneratedValue
	@Column(name="message_id")
	private Integer messageId;	
	
	@Column(name = "message_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date messageTime;
	
	@Column(name="note")
	private String note;
	
	@Column(name="content")
	private String content;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="telegram_id")
	private Integer telegramId;
	
	@Column(name="group_id")
	private Integer groupId;
	
	@Column(name="sended")
	private Integer sended;
	
	@Column(name="message_type")
	private Integer messageType;

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Date getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

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

	public Integer getSended() {
		return sended;
	}

	public void setSended(Integer sended) {
		this.sended = sended;
	}

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}
	
}
