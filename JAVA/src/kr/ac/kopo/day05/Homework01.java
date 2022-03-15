package kr.ac.kopo.day05;



import java.util.Scanner;

public class Homework01 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇 개 구입할거야?: ");
		int loc = sc.nextInt();

		String nameArr[] = new String[loc]; // 아이스크림 이름
		int priceArr[] = new int[loc]; // 아이스크림 가격

		for (int i = 0; i < nameArr.length; i++) {

			System.out.printf("*** %d번째 아이스크림 구매정보 ***%n", i + 1);

			System.out.print("아이스크림명: ");
			nameArr[i] = sc.next();

			System.out.print("아이스크림 가격: ");
			priceArr[i] = sc.nextInt();

			System.out.println();
		}

		System.out.printf("총 %d개의 아이스크림 구매정보 출력%n", loc);
		System.out.println("번호  아이스크림명  가격");

		for(int i = 0; i < loc; i++) {
			System.out.println(i+1 + " \t" + nameArr[i] + " \t" + priceArr[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < priceArr.length; i++) {
			sum += priceArr[i];
		}
		System.out.println();
		System.out.println("총 판매액: " + sum);
	}
	
}
