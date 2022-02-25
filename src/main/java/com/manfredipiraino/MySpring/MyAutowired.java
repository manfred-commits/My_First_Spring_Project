package com.manfredipiraino.MySpring;

import org.springframework.stereotype.Component;

@Component
public class MyAutowired {
	public String myAutowiredMethod(String myString) {
		return myString;
	}
}
