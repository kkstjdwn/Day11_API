package com.sungju.collection.ex03;

import java.util.ArrayList;

public class WetherView {

	public void view(ArrayList<Weather> weathers) { // 날씨전체정보출력

		for (int i = 0; i < weathers.size(); i++) {
			System.out.println("도시\t: " + weathers.get(i).getCity());
			System.out.println("기온\t: " + weathers.get(i).getGion());
			System.out.println("습도\t: " + weathers.get(i).getHumidity());
			System.out.println("날씨\t: " + weathers.get(i).getNalssi());
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

}
