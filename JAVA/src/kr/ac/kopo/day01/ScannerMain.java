package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); //�����ڷ���
		
		System.out.print("�Է��ϼ���.>");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch: " + ch);
		
		
		System.out.print("�ȳ��ϼ���.>");
		String str = sc.nextLine(); //Ű����� �Է¹��� ���� �ʿ�, �پ��Ѱ� ���� �� �ִµ� �����Է��� �ȵȴ�.
		System.out.println("Hi!");
		
		

		
	
	}

}
