package kr.ac.kopo.day12.homework;

import java.util.Arrays;

public class LottoPractice {

	public static void main(String[] args) {

		int lottoArr[] = new int[45];

		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = (int) (Math.random() * 45)+1;

		}

		System.out.print(Arrays.toString(lottoArr));

		int[] printArr = new int[6];
		for (int i = 0; i < printArr.length; i++) {
			printArr[i] = lottoArr[i];
		}

		System.out.println();
		System.out.print(Arrays.toString(printArr));
		
		for(int i = 0; i < printArr.length; i++) {
			int search = printArr[i];
		}
		
		if()
		
		
	}

}
