package kr.ac.kopo.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {

			System.out.printf("%d's num : ", i + 1);
			arr[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("< PRINT >");
		System.out.print(Arrays.toString(arr));

		System.out.println();

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("총합 : " + sum);

	}

}
