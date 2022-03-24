package kr.ac.kopo.day11;

import java.util.Random;

class A {
	private Object data;
	
	A(Object data){
		this.data = data;
	}
	
	Object getData() {
		return data;
	}
	
	void setData(Object data) {
		this.data = data;
	}
}

class B<T> {
	private T data;
	
	B(T data){
		this.data = data;
	}
	
	T getData() {
		return data;
	}
	
	void setData(T data) {
		this.data = data;
	}
}

public class GenericMain {
	
	public static void main(String[] args) {
		
		B<String>  b = new B<String>(new String("hello"));
		System.out.println("길이 : " + b.getData().length()); // 형변환이 필요 없음 자연스럽게 구하면 됨
		
		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + b2.getData().nextInt(10)+1);
		
		B<String> b3 = new B<String>("bye bye");
		b3.setData("aa");
		
		// Generic을 쓰는 과정에서 묵시적과 명시적 형변환을 줄여버림
		
		A a = new A(new String("hello"));
		String data = (String)a.getData(); // Object형이 날라옴
		System.out.println("길이 : " + data.length());
		
		A a2 = new A(new Random());
		int random = ((Random)a2.getData()).nextInt(10)+1;
		System.out.println("추출된 정수 : " + random);
		
		// 매번 변환하는 것이 귀찮기 때문에 Generic을 사용
	}

}






