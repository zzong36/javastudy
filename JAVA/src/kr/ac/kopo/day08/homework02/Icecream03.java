package kr.ac.kopo.day08.homework02;

import java.util.Scanner;

public class Icecream03 {

	Scanner sc = new Scanner(System.in);
	static int cnt;
	static int sum;

	void input() {
		System.out.print("아이스크림 몇 개 입력?: ");
		int loc = sc.nextInt();
		int priceArr[] = new int[loc];
		String nameArr[] = new String[loc];

		for (int i = 0; i < nameArr.length; i++) {

			System.out.printf("*** %d번째 아이스크림 구매정보 ***%n", i + 1);

			System.out.print("아이스크림명: ");
			nameArr[i] = sc.next();

			System.out.print("아이스크림 가격: ");
			priceArr[i] = sc.nextInt();
			
			cnt++;
			sum +=priceArr[i];
		}


	}
}
