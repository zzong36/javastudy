package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Homework09 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇 개 구입할거야?: ");
		Ice ic = new Ice();
		
		ic.input(); // 아이스크림 이름과 가격 입력창 여는 메소드
		
		ic.info(); // 아이스크림에 대한 종합적인 정보를 보여주는 메소드
		
		
		
		
	}

}
