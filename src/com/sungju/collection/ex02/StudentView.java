package com.sungju.collection.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {
	Scanner sc = new Scanner(System.in);

	public void view(ArrayList<Student> students) {

		System.out.println("이름\t번호\t국어\t수학\t영어\t총점\t평균");
		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i).getName() + "\t");
			System.out.print(students.get(i).getNum() + "\t");
			System.out.print(students.get(i).getKor() + "\t");
			System.out.print(students.get(i).getEng() + "\t");
			System.out.print(students.get(i).getMath() + "\t");
			System.out.print(students.get(i).getSum() + "\t");
			System.out.println(students.get(i).getAvg());
		}
		System.out.println("=====================");

	}
	
	public void view(Student students) {
		
				System.out.println("이름\t번호\t국어\t수학\t영어\t총점\t평균");
				System.out.print(students.getName() + "\t");
				System.out.print(students.getNum() + "\t");
				System.out.print(students.getKor() + "\t");
				System.out.print(students.getEng() + "\t");
				System.out.print(students.getMath() + "\t");
				System.out.print(students.getSum() + "\t");
				System.out.println(students.getAvg());
		
		System.out.println("=====================");
	}

}
