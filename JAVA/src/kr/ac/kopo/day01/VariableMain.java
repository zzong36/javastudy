package kr.ac.kopo.day01;

public class VariableMain {

	char b; // 멤버변수 자동초기화됨 
	
	/*
	 변수 선언과 동시에 초기화도 가능함
	 
	 같은 자료형의 변수 여러 개의 선언 가능
	 자료형 변수명 1, 변수며 2, 변수명3, ...
	 
	 */
	
	public static void main(String args[]) {
		
		char a; //지역변수, 초기화 자동설정 안 됨	
		a = 'A';
		System.out.println(a);
		
		int c = 0;
		System.out.println(c);
		
		//실수 3개를 저장하기 위한 변수 d1, d2, d3 선언
		//double d1, d2, d3; 각각 초기화 할 수 있다. 초기화 할 때 초기화하지 않은 변수는 앞에 배치하는 것이 원칙
		
		
	}
	
}
