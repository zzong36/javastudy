package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 정수: ", i + 1);
			arr[i] = sc.nextInt();
			if (arr[i] > arr[i+1]) {
				System.out.println(arr[i] + "보다 큰 수가 와야 합니다");

			}
		}

	}
}
