package kr.ac.kopo.day10;

import java.util.Random;

/* final */ class Super {
	private /* final */ double PI = 3.14;

	Super() {
		PI = 3.141592;
	}

	/* final */ void call() {
		System.out.println("Super:: call()");
	}

}

class Sub extends Super {

	void call() {
		System.out.println("Super:: call()");
	}

}

class MyRandom extends Random {
	// nextInt(10)+1 1~10

	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}

	public int nextInt(int start, int end) {
		return super.nextInt(end - start) + start;
	}

}

public class FinalMain {

	public static void main(String args[]) {

		MyRandom r = new MyRandom();
		int random = r.nextInt(2);
		System.out.println(random);

//		Random r = new Random();
//		int random = r.nextInt(90)+10; // 10부터 99까지의 숫자가 나옴
//		int random = r.nextInt(10)+1; // 1부터 10까지의 숫자가 나옴

	}

}
