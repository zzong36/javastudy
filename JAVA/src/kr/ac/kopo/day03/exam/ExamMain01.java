package kr.ac.kopo.day03.exam;
/*
		 for( ; ; ) {
			System.out.println("Hello");
		} // 무한로프 코드
 */

public class ExamMain01 {

	public static void main(String args[]) {

		/*
		 * for (int i = 1; i <= 10; i++) { for (int i = 0; i <= 9; i++) { for (int i =
		 * 10; i >= 1; i--) { for (int i = 5; i >= 1; i--) { for (int i = 5; i >= -4;
		 * i--) { System.out.printf("%d Hello%n", i); }
		 */

		// for (int i = 0; i < 5; i++) {
		// System.out.print("*");
		// System.out.println(); // enter의 개념

		// System.out.print("*");

		for (int i = 0; i < 3; i++) { // 이중 for문(루프문)
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
