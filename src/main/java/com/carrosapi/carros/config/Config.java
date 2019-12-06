package com.carrosapi.carros.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
class Config {
	
	@Value("tcp://localhost:61616")
	private String brokerUrl;
	
	String BROKER_USERNAME = "admin"; 
	String BROKER_PASSWORD = "admin";
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("standalone.queue");
	}
	
	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory() {
		
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		factory.setBrokerURL(brokerUrl);
		factory.setUserName(BROKER_USERNAME);
		factory.setPassword(BROKER_PASSWORD);
		return factory;
	}
	
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		
	    DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
	    defaultJmsListenerContainerFactory.setConnectionFactory(activeMQConnectionFactory());
	    defaultJmsListenerContainerFactory.setConcurrency("1-1");
	    
	    return defaultJmsListenerContainerFactory;
	}
}












