package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Homework08 {
	
	public static void main(String args[]) {
		
		Calculator cc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int i = sc.nextInt();

		System.out.print("정수: ");
		int j = sc.nextInt();
		
		cc.add(i, j);
		cc.subtract(i, j);
		cc.multiply(i, j);
		cc.divide(i, j);
		cc.check(i, j);
		
	}

}
