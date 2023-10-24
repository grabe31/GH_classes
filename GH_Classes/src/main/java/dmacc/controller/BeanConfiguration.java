package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Card;
import dmacc.beans.mClass;
/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 22, 2023
 */

@Configuration
public class BeanConfiguration {
	@Bean
	public mClass character() {
		mClass bean = new mClass();
		bean.setClassName("MindTheif");
		bean.setHealth(6);
		bean.setStamina(9);
		bean.setStarter(true);
		return bean;
	}
	
	@Bean
	public Card card() {
		Card bean = new Card();
		bean.setCardName("The Mind's Weakness");
		return bean;
	}
}
