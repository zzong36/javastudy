package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
	
	public static void main(String args[]) {

		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 hh시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1; // 0 ~ 11
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); //1(일) ~7(토)
		String[] week = {" ", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + week[day] + "요일");
		
//		2020년 5월 20일 요일;
		
		c.set(2020, 5-1, 20);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20 " + week[day]);
		
		int lastday = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
		
		/*
		Date d = new Date();
		System.out.println(d); // 왜 주소가 찍히지 않지?? 실제로 d.toString() 
		 * 
		// 오늘은 3월 23일 (수)입니다. 
		int year = d.getYear() + 1900; // deprecate 되어 있다는 뜻 현재 쓸 수는 있지만 미래에 사라질 수 있다는걸 의미한다. 
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay();
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + week[day] + "요일");
		 */
		
	}

}
