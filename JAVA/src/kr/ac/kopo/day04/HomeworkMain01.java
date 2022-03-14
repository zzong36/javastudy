package kr.ac.kopo.day04;

public class HomeworkMain01 {

	public static void main(String args[]) {

		int step = 3;

		for (int dan = 2; dan <= 9; dan += step) {

			for (int i = 0; i <= 9; i++) {

				for (int j = dan; j < dan + step && j <= 9; j++) {
					if (i == 0) {
						System.out.printf("*** %d단 ***\t", dan);
						
					} else {
						
						System.out.printf("%d * %d = %d\t", dan, i, dan * i);
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
