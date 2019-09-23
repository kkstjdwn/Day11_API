package com.sungju.calender;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		//현재 시간의 정보
		Calendar cal = Calendar.getInstance(); // new GregorianCalender();
		//get
		int hour = cal.get(Calendar.HOUR);
		hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.print(hour+":");
		int min = cal.get(Calendar.MINUTE);
		System.out.print(min+"-");
		int year = cal.get(Calendar.YEAR);
		System.out.print(year+"/");
		int mon = cal.get(Calendar.MONTH);//1월은 0 2월은 1
		System.out.print(mon+1+"/");//ㅄ메서드
		int day = cal.get(Calendar.DAY_OF_MONTH);
		day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		
		
		
	}

}
