package kr.ac.kopo.day08.homework02;

public class Shape extends Figure {

	void square() {
		int area;
		area = super.width * super.width;
		System.out.printf("길이 : %d%n", super.width);
		System.out.printf("정사각형의 면적은 %d 입니다", area);	
	}
	
	void rectangle() {
		int area;
		area = super.width * super.height;
		System.out.printf("길이 : %d, 높이 : %d%n", super.width, super.height);
		System.out.printf("직사각형의 면적은 %d 입니다", area);
	}
	
	void triangle() {
		int area;
		area = (super.width * super.height)/2;
		System.out.printf("길이 : %d, 높이 : %d%n", super.width, super.height);
		System.out.printf("삼각형의 면적은 %d 입니다", area);
	}
	
	void circle() {
		double area;
		area = super.radius * super.radius* super.PI;
		System.out.printf("반지름 : %d%n", super.radius);
		System.out.printf("원의 면적은 %f 입니다", area);
	}
	
}
