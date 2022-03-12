package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 100 사이의 정수를 입력: ");
		int num1 = sc.nextInt();

		System.out.print("2 - 10 사이의 정수를 입력: ");
		int num2 = sc.nextInt();

		System.out.println();

		System.out.printf("<1 ~%d사이의 %d의 배수를 제외한 정수 출력>%n", num1, num2);

		for (int i = 1; i <= num1; i++) {
			if (i % num2 != 0) {
				System.out.printf("%d ", i);
			} /*
				 * else { System.out.print(""); }
				 */
		}

		System.out.println(); // 왜 두 개나 필요할까요?
		System.out.println();
		System.out.printf("<1에서 %d사이의 %d의 배수를 제외한 정수 5개씩 출력>%n", num1, num2);

		for (int i = 1; i <= num1; i +=6) {
			for (int j = i; j <= i + 5; j++) {
				if (j <= num1) {
					if (j % num2 != 0) {
						System.out.printf("%d ", j); 
					}
				}
			}
			System.out.println();
		}

	}

}
