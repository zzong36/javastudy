package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class StringUtil {
	
	Scanner sc = new Scanner(System.in);
	
	void isUpperChar(){
		String str = sc.nextLine();
		char ch = str.charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("true");
		} else {
			System.out.println("대문자 아님");
		}
	}
	
	void isLowerChar(){
		String str = sc.nextLine();
		char ch = str.charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("true");
		} else {
			System.out.println("소문자 아님");
		}
	}
	
	int max(int i, int j) {
		return  i > j ? i : j;
	}
	
	int min(int k, int l) {
		return  k < l ? k : l;
	}
	
	void reverseString() {
		
	String str = sc.nextLine();	
	char[] chArr = str.toCharArray();
	for(int i = str.length()-1; i >=0; i--) {
		System.out.print(chArr[i]);
	}
	
	}
	
	void toUpperString() {
		String str = sc.nextLine();
		System.out.println(str.toUpperCase());
	}
	
	void toLowerString() {
		String str = sc.nextLine();
		System.out.println(str.toLowerCase());
	}
	

}
