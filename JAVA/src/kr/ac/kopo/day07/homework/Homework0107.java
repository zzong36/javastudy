package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Homework0107 {
	
	public static void main(String args[]) {
		
		StringUtil su = new StringUtil();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대문자 확인: ");
		su.isUpperChar();

		System.out.print("소문자 확인: ");
		su.isLowerChar();
		
		System.out.println("<Max 구하기>");
		System.out.println("숫자 2개 입력하기: ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("Max: "+ su.max(i, j));

		System.out.println("<Min 구하기>");
		System.out.println("숫자 2개 입력하기: ");
		int k = sc.nextInt();
		int l = sc.nextInt();
		System.out.println("Min: "+ su.min(k, l));
		
		System.out.println("문자열 입력하시오: ");
		su.reverseString();
	
		System.out.println();
		System.out.println("대문자로 변환할 문자열을 입력: ");
		su.toUpperString();

		System.out.println();
		System.out.println("소문자로 변환할 문자열을 입력: ");
		su.toLowerString();
		
		
	}

}
