package com.sungju.stingTokenizer.ex01;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {

	private String memberInfo;

	public MemberMaker() {

		this.memberInfo = "IU-아이유-27-choa-초아-28-suji-수지-30";
	}

	public void makeMember() {
		/**
		 * memberinfo의 내용을 파싱해서 member 객체를 생성해서 모든 정보를 출력
		 */

		StringTokenizer stk = new StringTokenizer(this.memberInfo, "-");
		
		

		
		
		ArrayList<Member> mems = new ArrayList<Member>();
		
		while (stk.hasMoreTokens()) {
			Member mem = new Member();
			mem.setId(stk.nextToken());
			mem.setName(stk.nextToken());
			mem.setAge(Integer.parseInt(stk.nextToken()));

//			System.out.println("id\t: " + mem.getId());
//			System.out.println("name\t: " + mem.getName());
//			System.out.println("age\t: " + mem.getAge());
			
			mems.add(mem);
			
		}
		
		for (int i = 0; i < mems.size(); i++) {
			System.out.println("id\t: " + mems.get(i).getId());
			System.out.println("name\t: " + mems.get(i).getName());
			System.out.println("age\t: " + mems.get(i).getAge());
		}
	}

}
