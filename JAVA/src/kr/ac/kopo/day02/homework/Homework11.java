package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework11 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 4개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		int first = (num3 > num4) ? num3 : num4;
		int second = (num2 > first) ? num2 : first;
		int max = (num1 > second) ? num1 : second;

		System.out.printf("가장 큰 수: %d", max);

	}
}
