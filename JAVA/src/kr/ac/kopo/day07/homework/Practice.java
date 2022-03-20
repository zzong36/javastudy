package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Practice {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력: ");
		int i = sc.nextInt();
		
		int sum = 0;
		for(int k = i-1; k > 1; k--) {
			if(i % k ==0) {
				sum += k;
			}
	}
		if(sum == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
}
}
