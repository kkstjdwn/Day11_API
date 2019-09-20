package com.sungju.collection.list;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		/**
		 * 1,2,3 배열을
		 * 
		 */
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add('c');
		al.add(3);
		al.add("four");
		
		al.add(2, "two");
		al.set(1, 10000);
		al.remove(1);
		// al.clear();
		int num = 10;
		al.add(num);
		// num = al.get(0);
		Integer num2 = 10; // AutoBoxing
		al.add(num2);
		String name = (String)al.get(3);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
		

	}

}
