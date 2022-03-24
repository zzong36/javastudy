package kr.ac.kopo.day11;

import java.io.FileReader;

public class Exception00 {

	public static void main(String[] args) {

		System.out.println("main start...");
		try {
			
			// 반드시 try catch를 해야 하는 것도 있다
			FileReader fr = new FileReader("a.txt"); // 외부파일을 확인하는 것 compile 시점의 예외처리: checked Exception
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("main end...");
	}

}
