package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요.>");
		int num = sc.nextInt();
		final double pi = 3.141592;

		System.out.printf("원의 면적은 %f 입니다.", num * num * pi);

	}
}
