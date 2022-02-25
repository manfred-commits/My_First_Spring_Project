package com.manfredipiraino.MySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("MioComponent")
public class MyComponent {
	public String myComponentMethod(String myString) {
		return "myComponentMethod():"+myString;
	}
	/*può essere utilizzato solo in diverse versioni di component*/
	@Value("My value of Component")
	private String myValue;
	public String getMyValue() {
		return myValue;
	}
	@Value("33")
	public Double myDoubleValue;
	
	@Autowired
	public MyAutowired myAutowired;
}
