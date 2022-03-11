package kr.ac.kopo.day01;

/*
  상수 종류
  1. 정수형 상수
  2. 실수형 상수
  3. 문자형 상수('a'): 대문자, 소문자, 숫자문자, 특수문자, 공백문자(' ', '\n')
  4. 문자열 상수("abc")
  5. 논리형 상수(true, false)
 
 */

/*
 출력메소드
 1.println() : 개행문자 포함
 2.print() : 개행문자 불포함
 */


public class PrintMain {

	public static void main(String[] args) {
		
		System.out.println(10); 
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.println(23 + "살");
		System.out.println(3+3);
		System.out.println('A'+'B');
		
		// 10 + 20 = 30

		System.out.printf("%7d + %d = %d%n", 10, 20, 10+20);
		System.out.println(10 + " + " + 20 + " = " + (10+20));
		System.out.printf("%.4f", 12.345678);
		System.out.printf("%b%n", true);
		
		
		
		
	}
}
