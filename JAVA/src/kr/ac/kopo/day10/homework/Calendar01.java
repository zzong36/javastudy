package kr.ac.kopo.day10.homework;

import java.util.Calendar;
import java.util.Scanner;

class Calendar01 {
	
	static int year;
	static int month;
	static int num;
	static int num2;
	
	Calendar01(){
		
	}
	
	
	Calendar01(int year, int month){
		this.year = num;
		this.month = num2;
	}
	
	void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 항목을 선택하세요(1.특정년도 2.특정월 3.종료)");
		num = sc.nextInt();		
		
		switch(num) {
		
		case 1: 
			System.out.println("년도를 선택하세요: ");
			year = sc.nextInt();
			break;
		
		case 2:
			System.out.println("년도를 선택하세요: ");
			year = sc.nextInt();
			System.out.println("월을 선택하세요");
			month = sc.nextInt();
			break;
			
		case 3: 
			System.out.println("종료");
			break;
			
		default:
			System.out.println("1~3 사이를 선택하세요");
		}
		
		
	}
	
	void print() {
		Calendar c = Calendar.getInstance();
		c.set(year, month);
		
		System.out.printf("<%d년 %d월>%n", year, month);
		System.out.println("일 월 화 수 목 금");
		
	}
		
	
}
