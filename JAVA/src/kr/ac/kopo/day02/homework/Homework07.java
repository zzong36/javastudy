package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework07 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳): ");
		String inputStr = sc.nextLine();
		char c = inputStr.charAt(0);
		int i = (int) c;

		if (i >= 65 && i <= 90) {
			int b = i + 32;
			char ch = (char) b;
			System.out.println("변경된 값: " + ch);

		} else {
			if (i >= 97 && i <= 122) {
				int b = i - 32;
				char ch = (char) b;
				System.out.println("변경된 값: " + ch);
			}
		}
	}

}
