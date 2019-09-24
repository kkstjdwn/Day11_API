package com.sungju.calendar;

import java.util.Calendar;

public class CalenderTest03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/**
		 *시작하는 시점에서 이틀뒤에 배송도착
		 *그날의 년월일을 출력
		 */
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		
		System.out.println("출발날짜 "+year+"/"+month+"/"+date);
//		calendar.set(Calendar.DATE, date+10);
//		date = calendar.get(Calendar.DATE);
		calendar.add(Calendar.DATE, 10);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		date = calendar.get(Calendar.DATE);
		
		System.out.println("도착날짜 "+year+"/"+month+"/"+date);
		

	}

}
