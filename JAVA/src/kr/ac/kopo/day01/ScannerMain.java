package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); //참조자료형
		
		System.out.print("입력하세요.>");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch: " + ch);
		
		
		System.out.print("안녕하세요.>");
		String str = sc.nextLine(); //키보드로 입력받은 정수 필요, 다양한걸 넣을 수 있는데 문자입력은 안된다.
		System.out.println("Hi!");
		
		

		
	
	}

}
