package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String args[]) {
	
		// int[][] arr = new int [3][4]; //[]: 1차원 배열의 갯수 [] : 1차원 배열의 요소, 실제로는 행렬이 아니라 다 1차원 배열로 움직인다
		
		int [] ar01 = new int[4];
		int [] ar02 = new int[4];
		int [] ar03 = new int[4];
		int [][] arr = {ar01, ar02, ar03}; // 꺽쇠를 두 번 붙여야 integer를 만날 수 있음
		
		System.out.println("arr : " + arr + ", arr.length : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : " + arr[i] + " ");
		}
		
		System.out.println();
		for(int i = 0; i < arr[0].length; i++) {
			arr[0][i] = (i+1)*10;
			
		}
		
		for(int i = 0; i < arr.length; i++ ) {

			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
}
