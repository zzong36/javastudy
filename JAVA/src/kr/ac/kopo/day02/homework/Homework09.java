package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework09 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책권수: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("잘못입력했습니다");
		} else if (num == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if (num == 1) {
			System.out.printf("%d book", num);
		} else {
			System.out.printf("%d books", num);

		}

	}

}
