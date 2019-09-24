package com.sungju.test;

import java.util.Scanner;

public class Menu {
	private Machine machine;
	private Scanner sc;
	private Drinks drinks;
	
	public Menu() {
		this.machine = new Machine();
		this.sc=new Scanner(System.in);
		this.drinks = new Drinks();
		
	}
	
	public void select() {
		
		boolean check = true;
		while (check) {
			System.out.println("1.Cola");
			System.out.println("2.Cider");
			System.out.println("3.Water");
			System.out.println("4.End");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				drinks = machine.makeCola();
				break;
			case 2:
				//drinks = machine.makeCider();
				break;
			case 3:
				drinks = machine.makeWater();
				break;
			case 4:
				check =!check;
				break;

			default:
				System.out.println("제대로눌러");
				break;
			}
			
			System.out.println(this.drinks.getBrand());
		}
		
		
//		Cola cola = machine.makeCola();
//		Cider cider = machine.makeCider();
		
	}

}
