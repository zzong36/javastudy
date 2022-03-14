package kr.ac.kopo.day03.homework;

public class Homework07 {

	public static void main(String args[]) {

		for (int i = 2; i <= 9; i += 3) {

			for (int j = i; j <= i + 2; j++) {
				if (j < 10) {

					System.out.printf("*** %d단 *** ", j);
				}

			}
			System.out.println();
			for (int h = 1; h <= 9; h++) {
				if (i <= 7) {
					System.out.printf("%d * %d = %2d  %d * %d = %2d  %d * %d = %2d%n", i, h, i * h, i + 1, h,
							(i + 1) * h, i + 2, h, (i + 2) * h);
				} else if (i < 10) {
					System.out.printf("%d * %d = %2d  %d * %d = %2d%n", i, h, i * h, i + 1, h, (i + 1) * h);

				}

			}
			System.out.println();
		}
		System.out.println();
	}

}
