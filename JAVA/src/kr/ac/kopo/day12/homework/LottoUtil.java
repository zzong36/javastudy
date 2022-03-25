package kr.ac.kopo.day12.homework;

/*
 * set
 * ListArray
 */
public class LottoUtil {

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
				} else {
					if (printArr[i] == printArr[j] && i != j) {
						printArr[i]--;
					}
				}

			}
		}

		return printArr;

	}
	
//	public int[] getNumbers3() {
		
//	}
	

}
