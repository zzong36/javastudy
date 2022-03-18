package kr.ac.kopo.day07;


/*
 * 생성자 특징
 * 1. 클래스며과 동일
 * 2. 반환형이 없다.
 * 3. 디폴트 생성자 지원 : 클래스 내에 생성자가 존재하지 않는 경우 JVM이 자동으로 생성
 * 4. 오버로딩 지원
 */

class Car{
	
	Car(){
		
		System.out.println("Car() 생성자 호출...");
	}
	
	Car(int i)  {
		System.out.println("Car(int) 생성자 호출...");
	}
	
	Car(int i, String s)  {
		System.out.println("Car(int, String) 생성자 호출...");
	}
	
}


public class ConstructorMain01 {
	
	public static void main(String args[]) {
	
		Car c = new Car(); // 클래스 Car 내에 생성자가 하나도 정의되지 않았다면 JVM이 자동으로 제공하는 생성자가 있음
		Car c2 = new Car(1);
		Car c3 = new Car(1, "str");
		
		
	}

}
