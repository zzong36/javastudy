package kr.ac.kopo.day07;

public class Member {
	
	String name; 
	int age;
	String  bloodType;
	/*	String name = 알 수 없음; 이렇게 서도 됨
		int age;
		String  bloodType;
	*/
	
	Member() {
		name = "알 수 없음";
		age = -1;
		bloodType = "알 수 없음";
	}
	
	Member(String n) {
		this.name = n;
		this.age = -1;
		this.bloodType = "알 수 없음";
		
	}
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
		bloodType = "알 수 없음";
		
	}
	/*
	 
	Member(String n, int a, String bt) {
	 	this. name = n; // this를 써주는게 더 일반적이다. 
		age = a;
		bloodType = bt;
	}
	 */
	
	Member(String name, int age, String bloodType) {
		this.name = name; // 지역변수와 매개변수를 ㅜ부하기 ㅟ해
		this.age = age;
		this.bloodType = bloodType;
	}
	
	
	
	
	
	
	void info() {
		System.out.println("이름 : " + name + " 나이: " + age + " 혈액형 : " + bloodType); // 자신의 인스턴스 객체가 heap에서 사라질 때가지 값을 저장함

	}

}
