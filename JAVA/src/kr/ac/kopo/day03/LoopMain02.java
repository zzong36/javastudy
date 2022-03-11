package kr.ac.kopo.day03;

/*
 	while(expr){
 		statement;
 	}// 조건식을 만족하는 동안에는 수행하고 아니면 빠져나간다.
 	
 	
 	
 	for(init; expr; incre){
 	}
 	
 	init;
 	do {
 		statement;
 		incre/decre;
 		} while(expr); // 위의 내용을 반복한다. 이 경우에만 ;을 사용 자바 사용자들은 별로 안 좋아함. do while문은 한 번 덜 돈다
 		
 	
 */

/*int cnt2 = 1;
		do {
			System.out.println("Hello");
			//System.out.println(cnt2);;
			++cnt2;
			System.out.println(cnt2);;
		} while (cnt2 <= 5);
 */

public class LoopMain02 {

	public static void main(String args[]) {

		int cnt = 1;
		do {
			System.out.println("Hello"); // 첫번째는 무조건 돌린다.
			cnt++;
		} while (cnt <= 5);

		
		
	System.out.println("=============================="); // 무한루프 빠져 나오는 법: break 사용
	 cnt = 1;
	 while(true) {
		 System.out.println("Hello");
		 ++cnt;
		 
	if(cnt > 5) {
			break;
	}
	 }
		
		
	}

}
