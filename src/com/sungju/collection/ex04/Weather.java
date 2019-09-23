package com.sungju.collection.ex04;

public class Weather {
	
	private String city; // 도시 이름 서울 부산
	private double gion; // 기온
	private int humidity; // 습도
	private String nalssi; //맑음 구름
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getGion() {
		return gion;
	}
	public void setGion(double gion) {
		this.gion = gion;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String getNalssi() {
		return nalssi;
	}
	public void setNalssi(String nalssi) {
		this.nalssi = nalssi;
	}

}
