package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 
 * 다중 IF
	if(조건1){
		문장1; 
 	} else {
 		if(조건2) {
 		문장2;
 		} else {
 		문자3; // 중첩 if문
 		}
 	}
 	집에서 출발한 시간을 입력하세요(ex 7시 30분 : 730) -> 807
 	버스를 탑니다
 */

public class IFMain02 {

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("집에서 출발한 시간을 입력하세요(7시 30분 : 730)>");
		int time = sc.nextInt();
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");

		} else { 
			if (time < 815) {
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
			}
		}
	
}
}