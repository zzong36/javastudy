package kr.ac.kopo.day111;

import java.util.Random;

public class ExceptionMain03 {

	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(2); // 0, 1
			System.out.println("num : " + num);
			System.out.println(10/num);
			
			String str = "Hello";
			System.out.println("str: " + str);
			System.out.println(str.charAt(10)); // 10번지에 있는것 찾아봄 
		} catch (ArithmeticException ae) { // 예외가 발생해도 
			System.out.println("예외발생 : " + ae.getMessage()); //에러에 대한 설명을 알려줌
//			ae.printStackTrace(); // 에러가 난 곳을 따라가면서 찍어줌
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : " + se);
		}
		System.out.println("main end..."); // 예외가 발생하면 14줄은 처리되지 않는다. 
		
	}
}
