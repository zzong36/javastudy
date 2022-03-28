package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);// byte 형태를 2개씩 묶어서 문자 stream의 형태로 바꾸어 줌
		System.out.println("키보드 입력을 하세요. ctrl+z 입력 시 종료됩니다.");

		while (true) {
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
