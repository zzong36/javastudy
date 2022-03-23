package kr.ac.kopo.day10;

import java.util.Date;

public class DateMain {
	
	public static void main(String args[]) {
		
		Date d = new Date();
		System.out.println(d); // 왜 주소가 찍히지 않지?? 실제로 d.toString() 
		
		// 오늘은 3월 23일 (수)입니다. 
		int year = d.getYear() + 1900; // deprecate 되어 있다는 뜻 현재 쓸 수는 있지만 미래에 사라질 수 있다는걸 의미한다. 
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay();
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + week[day] + "요일");
		
	}

}
