package kr.ac.kopo.day09.abs02;

public class LGPrinter extends Printer {
	
	public LGPrinter() {
		
	}
	
	public LGPrinter(String model) {
		super(model);
	}

	@Override
	public void print() {
		System.out.println("LG 프린터에서 출력 중");
	}

	
	
	
}
