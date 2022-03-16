package kr.ac.kopo.day06;


public class MethodMain01 {
	//반환형 메소드명([파라미터]), 피호출자
	static int printStar(char ch, int cnt) { // 메소드는 클래스 안에 정의되야하며 항상 소문자로 시작하고, printStar는 별을 찍는 메소드// 순서(문자, 정수)가 뒤바뀌면 안 됨
	// 메소드와 라이프사이클이 같기 때문에 메소드를 벗어나면 생명주기가 끝난다 
		
	for(int i = 0; i < cnt; i++) {
		
		System.out.print(ch);
	}
	System.out.println();
	return ch + cnt; //나를 호출한 메서드로 돌아감을 의미한다. 밑에 찍은 메소드는 의미가 없어진다.
					 // return으로 전달할 수 있는 값은 오직 하나
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		if(bool) {
			return;
		}
		System.out.println("C");
		System.out.println("D");
		return;
	}
	
	public static void main(String args[]) {// Main이 호출자, printStar와 Main은 서로 각각 기능한다. 
	
	int code = printStar('A', 10); // 자동 초기화, int code는 printStar에서 날아오는 변수값을 받을 수 있게 해줌
	// 대입연산자를 통해 딱 하나의 값만 받아 올 수 있음
	System.out.println("Hello");

	printStar('B', 20);
	System.out.println("Hi");
	
	printStar('a', 5);
	System.out.println("Bye");
	printStar('z', 8);		
	}

	
}
