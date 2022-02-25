package com.manfredipiraino.MySpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*classe java che funge da file di configurazione Spring
utilizzato per costruire il context*/
@Configuration
public class MyConfig {

	/*@Bean
	i bean sono METODI
	@Scope ("prototype")
	public MyClass myClass() {
		return new MyClass();
	}*/
	
	
	@Bean("myBean")
	//@Scope("prototype")
	public MyClass myClass() {
		return new MyClass();
	}
	@Bean("myBeanPro")
	@Scope("prototype")
	public MyClass myClassPro() { 
		return new MyClass();
	}

}