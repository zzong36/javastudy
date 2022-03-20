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
		int sum1 = 0;
		for(int k = i-1; k > 1; k--) {
			if(i % k ==0) {
				sum1 += k;
			}
	}
		if(sum1 == 0) {
			System.out.printf("%d 소수체크: true", i);
		} else {
			System.out.printf("%d 소수체크: false", i);
		}
		
		System.out.println();
		int sum2 = 0;
		for(int k = j-1; k > 1; k--) {
			if(j % k ==0) {
				sum2 += k;
			}
		}
		if(sum2 == 0) {
			System.out.printf("%d 소수체크: true", j);
		} else {
			System.out.printf("%d 소수체크: false", j);
		}
		
	}

}
