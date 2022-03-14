package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	
	public static void main(String args[]) {
		
		int[] arr = {10, 20, 50, 70, 30};
		// int[] copy = arr; // arr의 배열을 Shallow copy(얕은 복사 /참조변수 복사): arr과 copy 배열이 함께 수정됨 b/c 배열 공간은 하나 참조변수는 2개(Shallow copy)이기 때문
		
		
		// 아예 다른 배열로 복사하기 위해서는 아래와 같이 코드 수행: Deep copy(깊은 복사)
		int[] copy = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			
			copy[i] = arr[i];
		}
		
		System.out.println("arr : " + arr );
		System.out.println("arr : " + copy ); // 서로 다른 참조변수 주소를 가지고 있음
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copy));
		
		
		copy[2] = 100;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copy));
		
		
	}

}
