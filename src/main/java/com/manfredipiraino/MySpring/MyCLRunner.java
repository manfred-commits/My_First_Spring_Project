package com.manfredipiraino.MySpring;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyCLRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Hello Spring2!");
	}
}
