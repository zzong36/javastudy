package kr.ac.kopo.day02;
/*
 * 반복문을 위한 기본요소 4가지
 * 1. 반복할 문장(statement)
 * 2. 시작값(init)
 * 3. 증가/감소(incre/decre)
 * 4. 종료조건(expr)
 * 
 * 한 바퀴 뒬 차례다; // 초기화
 * while(열바퀴 다 뛰었냐?){
 * 운동장 한 바퀴 뛴다; // 제어를 가하는 문장은 block안에 넣는다.
 * 바퀴 수 증가
 * 
 * } 
 * 1. init
 * while(2.expr) {
 *  3. statement;
 *  4. incre/decre
 * }
 * 
 * 1 > 2>3>4
 *  2>3>4
 *  2>3>4
 *  2>3>4
 *  2 false >5
 * 
 * -------------------------------------------------------------
 * 	for( 1.init; 2.expr; 3.incre/decre) {
 * 	4.statement;
 * }
 * 5.
 * 
 * 1 -> 2 -> 4 조건이 참이 되는 순간 block scope 안의 문자을 수행한다 -> 3 block scope가 끝나면 증가한다
 * 	-> 2 조건 참 -> 4 -> 3 
 * 	-> 2 조건 참 -> 4 -> 3 
 * 	-> 2 조건 거짓 -> 5 
 * 
 */

public class LoopMain01 {

	public static void main(String args[]) {
		
		System.out.println("--------- 반복문 시작 --------------");
		
		//boolean boo1 = false; // true이면 무한 loop
		
		
		for (int cnt = 1; cnt <= 5; cnt++) { //여기에서만 선언되는 변수이므로 영향을 주지 않는다. 원칙적으로 동명의 변수가 존재하면 안 된다. for을 위로 올리면 에러가 나지 않는다.
			System.out.println("Hello");
		} //여기서 cnt 변수의 생명주기가 끝나버림
		System.out.println("--------- 반복문 종료 --------------");
		
		
		 int cnt = 1; //변수의 Life cycle은 blockscope를 따른다. Thus, 만약 while문이  for문보다 위에 있다면 에러가 나게 된다. while 문 밖에 있음
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		System.out.println("--------- 반복문 종료 --------------");
		
		 

	} // 여기까지 cnt 변수가 살아 있다가 죽게 된다. 
	
}
