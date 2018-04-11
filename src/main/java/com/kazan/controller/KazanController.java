package com.kazan.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kazan.model.Message;
import com.kazan.model.KazanObject;
import com.kazan.repository.MessageRepository;
import com.kazan.repository.ObjectRepository;
import com.kazan.repository.UserGroupRoleRepository;
import com.kazan.repository.UserRepository;
import com.kazan.wrapper.AlertRequestWrapper;
import com.kazan.wrapper.ObjectRequestWrapper;

@RestController    
@RequestMapping(path="/kazan")
public class KazanController {
	
	@Autowired
	private ObjectRepository objectRepository;
	
	@Autowired
	private MessageRepository alertRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserGroupRoleRepository ugrRepository;
	
	@RequestMapping(method=RequestMethod.POST, path="/alert/add")
	public @ResponseBody ResponseEntity<String> addAlert(@RequestBody AlertRequestWrapper alertWrapper) {
		Message newAlert = new Message();
		
		int telegramId = userRepository.getIdByUsername(alertWrapper.getUsername());
		if (-1 != telegramId) {
			newAlert.setTelegramId(telegramId);
		} else {
			return new ResponseEntity<String>("Username not found!", HttpStatus.UNAUTHORIZED);
		}
		
		int groupId = ugrRepository.getGroupIdByTelegramIdAlias(telegramId, alertWrapper.getGroupName());
		if (-1 != groupId) {
			newAlert.setGroupId(groupId);
		} else {
			return new ResponseEntity<String>("Group not found!", HttpStatus.UNAUTHORIZED);
		}
		
		newAlert.setMessageTime(new Date());
		newAlert.setContent(alertWrapper.getContent());
		newAlert.setImageUrl(alertWrapper.getImage_url());
		newAlert.setSended(0);
		newAlert.setMessageType(alertWrapper.getType());
		Message resultAlert = alertRepository.add(newAlert);
		if (null == resultAlert) {
			return new ResponseEntity<>("Error adding object!", HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<String>("Alert added successfully!", HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/object/syn")
	public @ResponseBody ResponseEntity<String> synObject(@RequestBody ObjectRequestWrapper wrapperObject) {
		int userId = userRepository.getIdByUsername(wrapperObject.getUsername());
		if (-1 == userId) {
			return new ResponseEntity<String>("Username not found!", HttpStatus.UNAUTHORIZED);
		}		
		int groupId = ugrRepository.getGroupIdByTelegramIdAlias(userId, wrapperObject.getGroupName());
		if (-1 == groupId) {
			return new ResponseEntity<String>("Group not found!", HttpStatus.UNAUTHORIZED);
		}
		try {
			objectRepository.deleteBySymbolGroup(wrapperObject.getSymbol(), groupId);
		} catch(Exception e) {
			System.out.println("KazanController.synObject:" + e);
			return new ResponseEntity<String>("Cannot delete object!", HttpStatus.UNAUTHORIZED);
		}
		List<KazanObject> objects = wrapperObject.getObjects();
		if (null != objects) {
			for (KazanObject ko : objects) {
				ko.setSymbol(wrapperObject.getSymbol());
				ko.setTelegramId(userId);
				ko.setGroupId(groupId);
				ko.setUpdated_date(new Date());
				objectRepository.add(ko);
			}
			Message newAlert = new Message();
			newAlert.setTelegramId(userId);
			newAlert.setGroupId(groupId);
			newAlert.setMessageTime(new Date());
			newAlert.setContent(wrapperObject.getUsername() + " updated data for " + wrapperObject.getSymbol() + " on " + wrapperObject.getPeriod());
			newAlert.setMessageType(1);
			newAlert.setSended(0);
			Message resultAlert = alertRepository.add(newAlert);
			if (null == resultAlert) {
				return new ResponseEntity<String>("Error adding new alert after synchronizing object list!", HttpStatus.UNAUTHORIZED);
			}
		} else {
			return new ResponseEntity<String>("Just delete object list since no object received!", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Object list synchronized!", HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/object/get")
	public @ResponseBody ResponseEntity<String> getObject(@RequestBody ObjectRequestWrapper wrapperObject) {
		int userId = userRepository.getIdByUsername(wrapperObject.getUsername());
		if (-1 == userId) {
			return new ResponseEntity<String>("Username not found!", HttpStatus.UNAUTHORIZED);
		}		
		int groupId = ugrRepository.getGroupIdByTelegramIdAlias(userId, wrapperObject.getGroupName());
		if (-1 == groupId) {
			return new ResponseEntity<String>("Group not found!", HttpStatus.UNAUTHORIZED);
		}
		ObjectMapper mapper = new ObjectMapper();
		try {
			return new ResponseEntity<String>(mapper.writeValueAsString(objectRepository.getBySymbolGroup(wrapperObject.getSymbol(), userId, groupId)), HttpStatus.ACCEPTED);
		} catch (JsonProcessingException e) {
			System.out.println("KazanController.getObject:" + e);
			return new ResponseEntity<String>("Error getting object!", HttpStatus.UNAUTHORIZED);
		}
	}
}
