package kr.ac.kopo.day09;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	public static void print(Parent p) {
		p.print();
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		} else {
			
		}
		
		//System.out.println("Child01 : "+ (p instanceof Child01)); // 상속 관계에서만 사용 가능
		//System.out.println("Child01 : "+ (p instanceof Child02)); 
		//System.out.println("Child01 : "+ (p instanceof Parent)); 
		
	}
	
	public static void main(String[] args) {

		 print(new Parent()); // Parent의 인스턴스 객체를 생성하고 print한다는 뜻?
		// print(new Child01());
		//print(new Child02());
		
		
		
		
		
		/*
		Child01 c01 = new Child01();
		print(c01);
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		print(p);
//		p.print();
		
		 */
		
	}

}
