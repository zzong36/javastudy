package kr.ac.kopo.day01;

/*
  ��� ����
  1. ������ ���
  2. �Ǽ��� ���
  3. ������ ���('a'): �빮��, �ҹ���, ���ڹ���, Ư������, ���鹮��(' ', '\n')
  4. ���ڿ� ���("abc")
  5. ���� ���(true, false)
 
 */

/*
 ��¸޼ҵ�
 1.println() : ���๮�� ����
 2.print() : ���๮�� ������
 */


public class PrintMain {

	public static void main(String[] args) {
		
		System.out.println(10); 
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.println(23 + "��");
		System.out.println(3+3);
		System.out.println('A'+'B');
		
		// 10 + 20 = 30

		System.out.printf("%7d + %d = %d%n", 10, 20, 10+20);
		System.out.println(10 + " + " + 20 + " = " + (10+20));
		System.out.printf("%.4f", 12.345678);
		System.out.printf("%b%n", true);
		
		
		
		
	}
}
