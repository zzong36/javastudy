package kr.ac.kopo.day07;

public class StringMain02 {
	
	public static void main(String args[]) {
		
		 
		
		// String str = "Hello";
		// String str2 = "Hello";
		String str = new String ("Hello");
		String str2 = new String ("Hello");
		
		if(str == str2) {
			System.out.println("주소비교: 같다");
		} else {
			System.out.println("주소비교: 다르다");
		}
		
		if(str.equals(str2) == true) {
			System.out.println("문자열 비교: 같다"); // 참조변수가 가지고 있는 주소비교
		} else {
			System.out.println("문자열 비교: 다르다");
		}
		
		
	}

}
