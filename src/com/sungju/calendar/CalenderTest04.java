package com.sungju.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar); // 참조변수를 출력하면 내부적으로 toString을 오버라이딩 함
		
		Date d = new Date();
		System.out.println(d);
		
		d = calendar.getTime();
		System.out.println(d);
	}

}
