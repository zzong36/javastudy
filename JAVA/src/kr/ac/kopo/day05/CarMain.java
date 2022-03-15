package kr.ac.kopo.day05;

// 실행 클래스
public class CarMain {
	
	public static void main(String args) {
		
		Car c = new Car(); // 클래스명은 대문자로 써야 함
		c.name = "소나타"; // 멤버변수 이름 접근 참조변수를 통해 접근
		
		Car c2 = new Car(); // Car라는 클래스를 가지고 두 개의 인스턴스 객체를 만듦
		c2.name = "K9";
		
	}

}
