package kr.ac.kopo.day01;

public class VariableMain02 {
	public static void main(String args[]) {
		
		//"Hello" 문자열을 저장하기 위한 변수 str 선언
		// String str;
		// str = "Hello";
		
		// String str = "Hello"; String이라는 클래스는 new를 안 써도 만들어질 수 있다.
		
		String str = new String("Hello"); //이게 원칙임, heap에 만들어짐, str은 참조변수(reference or pointer in c)
	
		
		System.out.println(str);
	
	}

}
