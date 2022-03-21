package kr.ac.kopo.day08.homework02;

import java.util.Scanner;

public class Homework01 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// 1
		System.out.print("문자열을 입력하시오: ");
		String str1 = sc.nextLine();
		System.out.print("문자를 하나 입력하시오: ");
		String str2 = sc.nextLine();
		char ch = str2.charAt(0);

		StringUtil.checkChar(str1, ch);

		// 2

		System.out.print("문자열을 입력하시오: ");
		String oriStr = sc.nextLine();
		System.out.print("삭제할 문자를 하나 입력하시오: ");
		String str3 = sc.nextLine();
		char delChar = str3.charAt(0);
		StringUtil.removeChar(oriStr, delChar);


	}
}
