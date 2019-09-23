package com.sungju.collection.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
//////////////////멤버변수선언//////////////////////////////
	private Scanner sc;
	

////////////////////생성자선언//////////////////////////////
	public StudentService() {
		
		sc = new Scanner(System.in);
	
	}

//////////////////학생입력//////////////////////////////
	public void studentInput(ArrayList<Student> students) {

		boolean check = true;

		while (check) {
			Student st = new Student();
			System.out.println("이름을 입력하세요");
			st.setName(sc.next());
			System.out.println("번호를 입력하세요");
			st.setNum(sc.nextInt());
			System.out.println("국어점수를 입력하세요");
			st.setKor(sc.nextInt());
			System.out.println("영어점수를 입력하세요");
			st.setEng(sc.nextInt());
			System.out.println("수학점수를 입력하세요");
			st.setMath(sc.nextInt());

			st.setSum(st.getKor() + st.getEng() + st.getMath());
			st.setAvg(st.getSum() / 3.0);

			students.add(st);

			System.out.println("계속 입력하시겠습니까?");
			System.out.println("1.Yes\t2.No");
			int sel = sc.nextInt();
			if (sel == 2) {

				check = false;

			}

			System.out.println("=====================");
		}

	}
	

//////////////////학생삭제//////////////////////////////
	public void StudentDelete(ArrayList<Student> students) {
		System.out.println("삭제할 학생의 이름을 입력하세요");

		String sel = sc.next();
		boolean check = true;
		String msg = "Delete Fail";

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getName().equals(sel)) {

				students.remove(i);
				msg = "Delete Success";
				check = false;
				break;

			}

		}

		if (check) {
			System.out.println("일치하는 학생이 없습니다");
		}
		System.out.println(msg);
		System.out.println("=====================");

	}
	

//////////////////학생검색//////////////////////////////
	public Student StudentSearch(ArrayList<Student> students) {
		Student student = new Student();
		System.out.println("학생의 이름을 입력하세요");
		String sel = sc.next();
		boolean check = true;

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getName().equals(sel)) {
				student = students.get(i);
				check = false;
				break;

			}

		}

		if (check) {
			System.out.println("일치하는 이름의 학생이 없습니다");
		}
		System.out.println("=====================");

		return student;

	}
	
	
	
	public void teacher( ArrayList<Student>students, Student student) {
		
		students.remove(student); // 매개변수를 object로(주소값을 받아서 그 데이터 제거) boolean으로 리턴값을 줌
		
	}

}
