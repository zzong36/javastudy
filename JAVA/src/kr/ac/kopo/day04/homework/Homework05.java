package kr.ac.kopo.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] nums = { 1, 2, 3, 4, 5 };
		char ch = ' ';

		System.out.print("int[] nums: ");
		System.out.print(Arrays.toString(nums));

		System.out.println();
		System.out.print("Left(-), Right(+): ");
		String sign = sc.nextLine();
		ch = sign.charAt(0);

		System.out.println(ch);

		System.out.print("Start Index(0-4) : ");
		int index = sc.nextInt();

		int[] copy = new int[nums.length];

		if (ch == '+') {

			for (int i = 0; i < nums.length; i++) {

				if (i + index < 5) {

					copy[i] = nums[i + index];
				} else {

					copy[i] = nums[i + index - 5];
				}

			}
		} else if (ch == '-') {

			for (int i = 0; i < nums.length; i++) {

				if (i + index < 5) {

					copy[i] = nums[i + index];
				} else {

					copy[i] = nums[i + index - 5];
				}

			}

		}

		System.out.print(Arrays.toString(copy));

	}
}
