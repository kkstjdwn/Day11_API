package com.sungju.collection.ex03;

import java.util.ArrayList;
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
		sb.append("jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");

	}

	public void init(ArrayList<Weather> weathers) { // 날씨정보를 파싱해서 저장
		StringTokenizer stringTokenizer = new StringTokenizer(sb.toString(), "-");

		while (stringTokenizer.hasMoreTokens()) {
			this.weather = new Weather();
			this.weather.setCity(stringTokenizer.nextToken());
			this.weather.setGion(Double.parseDouble(stringTokenizer.nextToken()));
			this.weather.setHumidity(Integer.parseUnsignedInt(stringTokenizer.nextToken()));
			this.weather.setNalssi(stringTokenizer.nextToken());

			weathers.add(weather);
		}

	}

	public void addWeather(ArrayList<Weather> aw) {// 날씨정보를 입력,추가 [지역,기온,습도,날씨]
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
			
			aw.add(weather);
			
			System.out.println("계속하시겠습니까?");
			System.out.println("1.Yes\t2.No");
			int keep = sc.nextInt();
			if (keep == 2) {
				add = !add;
				break;
			}
			
		}
		

	}

	public Weather findWeather(ArrayList<Weather> wt) {// 도시명을 입력, 정보출력
		this.weather = new Weather();
		boolean find = true;
		System.out.println("조회를 원하는 도시의 이름을 입력하세요.");
		String cp = sc.next();
		
		for (int i = 0; i < wt.size(); i++) {
			if (cp.equals(wt.get(i).getCity())) {
				this.weather = wt.get(i);
				find = false;

			}

		}
		
		if (find) {
			System.out.println("일치하는 지역명의 정보가 없습니다.");
		}

		return weather;

	}

}
