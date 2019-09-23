package com.sungju.collection.ex04;


import java.util.HashMap;
import java.util.Iterator;

public class WetherView {

	public void view(HashMap<String, Weather> weathers) { // 날씨전체정보출력
		//1단계 - 키들을 모을 Iterator 생성
		Iterator<String> it = weathers.keySet().iterator();
		
		while(it.hasNext()) {
			Weather wt = weathers.get(it.next());
			System.out.println("도시\t: " + wt.getCity());
			System.out.println("기온\t: " + wt.getGion());
			System.out.println("습도\t: " + wt.getHumidity());
			System.out.println("날씨\t: " + wt.getNalssi());
			System.out.println();
			
		}



		System.out.println("-------조회완료-------");

	}

	public void view(Weather weather) { // 날씨하나출력 오버로드!!!!!!
		System.out.println("도시\t: " + weather.getCity());
		System.out.println("기온\t: " + weather.getGion());
		System.out.println("습도\t: " + weather.getHumidity());
		System.out.println("날씨\t: " + weather.getNalssi());
		System.out.println();

	}
	
	public void view(String str) {
		System.out.println(str);
	}

}
