package kr.ac.kopo.day09.abs02;

public class Printer {

	private String model;
	
	public Printer(){
		
	}
	
	public Printer(String model) {
		this.model = model;
	}
	
	public void print() {
		System.out.println("프린트 중....");
	}
	
}
