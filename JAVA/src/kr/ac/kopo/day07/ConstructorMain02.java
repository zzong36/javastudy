package kr.ac.kopo.day07;

public class ConstructorMain02 {
	
	public static void main(String args[]) {
		
		Member m = new Member();
		Member m2 = new Member("홍길동");
		// m.name은 은닉성이 확보되지 않음
		Member m3 = new Member("윤길동", 22);
		Member m4 = new Member("한길동", 22, "0");
		
		
		m.info(); // 초기화 상태
		m2.info(); 
		m3.info(); 
		m4.info();
		
	}

}
