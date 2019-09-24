package com.sungju.test;

import java.util.Calendar;

public class Machine {
	private Drinks drinks;
	private Cola cola;
	private Cider cider;
	private Water water;

//	public Machine() {
//		this.drinks = new Drinks();
//		this.cola = new Cola();
//		this.cider = new Cider();
//		this.water = new Water();
//	}

	// 콜라 선택
	public Cola makeCola() {
//		this.drinks = this.cola;
//		return cola;
		
		return new Cola();
	}

	// 사이다
	public Cider makeCider(String brand, int price, Calendar calendar) {
//		this.drinks = this.cider;
//		return cider;
		this.cider.setBrand(brand);
		this.cider.setPrice(price);
		this.cider.setCalendar(calendar);
		return new Cider();
	}

	// 물
	public Water makeWater() {
//		this.drinks = this.water;
//		return water;
		return new Water();
	}

}
