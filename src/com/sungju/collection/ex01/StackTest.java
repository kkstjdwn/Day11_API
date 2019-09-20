package com.sungju.collection.ex01;

public class StackTest {
	
	private String [] lists;
	
	
	public StackTest() {
		lists = new String[3];
		lists[0] = "IU";
		lists[1] = "CHOA";
		lists[2] = "SUJI";
	
	}
	
	public String getString() { // 0번빼고 1번을 0번으로
		
		return lists[0];
	}
	
	public void setString(String string) { // 추가
		
	}

}
