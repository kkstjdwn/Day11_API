package com.sungju.calendar;

import java.util.Calendar;

public class CalenderTest05 {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //현재 
//		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		long l1 = calendar.getTimeInMillis();
		Calendar calendar2 = Calendar.getInstance(); //5시간뒤
		calendar2.add(Calendar.HOUR_OF_DAY, 26);
//		int hour2 = calendar2.get(Calendar.HOUR_OF_DAY);
		//시간당 천원
		long l2 = calendar2.getTimeInMillis();
		
		System.out.println(l2-l1);
		long l3 = l2 -l1 ;
		System.out.println(l3/(1000*60*60*24)+"일");
		//long l4 = l3/(1000*60*60)-24;
		long l4 = l3%(1000*60*60);
		System.out.println(l4+"시간");
		
		
	}

}
