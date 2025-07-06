package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.constants.AppContants;

@Configuration
public class KafkaConfig {
	
	
	@KafkaListener(topics=AppContants.UPDATE_TOPIC_NAME,groupId = AppContants.GROUP_ID)
	public void updateLocation(String location) {
		System.out.println(location); //It will print the published data in console
	}

}
