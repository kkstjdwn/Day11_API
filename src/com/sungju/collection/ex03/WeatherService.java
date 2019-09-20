package com.sungju.collection.ex03;

public class WeatherService {
	
	private StringBuffer sb;
	
	
	public WeatherService() {  // 파싱
	sb = new StringBuffer();
	sb.append("Seoul-17.2-60-흐림-");
	sb.append("Daejeon-29.9-20-맑음-");
	sb.append("jeju-1.2-99-눈-");
	sb.append("Incheon-89-20-불");
	}
	
	
	public void init() { //날씨정보를 파싱해서 저장
		
	}
	
	public void addWeather() {//날씨정보를 입력,추가 [지역,기온,습도,날씨]
		
		
	}
	
	public void findWeather() {//도시명을 입력, 정보출력
		
	}

}
