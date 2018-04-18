package com.kazan.wrapper;

import java.util.List;

import com.kazan.model.KazanObject;

public class ObjectRequestWrapper {
	private String username;
	private String password;
	private String groupName;
	private String symbol;
	private Integer mode;
	private String accountName;
	private String accountNumber;
	private String accountServer;
	private List<KazanObject> objects;
	private String period;	
	private List<String> groupAliases;	
	public List<String> getGroupAliases() {
		return groupAliases;
	}
	public void setGroupAliases(List<String> groupNames) {
		this.groupAliases = groupNames;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountServer() {
		return accountServer;
	}
	public void setAccountServer(String accountServer) {
		this.accountServer = accountServer;
	}
	public List<KazanObject> getObjects() {
		return objects;
	}
	public void setObjects(List<KazanObject> objects) {
		this.objects = objects;
	}	
}
