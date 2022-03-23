package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String args[]) {
		
		// Child01 c = (Child01) new Parent();
		
		Parent p = new Child01(); // 묵시적 형변환
		Child01 c2 = (Child01)p;  // 명시적 형변환 참조변수를 저장하는 것(이 두 단계를 거쳐서 명시적 형변환이 가능해진다)
		
		p.print();
		c2.sleep();
		c2.study();
	}
	
}
