package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import dmacc.beans.mClass;
import dmacc.repository.mClassRepository;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 24, 2023
 */
@Controller
public class driver {

	@Autowired
	mClassRepository repo;
	
	public void go() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		mClass m = appContext.getBean("character", mClass.class);
		repo.save(m);
		System.out.println(m.toString());	
	
	}
}
