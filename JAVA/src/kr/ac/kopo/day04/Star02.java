package kr.ac.kopo.day04;

public class Star02 {

	public static void main(String args[]) {

		
		int star = 1;
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				if(j<= 5-star || j >= star+5) {
					
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

