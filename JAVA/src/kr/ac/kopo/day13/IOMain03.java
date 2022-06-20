package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
  	dd.jpg(입력 장치용) -> dd2.jpg(출력 장치용) 파일로 복사
 */

public class IOMain03 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("iotest/dd.jpg");
			fos = new FileOutputStream("iotest/dd2.jpg");

			long start = System.currentTimeMillis();

			while (true) {
				// 항상 RAM을 거쳐서 저장이 이루어져야 함
				int c = fis.read();
				if (c == -1)
					break;
				fos.write(c);
			}
			fos.flush();
//			System.out.println("복사완료...");
//			while(true);	// 0 byte 나오게 됨 -> 종료 버튼을 누르면 이미지가 나오게 됨 why? 나만 쓸 수 있도록 잠금장치(내가 읽고 있는 동안 남이 수정 못하게 함), 아직 권한이 넘어간게 아님 try 자체를 loop한다. 

			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); // 아래의 fos.close와 함께 묶으면 안됨 why?
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		System.out.println("파일복사가 완료되었습니다!");

	}

}
