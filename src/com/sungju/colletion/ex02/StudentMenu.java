package com.sungju.colletion.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private StudentView view = new StudentView();
	private StudentService service = new StudentService();
	private ArrayList<Student> students;
	private Scanner sc;
//////////////////////멤버변수선언//////////////////////////////
	public StudentMenu() {
		students = new ArrayList<Student>();
		view = new StudentView();
		service = new StudentService();
		sc = new Scanner(System.in);
	}
////////////////////생성자선언//////////////////////////////

	public void start() {
		/**
		 * 1.학생정보등록 
		 * 2.전체정보출력 
		 * 3.학생정보조회(이름) 
		 * 4.학생정보삭제 
		 * 5.종료
		 */
		boolean login = true;
		while (login) {

			System.out.println("1.학생정보등록");
			System.out.println("2.학생전체조회");
			System.out.println("3.학생개별조회");
			System.out.println("4.학생정보삭제");
			System.out.println("5.프로그램종료");
			System.out.println("=====================");
			System.out.println("원하는 정보를 입력");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				this.service.studentInput(students);

				break;

			case 2:

				this.view.view(students);
				break;

			case 3:
				this.view.view(this.service.StudentSearch(students));
				break;
			case 4:
				this.service.StudentDelete(students);
				;
				break;
			case 5:
				System.out.println("종료");
				login = false;
				break;
			default:
				System.out.println("다시 입력하세욤");
				break;

			}

		}

	}

}
