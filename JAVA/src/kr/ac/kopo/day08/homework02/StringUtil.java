package kr.ac.kopo.day08.homework02;

import java.util.Scanner;

public class StringUtil {

	Scanner sc = new Scanner(System.in);

	static String strData;
	static char ch;

	public static int checkChar(String strData, char ch) {

		int sum = 0;
		char[] chArr = strData.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ch) {
				sum++;
			}
		}
		System.out.println("문자의 개수: " + sum);

		return sum;
	}

	public static String removeChar(String oriStr, char delChar) {
		char[] chArr = oriStr.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == delChar) {
				chArr[i] = ' ';
			}
		}
		String str = String.valueOf(chArr);
		System.out.print(str);
			return str;
		}
	}
	

