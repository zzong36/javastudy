package kr.ac.kopo.day03.homework;

public class Homework08 {

	public static void main(String args[]) {

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 2; j <= i; j++) {
					System.out.print("-");
				}
				for(int k = 5; k >= i; k--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int l = 4; l>=(i-4); l--) {
					System.out.print("-");
				}
				for(int m = 1; m <= (i-4);m++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
