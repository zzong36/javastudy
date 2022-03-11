package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework08 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력: ");
		int num = sc.nextInt();

		System.out.print("지불한 돈의 액수: ");
		int pay = sc.nextInt();
		int change = pay - num;

		System.out.printf("거스름돈: %d원%n", change);
		System.out.printf("1000 원: %d개%n", change / 1000);
		System.out.printf("500 원: %d개%n", (change % 1000) / 500);

		if ((change % 1000) / 500 >= 1) {
			System.out.printf("100 원: %d개%n", ((change % 1000) - 500) / 100);
		} else {
			System.out.printf("100 원: %d개%n", (change % 1000) / 100);
		}

		System.out.printf("50 원: %d개%n", (change % 1000) % 100 / 50);

		if ((change % 1000) % 100 / 50 >= 1) {
			System.out.printf("10 원: %d개%n", (((change % 1000) % 100 - 50) / 10));
		} else {
			System.out.printf("10 원: %d개%n", ((change % 1000) % 100) / 10);
		}

	}
}
