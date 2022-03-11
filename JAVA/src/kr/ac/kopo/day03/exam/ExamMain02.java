package kr.ac.kopo.day03.exam;

	/*
	 * for(int i = 1; i<=5; i++){
	 * if(j<i) {
	   System.out.print('-');
	   } else {
	   System.out.print('*');
	   }
	 *  
	 *
	 */

	public class ExamMain02 {

		public static void main(String args[]) {

			// 1
			System.out.println("1번 문제");
			for (int i = 1; i <= 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(i);
				}
				System.out.println();
			}

			System.out.println();

			// 2
			System.out.println("2번 문제");
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j);
				}
				System.out.println();
			}

			System.out.println();

			// 3
			System.out.println("3번 문제");
			for (int i = 1; i <= 5; i++) {
				for (int j = 0; j <= 4; j++) {

					System.out.print(i + j);
				}

				System.out.println();
			}
			System.out.println();

			// 4
			System.out.println("4번 문제");
			for (int i = 0; i <= 4; i++) {
				for (int j = 5; j <= 9; j++) {
					System.out.print(j - i);

				}

				System.out.println();
			}

			System.out.println();

			// 5
			System.out.println("5번 문제");
			for (int i = 0; i <= 4; i++) {
				for (int j = i; j >= 0; j--) { // 0에서 부터 0까지
					System.out.print("*");
				}

				System.out.println();
			}

			System.out.println();

			// 6
			System.out.println("6번 문제");
			for (int i = 0; i <= 4; i++) {
				for (int j = i; j <= 4; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();

			// 7
			System.out.println("7번 문제");
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <= 5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println();

			// 8
			System.out.println("8번 문제");
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j >= 1; j--) {
					System.out.print("*");

				}
				System.out.println();
			}
			System.out.println();
			
			// 9
			System.out.println("9번 문제");
			for (int i = 1; i <= 9; i++) {
				if (i <= 5) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
				} else {
					for (int j = 1; j <= 10 - i; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
			// 10
			System.out.println("10번 문제");


			
			
			
			
			
			
			
			
			
		
}
	
}
