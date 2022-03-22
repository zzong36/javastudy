package kr.ac.kopo.day09;

class A { 	// 모든 클래스는 Object를 상속 받으므로 A도 Object를 상속 받는다. 
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		System.out.println("C() 호출...");
	}
}

public class ExtendsMain02 {
	
	public static void main(String[] args) {
		
//		new A();
//		new B();
		new C();
	}

	
}
