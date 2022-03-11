package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요.>");
		int num = sc.nextInt();

		System.out.printf("결과출력: %d시간 %d분 %d초", num / 3600, (num / 60) % 60, num % 60);

	}

}
