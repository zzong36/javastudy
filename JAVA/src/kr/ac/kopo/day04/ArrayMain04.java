package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {
	
	public static void main(String args[]) {
		
		int[] arr = new int [] {10, 20, 30, 40, 50};
		
		// arr = {5, 4, 3}; 컴파일 시 에러가 발생 왜냐하면 {}는 배열의 선언할 때만 사용할 수 있기 때문
		 arr = new int[] {5,4,3}; // 초기화는 이렇게 해야 함
		
		System.out.println("arr : " + Arrays.toString(arr));
		
	}

}
