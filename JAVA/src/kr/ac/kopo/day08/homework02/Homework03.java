package kr.ac.kopo.day08.homework02;

public class Homework03{

	public static void main(String args[]) {

		int num = (int) (Math.random() * 10);
			for (int i = 0;i <= 100; i++) { // 어떻게 범위를 제한할 수 있을까요?ㅜㅜ
				if(num < 1 || num > 4) {
					num = (int) (Math.random() * 10);
				}
			}
		
		System.out.println("랜덤 숫자: " + num);
		Shape s = new Shape();

			switch (num) {
			case 1:
				s.square();
				break;
				
			case 2:
				s.rectangle();
				break;
				
			case 3:
				s.triangle();
				break;
				
			case 4:
				s.circle();
				break;
			}


	}

}
