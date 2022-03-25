package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class LottoStart {

	private Scanner sc = new Scanner(System.in);
	
	LottoUtil lu = new LottoUtil();

	public void start() {
		System.out.print("게임 수를 입력하세요: ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
//			System.out.println("게임 " + (i + 1) + " : " + Arrays.toString(lu.getNumbers1()));
//			System.out.println("게임 " + (i + 1) + " : " + Arrays.toString(lu.getNumbers2()));
//			System.out.println("게임 " + (i + 1) + " : " + Arrays.toString(lu.getNumbers3()));
		}
	}
	
}
