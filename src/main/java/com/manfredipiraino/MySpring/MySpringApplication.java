package com.manfredipiraino.MySpring;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MySpringApplication {

	static final Logger logger = LoggerFactory.getLogger(MySpringApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
		System.out.println("Hello Spring!");
		
		/*ApplicationContext myCtx = SpringApplication.run(MySpringApplication.class, args);		 
	    String[] myBeanNames = myCtx.getBeanDefinitionNames();      
	    Arrays.sort(myBeanNames);      
	    for (String myBeanName : myBeanNames) {
	    	System.out.println("Nome bean: " + myBeanName);
	    }
		    
	    AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(MyConfig.class);
	    /*Old POJO approach*/
		/*MyClass myClassPOJO =  new MyClass();
		logger.info("myClassPOJO.myClassMethod: "+myClassPOJO.myClassMethod("Class POJO"));*/

	    /*SPRING APPROACH
	    // Crea ApplicationContext in base alla classe di Configurazione
	 	AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(MyConfig.class);

	 	MyClass myClassBean= myContext.getBean(MyClass.class);
	 	logger.info("myClass.myClassMethod: "+ myClassBean.myClassMethod("Class Spring"));
	 	
	 	/* Scope 
		// myClass 1
		MyClass myClass1 = myContext.getBean(MyClass.class);
		logger.info("--- myClass1 Scope: " + myClass1);
		// myClass 2
		MyClass myClass2 = myContext.getBean(MyClass.class);
		logger.info("--- myClass2 Scope: " + myClass2);
		
		myClass1.myClassMethod("Class bean Scope");			
		//logger.info("--- myClass1.getMyString: " + myClass1.getMyString());
		//logger.info("--- myClass2.getMyString: " + myClass2.getMyString());
		
		myClass1.setMyInt(1);
		logger.info("--- myClass1.getMyInt: " + myClass1.getMyInt());
		logger.info("--- myClass2.getMyInt: " + myClass2.getMyInt());
		
		myClass1.incrementMyInt();
		logger.info("--- myClass1.getMyInt: " + myClass1.getMyInt());
		logger.info("--- myClass2.getMyInt: " + myClass2.getMyInt());
		*/
/*
	    myContext.scan("com.manfredipiraino.MySpring");
		MyComponent myComponent = (MyComponent) myContext.getBean("MioComponent");	
		/*o nome della class
		 * MyComponent myComponent = (MyComponent) myContext.getBean(MyComponent.class);	
		 */
	/*	System.out.println("myComponent: " + myComponent.myComponentMethod("Component"));
		// Accesso ai Value
		logger.info("myComponent.getMyValue(): " + myComponent.getMyValue());
		logger.info("myComponent.myDobleValue: " + myComponent.myDoubleValue * 2);
		*/
		/*Autowired*/
		/*logger.info("myComponent.myAutowired.myAutowiredMethod(): " + myComponent.myAutowired.myAutowiredMethod("Autowired"));
*/
	}

}