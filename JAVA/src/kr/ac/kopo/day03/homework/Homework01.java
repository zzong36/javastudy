package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class Homework01 {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100사이의 정수를 입력: ");
		int num = sc.nextInt();
		
		System.out.printf("<1~%d 정수를 출력>%n", num);
		
		int i = 1;
		while(i <= num) {
			System.out.printf("%d ", i);
			i++;
		}
	}
	
}
