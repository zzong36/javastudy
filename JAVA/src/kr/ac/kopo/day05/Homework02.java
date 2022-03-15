package kr.ac.kopo.day05;

import java.util.Scanner;

class Icecream{
	String name; // 아이스크림 이름
	int price;   // 아이스크림 가격
}

public class Homework02 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구입할거야?: ");
		int loc = sc.nextInt();
		
		Icecream[] ic = new Icecream[loc];
		
		for(int i = 0; i < ic.length; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보***%n", i+1);
			ic[i] = new Icecream();
			System.out.print("아이스크림명: ");
			ic[i].name = sc.next();
			System.out.print("아이스크림 가격: ");
			ic[i].price = sc.nextInt();	
			}
		
		System.out.printf("총 %d개의 아이스크림 구매정보 출력%n", loc);
		System.out.println("번호  아이스크림명  가격");

		for(int i = 0; i < ic.length; i++) {
			System.out.println(i+1 + " \t" + ic[i].name + " \t" + ic[i].price);
		}
		
		int sum = 0;
		for(int i = 0; i < ic.length; i++) {
			sum += ic[i].price;
		}
		System.out.println();
		System.out.println("총 판매액: " + sum);
		
		
		
	}
			

}
