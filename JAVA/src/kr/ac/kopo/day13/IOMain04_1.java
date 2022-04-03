package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

/*
  	콘솔모드에서
  	java IOMain04_dd.jpg, dd2.jpg 입력 시
  	dd.jpg ->dd2.jpg 복사
 */

public class IOMain04_1 {

	public static void main(String[] args) {
		
		System.out.println("args : " + Arrays.toString(args)); // dos 모드를 args가 실행

		FileInputStream fis = null;
		FileOutputStream fos = null;

		// 속도 향상
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(args[1]);
			bos = new BufferedOutputStream(fos);

			long start = System.currentTimeMillis();

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 가독성

			FileClose.close(bis, fis);
			FileClose.close(bos, fos);

		}

		System.out.println("파일 복사가 완료되었습니다!");

	}

}
