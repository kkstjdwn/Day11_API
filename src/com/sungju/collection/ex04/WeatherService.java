package com.sungju.collection.ex04;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	private StringBuffer sb;
	private Weather weather;
	private Scanner sc;

	public WeatherService() { // 파싱
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-"); //
		sb.append("Daejeon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");

	}

	public HashMap<String, Weather> init(HashMap<String, Weather> hm) {
		
		StringTokenizer st = new StringTokenizer(sb.toString(),"-");
		
		while(st.hasMoreTokens()) {
			this.weather = new Weather();
			//String key = new String();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setNalssi(st.nextToken());
			//key = weather.getCity();
			//hm.put(key, weather);
			hm.put(weather.getCity(), weather); // 따로 선언 할 필요 없음
			
		}
		
		
		return hm;
	}

	public void addWeather(HashMap<String, Weather> aw) {// 날씨정보를 입력,추가 [지역,기온,습도,날씨]
		boolean add = true;
		while (add) {
			this.weather = new Weather();
			System.out.println("추가하실 지역의 이름을 입력하세요");
			this.weather.setCity(sc.next());
			System.out.println("추가하실 지역의 기온을 입력하세요");
			this.weather.setGion(sc.nextDouble());
			System.out.println("추가하실 지역의 습도를 입력하세요");
			this.weather.setHumidity(sc.nextInt());
			System.out.println("추가하실 지역의 날씨를 입력하세요");
			this.weather.setNalssi(sc.next());
			
			aw.put(weather.getCity(), weather);
			
			System.out.println("계속하시겠습니까?");
			System.out.println("1.Yes\t2.No");
			int keep = sc.nextInt();
			if (keep == 2) {
				add = !add;
				break;
			}
			
		}
		

	}

	public Weather findWeather(HashMap<String, Weather> wt) {// 도시명을 입력, 정보출력
		this.weather = new Weather();
		//boolean find = true;
		System.out.println("조회를 원하는 도시의 이름을 입력하세요.");
		String cp = sc.next();
		
		weather = wt.get(cp);
		
		
				
//		if (find) {
//			System.out.println("일치하는 지역명의 정보가 없습니다.");
//		}

		return weather;

	}
	
	
	public String deleteWeather(HashMap<String, Weather> wt) {
		String check = "삭제를 성공하였습니다.";
		System.out.println("삭제를 원하는 도시의 이름을 입력하세요");
		String del = sc.next();
		
		if (wt.get(del)!=null) {
			wt.remove(del);
			
		}else {
			check = "일치하는 도시명이 없습니다.";
		}
		
		
		return check;
	}
	
	


}
