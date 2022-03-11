package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework10 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수: ");
		int num3 = sc.nextInt();
		
		int big = (num2 > num3)? num2 : num3;
		int small = (num2 < num3)? num2 : num3;
		
		int first = (num1 > big)? num1 : big;
		int third = (num1 < small) ? num1 :small;
		int second = (num1 <big) ? num1 : big;
		
		if(second < small) {
		System.out.printf("%d, %d, %d",first, small, third);
		} else if(second > small) {
			System.out.printf("%d, %d, %d",first, small, third);
		} else {
			System.out.printf("비교 불가");
			

			
		}
		
	}
	

}
