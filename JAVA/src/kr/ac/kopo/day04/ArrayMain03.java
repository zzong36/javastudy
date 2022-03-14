package kr.ac.kopo.day04;

public class ArrayMain03 {
	
	public static void main(String args[]) {
		
		int [] arr = new int[5];
		
		/* for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i+1;
		}
		*/
		
		
		/* 1) index를 이용한 출력
		 *  for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		*/
		
		
		// 2) 1.5 버전을 이용한 출력 (단순 출력 용도, 실제 배열의 값을 입력받거나 수정하지는 못 한다)
		int data = 1;
		for ( int num : arr) { // num은 복사본이므로 저장되지 않음 그러므로 값을 입력받거나 수정받는 용도로는 사용할 수가 없다.
			
			num = data++; // data는 임시 저장소의 개념이므로 한 사이클 동안에만 값을 임시로 복사해 저장하고 잇다. 
		}
		
		System.out.println("< PRINT >");

		for(int num : arr) {
			System.out.print(num + "\t"); // 1.5버젼 for문을 이용해서 출력
			
		}
		 
	}

}
