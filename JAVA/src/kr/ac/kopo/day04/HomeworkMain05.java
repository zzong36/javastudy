package kr.ac.kopo.day04;

public class HomeworkMain05 {
	
	public static void main(String args[]) {

		int star = 1;
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				if(j <= star || j >= 10 - star) {
					
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				
			}
			System.out.println();
			if(i < 5) {
				star ++;
			} else {
				star --;
			}
				
		}	
	}
	

}
