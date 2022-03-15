package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			if(i < 5) {
				
				System.out.printf("%d's 정수: ", i + 1);
				arr[i] = sc.nextInt();
				if (arr[i] % 2 == 0) {
				} else {
					System.out.printf("%d's 정수: ", i + 1);
					arr[i] = sc.nextInt();
					
				}
			}

		}
		System.out.println();
		System.out.println("< 5개의 정수 출력 >");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] !=0) {
				System.out.print(arr[i] + " ");

			}

		}
	}
}
