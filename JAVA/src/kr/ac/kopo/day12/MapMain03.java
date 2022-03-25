package kr.ac.kopo.day12;

public class MapMain03 {
	
	public static void main(String args[]) {

		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) {	 // 실제로 주소값을 비교. 내용이 같은지를 보려면 equals method를 오버라이딩 해야 한다.  
		System.out.println("m == m2");	
		} else {
			System.out.println("m != m2");
		}
	}
}	
		
	


/*
		String s01 = new String("hello");
		String s02 = new String("hello");
		
		if(s01.equals(s02)) {	// 객체간 비교를 위해서는 equals를 써야 함
 */

