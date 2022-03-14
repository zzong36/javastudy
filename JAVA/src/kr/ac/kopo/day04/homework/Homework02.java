package kr.ac.kopo.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework02 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d's num : ", i + 1);
			arr[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("< 짝수 >");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");

			}
		}
		System.out.println();
		System.out.println("< 홀수 >");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");

			}

		}
	}
}
