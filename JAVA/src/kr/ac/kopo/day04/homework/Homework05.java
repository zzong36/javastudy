package kr.ac.kopo.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05 {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int [] {1,2,3,4,5};
		
		System.out.print("int[] nums = " );
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		System.out.println("Left(-), Right(+): ");
		String sign = sc.nextLine();
		
		System.out.println("Start Index(0-4): ");
		int index = sc.nextInt(4);
		
		System.out.println("< PRITN >");
		
		
		
	}
}
