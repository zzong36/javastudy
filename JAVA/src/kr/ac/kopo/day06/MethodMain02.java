package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	
	void 냐옹거린다() {
		System.out.println("고양이가 냐옹합니다");
	}
	
	
}

class Method{ // Method 클래스가 여기에 만들어져있기 때문에 다른 곳에 동일하게 만들 수 없음
	// 메소드 오버로딩(overloading)
	// 같은 클래스 내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른 것
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) { //JAVA는 메소드를 구분하는 구분자가 메소드 이름 + 매개변수 타입으로 구분하므로 다른 매개변수 타입이면 다른 메소드로 인식한다.
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(boolean d) {
		
		System.out.println("call(boolean) 메소드 호출...");
	}
	
	void call(String str, int n) {
		
		System.out.println("call(string, int) 메소드 호출...");
	}
	
	
	
	
}

public class MethodMain02 {
	public static void main(String args[]) {
		
		Method m = new Method();
		m.call(); 
		m.call(10);
		m.call(10.1);
		m.call(true);
		m.call("hello", 5); // 순서가 중요하다 m.call(5, "hello") 안 됨
		
		고양이 나비 = new 고양이();
		
		나비.냐옹거린다(); // 멤버변수와 비슷하군
		
	}
	
	

}
