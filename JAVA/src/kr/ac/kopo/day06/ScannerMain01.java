package kr.ac.kopo.day06;

import java.util.Scanner;

public class ScannerMain01 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		/* System.out.print("실수 : ");
		double f = Double.parseDouble(sc.nextLine());
		// 아래와 동일한 뜻 
		// double f = sc.nextDouble();
		// sc.nextLine();
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine()); // "123"(문자) -> 123: 문자열을 정수로 바꾸어 주는 것

		System.out.println("num : " + num);
		/*
		int num = sc.nextInt();
		 
		sc.nextLine(); // buffer를 비워주는 행위
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("str : " + str + ", num : " + num);
		 */
		
		
		/*
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		System.out.println("num : " + num 
				+ ", num2 : " + num2 + ", num3 : " + num3);
		*/
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		sc.nextLine(); // space 내용은 다 날려버림
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num : " + num 
				+ ", num2 : " + num2 + ", num3 : " + num3);
	}

}
