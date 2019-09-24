package com.sungju.test;

import java.util.Calendar;

public class Drinks {
	
	private String brand;
	private int price;
	private Calendar calendar; // 선언은 할 수 있고 객체 생성은 안됨
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	 
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}
