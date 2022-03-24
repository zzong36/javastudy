package kr.ac.kopo.day111;

import java.util.Random;

public class ExceptionMain01 {

	
	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(3); // 0, 1, 2
		System.out.println("num : " + num);
//		if(num != 0)을 쓰지 않는 이유: 내가 예상 못한 예외까지 안전하게 처리하도록 예외처리를 해준다. 거기에 강제성까지 부여할 수 있다. 
		System.out.println(10/num);
		System.out.println("main end..."); // 예외가 발생하면 14줄은 처리되지 않는다. 
		
	}
}
