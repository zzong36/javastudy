package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

/*
  	dd.jpg(입력 장치용) -> dd2.jpg(출력 장치용) 파일로 복사
 */

public class IOMain04 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		// 속도 향상
		BufferedInputStream bis = null; 	
		BufferedOutputStream bos = null;	
		

		try {
			fis = new FileInputStream("iotest/dd.jpg");
			bis = new BufferedInputStream(fis); // buffer를 사용하면 속도가 매우 빨라진다!
			
			fos = new FileOutputStream("iotest/dd3.jpg");
			bos = new BufferedOutputStream(fos);

			long start = System.currentTimeMillis();

			while (true) {
				// 항상 RAM을 거쳐서 저장이 이루어져야 함
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			fos.flush();
//			System.out.println("복사완료...");
//			while(true);	// 0 byte 나오게 됨 -> 종료 버튼을 누르면 이미지가 나오게 됨 why? 나만 쓸 수 있도록 잠금장치(내가 읽고 있는 동안 남이 수정 못하게 함), 아직 권한이 넘어간게 아님 try 자체를 loop한다. 

			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		// 가독성

			FileClose.close(bis,fis);
			FileClose.close(bos,fos);
			
			/*
			FileClose.close(bis); 
			FileClose.close(bos);
			
			FileClose.close(fis);
			FileClose.close(fos);
			 */
		}
		
		/*
		finally {
			
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				if(fis != null)
				fis.close(); // 아래의 fos.close와 함께 묶으면 안됨 why?
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(fos != null)
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		 */
		System.out.println("파일 복사가 완료되었습니다!");

	}

}
