package kr.ac.kopo.day02;
import java.util.Scanner;
/*
 	다중 if
 	if(조건1) {
 	} else if(조건2){
 	} else if(조건3){
 	} else {
 	}
 */


public class IFMain03 {

	public static void main(String args[]) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("집에서 출발한 시간을 입력하세요(7시 30분 : 730)>");
		int time = sc.nextInt();
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다"); //;는 실제 실행하려고 하는 문장 뒤에 붙인다.

		} else if (time < 815) {
			System.out.println("버스를 타고 학교에 간다");
		} else {
			System.out.println("택시를 타고 학교에 간다");
		}
		
	}
	
}
