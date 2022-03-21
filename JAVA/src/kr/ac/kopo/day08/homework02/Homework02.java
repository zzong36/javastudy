package kr.ac.kopo.day08.homework02;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		
		Icecream03 ice = new Icecream03();
		 
		do {
			ice.input();
			System.out.print("계속 주문하시겠습니까?(yes:Y/y, no:N/n : ");
			String str = sc.nextLine();
			ch = str.charAt(0);
			System.out.println();
		}while(ch == 'Y' || ch == 'y');
		
		System.out.println("총 판매 개수: " + Icecream03.cnt);
		System.out.println("총 판매액: " + Icecream03.sum);
		
		
	}
	

}
