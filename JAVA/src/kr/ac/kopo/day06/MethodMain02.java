package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	
	void 냐옹거린다() {
		System.out.println("고양이가 냐옹합니다");
	}
	
	
}

public class MethodMain02 {
	public static void main(String args[]) {
		
		고양이 나비 = new 고양이();
		
		나비.냐옹거린다(); // 멤버변수와 비슷하군
	}
	
	

}
