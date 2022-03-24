package kr.ac.kopo.day11;

import java.util.Scanner;

class MissMatchEvenException extends Exception{ // 사용자 정의 나만의 예외 클래스를 만든다. 

	public MissMatchEvenException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MissMatchEvenException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

public class ExceptionMain08 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();
			
			if(num < 0 || num % 2 == 1) {
				throw new MissMatchEvenException(num + "은 짝수가 아닙니다"); //왜 try-catch문 없니하고 떠넘김
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		/*
		 * 
		if(num < 0 || num % 2 == 1) {
			System.out.println("잘못 입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		 */
	}
	
}
