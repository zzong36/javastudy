package kr.ac.kopo.day07.homework;

public class Calculator {

	void add(int i, int j) {
		System.out.printf("%d + %d = %d%n", i, j, i+j);
	}

	void subtract(int i, int j) {
		System.out.printf("%d - %d = %d%n", i, j, i-j);
	}

	void multiply(int i, int j) {
		System.out.printf("%d * %d = %d%n", i, j, i*j);
	}

	void divide(int i, int j) {
		System.out.printf("%d / %d = %.2f%n", i, j, (double)i/j);
	}
	
	
	void check(int i, int j) {
		for(int k = i-1; k > 1; k--) {
			if(i % k != 0) {
				System.out.println("true");
			}
		}
		
	}

}
