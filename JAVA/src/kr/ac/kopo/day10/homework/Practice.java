package kr.ac.kopo.day10.homework;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력: ");
		int year = sc.nextInt();
		System.out.println("월 입력: ");
		int month = sc.nextInt();

		int day;

		Calendar c = Calendar.getInstance();


		for(month= 1; month <= 12; month++) {
			
			c.set(year, month - 1, 1);
			day = c.get(Calendar.DAY_OF_WEEK);
			System.out.println(day);
			
			int lastday = c.getActualMaximum(Calendar.DATE);
			System.out.println(lastday);
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

}
