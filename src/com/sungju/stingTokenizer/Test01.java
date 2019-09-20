package com.sungju.stingTokenizer;

import java.util.*; // '*' 와일드카드

public class Test01 {

	public static void main(String[] args) {

		String str = "it,1,that,2,those,3,them,4,they,5,there,6";

		StringTokenizer stk = new StringTokenizer(str, ",");

		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
			String age = stk.nextToken();
			System.out.println(age);
		}

	}

}
