package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String args[]) {

		// String [] strArr = {"데이터분석", "자바", "교육"};
		String[] strArr = new String[5];

		int loc = 0; // location을 설정해주면 상수 값을 넣을 때 보다 더 유연하게 데이터를 관리할 수 있다.

		strArr[loc++] = "폴리텍";
		strArr[loc++] = "데이터분석";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";

		System.out.println("문자열의 총 개수 :" + strArr.length + "개");

		/*
		 * 배열의 전체 원소를 출력 방식 
		 * 1. index를 이용한 출력(원소접근: 0번지 ~ length-1) 
		 * 2. 1.5버젼의 for문을 이용한 출력
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */

		System.out.println("< index를 이용한 출력 >");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		System.out.println("< 1.5버젼의 for문 이용 출력 >");

		for(String s : strArr) { // 모든 번지 수의 요소들을 s가 갖게 되므로 출력된다.
			System.out.println(s);
		}
		
		
		System.out.println("<Arrays.toString() 메소드를 이용 출력 > "); // 배열의 모든 요소를 하나의 문자열로 만들어 주는 메소드
		Arrays.toString(strArr); //"[원소, 원소, 원소, ....]" 의미
		String result = Arrays.toString(strArr);
		System.out.println(result);
		
	}

}
