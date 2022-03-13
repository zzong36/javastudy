package kr.ac.kopo.day03.homework;

public class Homework10 {

	public static void main(String args[]) {

		for (int i = 1; i <= 9; i++) {

			if (i <= 4) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				for (int k = 4; k >= i; k--) {
					System.out.print("-");
				}
				for (int l = 3; l >= i; l--) {
					System.out.print("-");
				}
				for (int m = 1; m <= i; m++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i == 5) {
				for (int n = 1; n <= 9; n++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 4; j >= (i-5); j--) {
					System.out.print("*");
				}
				for(int k = 1; k <= (i-5); k++) {
					System.out.print("-");
				}
				for(int l = 2; l <= (i-5); l++) {
					System.out.print("-");
				}
				for(int m = 4; m >= (i-5); m--) {
					System.out.print("*");
				}
				System.out.println();

			}

		}
	}

}
