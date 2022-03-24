package kr.ac.kopo.day11.calendar;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);
	
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		while(true) { //의미는?
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.이전달 4.다음달 5.종료) : "); // 풀어보기
			switch (type) {
			case 1:
				int year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				int month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				System.exit(0); // 위의 true와 연결되는 것일까?
			}
		}
	}
}