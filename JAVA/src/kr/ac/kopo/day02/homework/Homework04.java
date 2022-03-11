package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		System.out.print("나눌 수를 입력하세요: ");
		int div = sc.nextInt();

		System.out.printf("몫: %d%n", num / div);
		System.out.printf("나머지: %d%n", num % div);

	}
}
