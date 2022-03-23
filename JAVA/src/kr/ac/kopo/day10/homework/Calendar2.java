package kr.ac.kopo.day10.homework;

import java.util.Calendar;
import java.util.Scanner;

class Calendar2 {
	
	static int year;
	static int month;
	static int num;
	static int num2;
	int day;
	
	Calendar2(){
		
	}
	
	
	Calendar2(int year, int month){
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
			printMonth();
			break;
			
		case 3: 
			System.out.println("종료");
			break;
			
		default:
			System.out.println("1~3 사이를 선택하세요");
		}
		
		
	}
	
	void printMonth() {
		Calendar c = Calendar.getInstance();

		c.set(year, month - 1, 23);
		day = c.get(Calendar.DAY_OF_WEEK);

		int lastday = c.getActualMaximum(Calendar.DATE);

		System.out.printf("<%d년 %d월>%n", year, month);
		System.out.println("일  월  화  수  목  금  토");

		for (int i = 1; i <= 31; i += 7) {
			for (int j = i; j <= i + 6; j++) {
				if (j >= 1 && j < day) {
					System.out.print("   ");
				} else if(j <= lastday+day-1){
					System.out.printf("%02d ", j-day+1);
				} 
			}
			System.out.println();
		}
		
	}
		
	
}
