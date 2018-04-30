package com.kazan.component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import com.kazan.model.KazanGroup;
import com.kazan.repository.GroupRepository;
import com.kazan.utils.KazanBot;

@Component
public class TelegramSender {
	private Map<String, KazanBot> kazanBotMap;
	private TelegramBotsApi telegramBotsApi;
	
	@Autowired
	private GroupRepository groupRepository;
	
	@PostConstruct
    public void init(){
		ApiContextInitializer.init();
		kazanBotMap = new HashMap<String, KazanBot>();
		telegramBotsApi = new TelegramBotsApi();
		
		Set<String> botTokenSet = new HashSet<String>();
		List<KazanGroup> kazanGroups = groupRepository.getAll();
		for (KazanGroup kGroup: kazanGroups) {
			if (null != kGroup.getGroupNotifyBot() && "" != kGroup.getGroupNotifyBot()) {
				botTokenSet.add(kGroup.getGroupNotifyBot());
			}
			if (null != kGroup.getGroupAlertBot() && "" != kGroup.getGroupAlertBot()) {
				botTokenSet.add(kGroup.getGroupAlertBot());
			}
		}		
		
		for (String botToken: botTokenSet) {
			KazanBot kazanBot = new KazanBot("KazanBot", botToken);
			try {
				telegramBotsApi.registerBot(kazanBot);
				kazanBotMap.put(botToken, kazanBot);
	        } catch (TelegramApiException e) {
	        	System.out.println("TelegramSender.init:" + e);
	        }
		}		
	}
	
	public void sendMessage(String botToken, String chatId, String content) {
		if (kazanBotMap.containsKey(botToken)) {
			KazanBot kazanBot = kazanBotMap.get(botToken);
			try {
				kazanBot.execute(new SendMessage().setChatId(chatId).setText(content));
			} catch (TelegramApiException e) {
				System.out.println("TelegramSender.sendMessage, containsKey:" + e);
			}
		} else {
			KazanBot kazanBot = new KazanBot("KazanBot", botToken);
			try {
				telegramBotsApi.registerBot(kazanBot);
				kazanBotMap.put(botToken, kazanBot);
				kazanBot.execute(new SendMessage().setChatId(chatId).setText(content));
	        } catch (TelegramApiException e) {
	        	System.out.println("TelegramSender.sendMessage, not containsKey:" + e);
	        }
		}
	} 
}
