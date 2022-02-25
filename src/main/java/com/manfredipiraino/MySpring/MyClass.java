package com.manfredipiraino.MySpring;

public class MyClass {
	
	private String myString;
	private int myInt;
	
	/*Methods*/
	public String myClassMethod(String myString) {
		this.setMyString(myString);
		return "myClassMethod(): " + myString;
	}
	public void incrementMyInt() {
		myInt++;
	}
	/*Getter*/
	public String getMyString() {
		return myString;
	}
	public int getMyInt() {
		return myInt;
	}
	/*Setter*/
	public void setMyString(String myString) {
		this.myString = myString;
	}
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
	
}

