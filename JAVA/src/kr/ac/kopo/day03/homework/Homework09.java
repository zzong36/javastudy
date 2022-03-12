package kr.ac.kopo.day03.homework;

public class Homework09 {

	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print("-");
			}

			for (int k = (6 - i); k >= 1; k--) {
				System.out.print("*");
			}
			for (int l = i; l <= 4; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
