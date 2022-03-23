package kr.ac.kopo.day10.homework;

public class Practice01 {

	public static void main(String args[]) {

		for (int i = 1; i <= 31; i+=7) {
			for(int j = i; j <= i+ 6; j++) {
				System.out.printf("%02d ", j);
			}
			System.out.println();
			}
		}

	}

