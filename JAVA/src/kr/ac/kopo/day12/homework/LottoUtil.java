package kr.ac.kopo.day12.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LottoUtil {

	private Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.print("게임 수를 입력하세요: ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			System.out.println("게임 " + (i + 1) + " : " + Arrays.toString(getNumbers1()));
//			System.out.println("게임 " + (i + 1) + " : " + Arrays.toString(getNumbers2()));
//			System.out.println("게임 " + (i + 1) + " : " + getNumbers3());
//			System.out.println("게임 " + (i + 1) + " : " + getNumbers4());
//			System.out.println("게임 " + (i + 1) + " : " + getNumbers5());
		}
	}

	public int[] getNumbers1() {

		// 1. [배열] 랜덤하게 자리 바꿈 후 앞의 6자리 추출
		int[] lottoArr = new int[45];

		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = i + 1;
		}

		int tmp = 0;
		int j = 0;

		for (int i = 0; i < lottoArr.length; i++) {
			j = (int) (Math.random() * 45);
			tmp = lottoArr[i];
			lottoArr[i] = lottoArr[j];
			lottoArr[j] = tmp;
		}

		int[] printArr = new int[6];
		for (int i = 0; i < printArr.length; i++) {
			printArr[i] = lottoArr[i];
		}

		return printArr;
	}

	public int[] getNumbers2() {

		// 2. [배열] 같은 값이면 +1만큼 차이남
		int lottoArr[] = new int[45];

		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = (int) (Math.random() * 45) + 1;
		}

		int[] printArr = new int[6];
		for (int i = 0; i < printArr.length; i++) {
			printArr[i] = lottoArr[i];
		}

		for (int i = 0; i < printArr.length; i++) {
			for (int j = 0; j < printArr.length; j++) {
				if (printArr[i] < 45) {
					if (printArr[i] == printArr[j] && i != j) {
						printArr[i]++;
					}
				} else { // 값이 45 이상이면 -1 만큼 차이남
					if (printArr[i] == printArr[j] && i != j) {
						printArr[i]--;
					}
				}
			}
		}
		return printArr;
	}

	public List getNumbers3() {
		// 3. ArrayList 사용
		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i <= 45; i++) {
			list1.add((int) (Math.random() * 45) + 1);
		}

		List<Integer> list2 = new ArrayList<>(list1.subList(0, 6));

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list2.get(j) == list2.get(i) && i != j) { // 중복값이 있다면
					list2.set(j, list1.get(i + 5)); // list1 내의 다른 값으로 대체
				}
			}
		}

		return list2;
	}

	public List getNumbers4() {
		// 4. ArrayList와 try-catch문 사용
		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i <= 45; i++) {
			list1.add((int) (Math.random() * 45) + 1);
		}

		List<Integer> list2 = new ArrayList<>(list1.subList(0, 6));

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				try {
					if (list1.get(i) == list2.get(j) && i != j) {
						throw new SameException("중복 발생");
					}
				} catch (Exception e) {
//					e.printStackTrace();
					list2.remove(j); // 중복값 모두 제거
					list2.add(list1.get(i + 6)); // 제거된 중복값 자리에 중복없이 다른 값 채우기
				}
			}
		}
		return list2;
	}

	public Set getNumbers5() {
		
		// 5. HashSet 사용
		Set<Integer> set = new HashSet<>();

		for (int i = 0; set.size() < 6; i++) {
			set.add((int) (Math.random() * 45) + 1);
		}
		return set;

	}

}
