package kr.ac.kopo.day03.homework;

public class Homework03 {

	public static void main(String args[]) {

		final int VELOCITY = 5;

		for (int hour = 1; hour <= 22; hour++) {
			if (hour * (VELOCITY - 1) < 50) {
				System.out.printf("[%d시간후] 달행이가 올라간 총 높이: %dM%n", hour, (VELOCITY - 1) * hour);
			} else {
				System.out.printf("[%d시간후] 달행이가 올라간 총 높이: %dM%n", hour, (VELOCITY - 2) * (hour + 12));
			}
		}
		System.out.println("달팽이 탈출 성공!!");
	}
}
