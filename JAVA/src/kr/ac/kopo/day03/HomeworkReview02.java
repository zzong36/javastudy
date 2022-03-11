package kr.ac.kopo.day03;

public class HomeworkReview02 {
	
	public static void main(String args[]) {
		
		//System.out.println(Math.random()); 랜덤하게 나온다
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		int num4 = (int)(Math.random()*10);
		
		System.out.printf("%d : %d : %d : %d%n", num1, num2, num3, num4);
		
		int max = num1 > num2 ? num1 : num2;
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		
		System.out.printf("가장 큰 수 : %d", max);
	}

}
