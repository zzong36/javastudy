package kr.ac.kopo.day02;

import java.util.Random;

/**
 로또와 관련된 여러가지 기능 클래스
 @author 홍길동
 */
public class LottoUtil {


	public static void main(String args[]) {
		
		Random r = new Random(); //임의의 난수 추출
		r.nextInt(101) ;//임의의 정수형의 난수 추출, 0에서부터 100 사이의 숫자를 추출
		int p = r.nextInt(101);
		
		System.out.println("오늘의 로또 확률은 " +p + "%입니다 ");
		
	}
}
