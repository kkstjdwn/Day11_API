package com.sungju.test;

public class God { // abstract 
	
	private String name;
	private static God god;
	
	private God() {
		
		
		
	}
	//싱글톤
	public static God makeGod() {
		if (God.god != null) {
			
			return God.god;
		}else {
			return new God();
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
