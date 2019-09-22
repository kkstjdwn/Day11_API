package com.sungju.collection.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	private WeatherService service;
	private boolean check = true;
	private Scanner sc;
	private int choice;
	private WetherView view;
	private ArrayList<Weather> weathers;
	
	public WeatherMenu() {
		this.weathers = new ArrayList<Weather>();
		this.sc = new Scanner(System.in);
		this.view = new WetherView();
		this.service  = new WeatherService(); // service 초기화 안해줘서 자꾸 nullpoint 뜸
		
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
			System.out.println("5.프로그램종료");
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
				this.view.view(this.service.findWeather(weathers));
				break;
			case 5: 
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
