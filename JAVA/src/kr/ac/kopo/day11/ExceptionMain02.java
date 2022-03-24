package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	
	public static void main(String[] args) {
		
		
		try {
			Random r = new Random();
			int num = r.nextInt(2); // 0, 1
			System.out.println("num : " + num);
			System.out.println(10/num);
		} catch (ArithmeticException ae) { // 예외가 발생해도 
//			System.out.println("예외발생 : " + ae.getMessage()); //에러에 대한 설명을 알려줌
			ae.printStackTrace(); // 에러가 난 곳을 따라가면서 찍어줌
		}
		System.out.println("main end..."); // 예외가 발생하면 14줄은 처리되지 않는다. 
		
	}
}
