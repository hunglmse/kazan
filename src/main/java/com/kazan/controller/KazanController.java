package com.kazan.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kazan.model.Alert;
import com.kazan.model.KazanObject;
import com.kazan.repository.AlertRepository;
import com.kazan.repository.ObjectRepository;
import com.kazan.repository.UserGroupRoleRepository;
import com.kazan.repository.UserRepository;
import com.kazan.utils.KazanStringUtils;
import com.kazan.wrapper.AlertRequestWrapper;
import com.kazan.wrapper.ObjectWrapper;
import com.kazan.wrapper.ObjectRequestWrapper;

@RestController    
@RequestMapping(path="/kazan")
public class KazanController {
	
	@Autowired
	private ObjectRepository objectRepository;
	
	@Autowired
	private AlertRepository alertRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserGroupRoleRepository ugrRepository;
	
	@RequestMapping(path="/alert/all")
	public @ResponseBody List<Alert> getAllAlerts() {
		return alertRepository.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/alert/add")
	public @ResponseBody ResponseEntity<String> addAlert(@RequestBody AlertRequestWrapper alertWrapper) {
		Alert newAlert = new Alert();
		try {
			int userId = userRepository.getIdByUsername(alertWrapper.getUsername());
			newAlert.setUserId(userId);
			try {
				int groupId = ugrRepository.getGroupIdByUserIdAlias(userId, alertWrapper.getGroupname());
				newAlert.setGroupId(groupId);
			} catch(Exception e) {
				return new ResponseEntity<>("Khong tim thay group_id!", HttpStatus.UNAUTHORIZED);
			}
		} catch(Exception e) {
			return new ResponseEntity<>("Khong tim thay username!", HttpStatus.UNAUTHORIZED);
		}		
		newAlert.setAlertTime(new Date());
		newAlert.setContent(alertWrapper.getContent());
		newAlert.setImageUrl(alertWrapper.getImage_url());
		newAlert.setSended(0);
		newAlert.setAlertType(alertWrapper.getType());
		Alert resultAlert = alertRepository.add(newAlert);
		if (null == resultAlert) {
			return new ResponseEntity<>("Co loi khi them alert!", HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<String>("Them alert thanh cong!", HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(path="/object/all")
	public @ResponseBody Iterable<KazanObject> getAllObjects() {
		return objectRepository.getAll();
	}
	
	@RequestMapping(path="/object/symbol")
	public @ResponseBody List<KazanObject> getObjectsBySymbol(@RequestParam String symbol) {
		return objectRepository.getBySymbol(symbol);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/object/add")
	public @ResponseBody ResponseEntity<String> addObject(@RequestBody ObjectRequestWrapper wrapperObject) {
		int userId = -1;
		try {
			userId = userRepository.getIdByUsername(wrapperObject.getUsername());
		} catch(Exception e) {
			return new ResponseEntity<String>("Khong tim thay username!", HttpStatus.UNAUTHORIZED);
		}	
		int groupId = -1;
		try {
			groupId = ugrRepository.getGroupIdByUserIdAlias(userId, wrapperObject.getGroupName());
		} catch(Exception e) {
			return new ResponseEntity<>("Khong tim thay group_id!", HttpStatus.UNAUTHORIZED);
		}
		try {
			objectRepository.deleteBySymbolUserGroup(wrapperObject.getSymbol(), userId, groupId);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Khong the xoa object!", HttpStatus.UNAUTHORIZED);
		}
		List<ObjectWrapper> objects = wrapperObject.getObjects();
		for (ObjectWrapper ow : objects) {
			KazanObject ko = new KazanObject(ow.getSymbol(), ow.getObjprop_type(), 
											KazanStringUtils.formatDate(ow.getObjprop_time1()), KazanStringUtils.formatDate(ow.getObjprop_time2()),
											ow.getObjprop_price1(), ow.getObjprop_price2(), ow.getObjprop_width(), ow.getObjprop_color(), 
											ow.getObjprop_scale(), new Date(), userId, groupId);
			objectRepository.add(ko);
		}
		return new ResponseEntity<String>("Cap nhat object thanh cong!", HttpStatus.ACCEPTED);
	}
	
	@GetMapping(path="/object/delete")
	public @ResponseBody int deleteObject(@RequestParam String symbol) {		
		return objectRepository.deleteBySymbol(symbol);
	}
}
