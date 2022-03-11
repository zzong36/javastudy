package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String args[]) {
		
		int a = 1, b = 0, c = -1;
		
		//boolean bool = ++a > 1 || ++b > 1;  관계연산자가 가장 먼저 계산됨, 앞의 연산자가 참이기 때문에 뒤는 볼 필요도 없음
		//boolean boo2 = --a > 1 && ++b > 1 || ++c > 0; // 왼쪽에서 오른쪽으로 계산 됨 F니깐 b 값은 볼 필요도 없음, c 값은 봐야 하므로 0
		//boolean boo3 = a++ > 0 || b-- >= 0 && c++ <= 0; 
		boolean boo4 = a++ > 0 && b-- >= 0 || c++ <= 0; 
		
		
		System.out.println("boo4 :"  + boo4);
		System.out.println("a : " + a + ", b: " + b + ", c : " +c );
		System.out.println();
		
	}
	
}
