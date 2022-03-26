package kr.ac.kopo.day12.homework;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoPractice {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; set.size() < 6; i++) {
			set.add((int) (Math.random() * 45) + 1);
		}

		System.out.print(set);
	}
}
