package dmacc.GH_Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.mClass;
import dmacc.controller.BeanConfiguration;
import dmacc.controller.driver;
import dmacc.repository.mClassRepository;

@SpringBootApplication
public class GhClassesApplication implements CommandLineRunner{
	
	@Autowired
	mClassRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(GhClassesApplication.class, args);
		
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		mClass m = appContext.getBean("character", mClass.class);
		repo.save(m);
		System.out.println(m.toString());	
	
	}

}
