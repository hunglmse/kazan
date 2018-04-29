package com.kazan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Message {
	
	private Integer messageId;	
	private Date messageTime;
	private String note;
	private String content;
	private String imageUrl;
	
	private Integer telegramId;
	private String groupName;
	private Integer countSend;
	
	private String telegramTokenBot;
	private Integer messageType;
	
	public Integer getTelegramId() {
		return telegramId;
	}

	public void setTelegramId(Integer telegramId) {
		this.telegramId = telegramId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getCountSend() {
		return countSend;
	}

	public void setCountSend(Integer countSend) {
		this.countSend = countSend;
	}
	public void addCountSend() {
		this.countSend = this.countSend+1;
	}

	public String getTelegramTokenBot() {
		return telegramTokenBot;
	}

	public void setTelegramTokenBot(String telegramTokenBot) {
		this.telegramTokenBot = telegramTokenBot;
	}	
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

	

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}
	
	public boolean equals(Message message) {
		if(null == message || null == message.getTelegramId()) return false;
	    if(this.telegramId == message.telegramId) return true;
	    return false;
	}
}
