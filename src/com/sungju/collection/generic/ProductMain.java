package com.sungju.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		NoteBook book = new NoteBook();
		
		//<Generic>
//		ArrayList<Product> ar = new ArrayList<Product>();
//		ar.add(tv);
//		ar.add(computer);
//		ArrayList<Product> ar2 = new ArrayList<Product>();
//		ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();   // 이건 가끔씀
//		ArrayList<ArrayList<ArrayList<Product>>> ar4 = new ArrayList<ArrayList<ArrayList<Product>>>();
		

		HashMap<String, ArrayList<Product>> hm = new HashMap<String, ArrayList<Product>>();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		//Computer 와 Computer를 상속받은 타입을 모으겠다
		
		
		//ar.add(computer);
	}

}
