package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);

	public String select() {
		System.out.println("프린터를 선택하세요(1.LG 2.SAMSUNG 3. HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	public void print(String type) {
		Printer p = null;
		switch(type) {
		case "1" :
			p = new LGPrinter(); // LGPrinter가 아니라 
			break;
		case "2" :
			p = new SamsungPrinter();
			break;
		case "3" :
			p = new HPPrinter();
			break;
			
		}
		
		if(p != null) {
			p.print();
		}
		
		/*
		switch(type) {
		case "1" :
			Printer lg = new LGPrinter(); // LGPrinter가 아니라 
			lg.print();
			break;
		case "2" :
			Printer sam = new SamsungPrinter();
			sam.print();
			break;
		case "3" :
			Printer hp = new HPPrinter();
			hp.print();
			break;
		}
		 */
	}
	
	public void process() {
		String type = select();
		print(type);
	}
	

	/*
	public Menu() {
		this.sc = new Scanner(System.in);
	}
	 */
}
