package kr.ac.kopo.day12.homework;

import java.util.ArrayList;
import java.util.List;

public class LottoPractice2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i <= 45; i++) {
			list1.add((int) (Math.random() * 45) + 1);
		}

		System.out.println(list1);

		List<Integer> list2 = new ArrayList<>(list1.subList(0, 6));
		System.out.println(list2);

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list2.get(j) == list2.get(i) && i != j) {
					list2.set(j, list1.get(i+5));
				}
			}
		}
		System.out.println(list2);
	}

}
