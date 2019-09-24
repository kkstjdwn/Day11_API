package com.sungju.calendar;

import java.util.Calendar;

public class CalenderTest02 {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(calendar.YEAR);
		System.out.println(year);
		calendar.set(Calendar.YEAR, 2020);
		year = calendar.get(calendar.YEAR);
		System.out.println(year);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		calendar.set(Calendar.MONTH, 10);
		day = calendar.get(Calendar.DAY_OF_WEEK);
		day = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(day);
	}

}
