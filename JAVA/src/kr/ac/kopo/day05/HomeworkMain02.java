package kr.ac.kopo.day05;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String args[]) {

		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		for(int i = 0; i < nums.length;) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				System.out.println(msg + "보다 큰수여야합니다");
			} else {
				msg += nums[i++] + " ";
			}
		}
		
		/*
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				for(int j = 0; j < i; j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println("보다 큰수여야합니다");
				i--;
			}
		}
		*/

	}

}
