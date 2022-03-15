package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Reverse01 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리의 정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int n1 = num % 10;
		int n2 = num % 100 /10;
		int n3 = num /100;
		
		System.out.printf("%d%d%d", n1, n2, n3);
		
		
		
				
	}

}
