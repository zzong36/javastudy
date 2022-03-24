package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		for (int i = 0; i < 5; i++) {
			try {
				if (i == 3) {
					FileReader fr = new FileReader("a.txt"); // checked Exception
				}

			} catch (FileNotFoundException fnfe) {
//				fnfe.printStackTrace();
				System.out.println("예외발생 : " + fnfe.getMessage());
				break;
			} finally { // 자원을 관리하여 타인이 이용할 수 있도록 하는 경우  
				System.out.println("loop...");
			}
		}
		System.out.println("main end...");
		
	}
}







