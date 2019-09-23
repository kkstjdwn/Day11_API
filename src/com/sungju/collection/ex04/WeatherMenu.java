package com.sungju.collection.ex04;


import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {
	private WeatherService service;
	private WetherView view;
	private Scanner sc;
	private boolean check = true;
	private int choice;
	//private ArrayList<Weather> weathers;
	private HashMap<String, Weather> weathers;
	
	public WeatherMenu() {
		this.service  = new WeatherService(); // service 초기화 안해줘서 자꾸 nullpoint 뜸
		this.weathers = new HashMap<String, Weather>();
		this.sc = new Scanner(System.in);
		this.view = new WetherView();
		
	}
	
	public void start() {
		
		/**
		 * 1.날씨정보 초기화 - service.init실행
		 * 2.날씨정보 추가 - service.addWeather
		 * 3.전체정보 출력 - view.view
		 * 4.지역정보 검색 - service.findWeather --> view.view
		 * 5.프로그램종료 
		 */
		
		
		while (this.check) {
			
			System.out.println("1.날씨정보 초기화");
			System.out.println("2.날씨정보 추가");
			System.out.println("3.전체정보 출력");
			System.out.println("4.지역정보검색");
			System.out.println("5.지역정보삭제");
			System.out.println("6.프로그램종료");
			System.out.println("원하는 메뉴의 번호를 입력하세요");
			this.choice = sc.nextInt();
			
			switch (this.choice) {
			case 1:
				this.service.init(this.weathers);
				break;
				
			case 2 :
				
				this.service.addWeather(this.weathers);
				break;
				
			case 3:
				this.view.view(this.weathers);
				break;
			case 4 :
				Weather weather = this.service.findWeather(weathers);
				if(weather!=null) {
					this.view.view(weather);
				}else {
					this.view.view("일치하는 도시명이 없습니다");
				}
				break;
			case 5:
				System.out.println(this.service.deleteWeather(weathers));
				break;
			case 6: 
				System.out.println("프로그램종료");
				check = !check;
				break;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
			
			
		}
	}

}
