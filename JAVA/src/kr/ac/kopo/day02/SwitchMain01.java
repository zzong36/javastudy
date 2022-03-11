package kr.ac.kopo.day02;

import java.util.Scanner;

/* 
 	 1~3 사이의 정수 입력:
 	 1 입력 시 "ONE" 출력
 	 2 입력 시 "TWO" 출력
 	 3 입력 시 "THREE" 출력
 	 그 외 "ERROR" 츨력
 */

public class SwitchMain01 {
/*
 	다중 IF를 사용하려면
 	if(num == 1){
 	System.out.println("ONE");
 	} else if(num == 2) {
 	System.out.println("TWO");
 	} else if(num ==3) {
 	System.out.println("THREE");
 	} else {
 	System.out.println("ERROR");
 	}
 	
 	
 */
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 3사이의 정수를 입력하세요.> ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1: // switch에 들어올 수 있는 것은 한정되어 있음
			System.out.println("ONE");
			break; //block scope의 역할을 함 실제 {}는 아무런 영향을 미치지 않음, 책을 덮는 역할(빠져나오게 됨), for, while. switch문에서 의미가 있다. 마지막 }로 바로 뛰어넘어간(분기한다). 
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default:
			System.out.println("ERROR"); // 중간에 들어갔다 하더라도 문제가 없다

		}
		
		
		
	}
}
