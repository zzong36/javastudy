package kr.ac.kopo.day12;

/*
 * java.lang 패키지에 있음
 	기본자료형			Wrapper class(참조자료형)
 	boolean			Boolean
 	char			Character
 	byte			Byte
 	short			Short
 	int				Integer
 	long			Long
 	float			Float
 	double			Double
 	
 	
 	class Boolean{
 	private boolean value;
 	}
 */

public class WrapperMain {

	public static void main(String args[]) {
	
		int i = 100;
		
		Integer i2 = new Integer(100);
		Integer i5 = Integer.valueOf(100);
		Integer i3 = 100;	// auto boxing: JVM이 알아서 new Integer(100)로 알아서 잘 바꿔줌
		int i4 = new Integer(100); // auto unboxing
		
		System.out.println(Integer.parseInt("123") + 100); 	// return 값이 기본자료형
		System.out.println(Integer.valueOf("123") + 100);	// return 값이 Wrapper class 참조자료형
		
	}
	
}
