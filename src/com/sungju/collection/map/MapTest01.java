package com.sungju.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest01 {

	public static void main(String[] args) {
		/**
		 * map 
		 * Key : String 
		 * Value : Object(reference)
		 */

		HashMap<String, Integer> map = new HashMap<String, Integer>(); // hash 갈다 hashcode , < > 제네릭
		map.put("f1", 1);
		map.put("k1", 2);
		map.put("s1", 1);

		System.out.println(map.get("f1"));
		System.out.println(map.get("k1"));
		System.out.println(map.get("s1"));
		
		/**
		 * 반복문
		 * 1.Key를 알아야함
		 *  - Iterator(반복자) : 또다른 Collection의 한 종류
		 */
		
		System.out.println("-------------");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}

	}

}
