package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String args[]) {
		int a;
		byte b = 10;
		
		a = (int)b; // 묵시적 형변환: = 은 대입 연산자, 원칙은 양측 연산자의 자료형이 같아야 한다
		b = (byte)a; // 명시적(강제적) 형변환: 꼭 적어야 함
		
		System.out.println(10 + 20.3); // 무조건 큰 수의 타입을 따라가게 된다(묵시적 형변환)
		System.out.println(10 + (int)20.3); // 더 작은 타입으로 출력하기 위해서는 명시적 형변환이 필요하다.
		
		double d = 10 +20.2; // 더하기 연산일때만 형변환이 이루어짐
		int i = 10 + (int)20.2;
		int c = (int)(10 + 20.2);
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		
		final int NUM = 100;
		System.out.printf("num : %d%n", NUM);
		
		char ch = '!';
		ch = '\'';// 작은 따옴표
		System.out.println(ch);
		
		String path = "D:\\Lecture\\java-workspace\\JAVA\\src\\kr\\ac\\kopo\\day01";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);
	
		
	}
}
