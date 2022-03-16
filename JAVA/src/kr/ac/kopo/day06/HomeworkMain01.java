package kr.ac.kopo.day06;

import java.util.Scanner;

class Icecream {
	String name;
	int price;
}

public class HomeworkMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		sc.nextLine();

		Icecream[] iceArr = new Icecream[count];
		for (int i = 0; i < count; i++) {

			iceArr[i] = new Icecream();

			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}

	}
}
