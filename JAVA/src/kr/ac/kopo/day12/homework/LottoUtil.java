package kr.ac.kopo.day12.homework;

/*
 * set
 * ListArray
 */
public class LottoUtil {

	public int[] getNumbers2() {

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
	
//	public int[] getNumbers2() {
		
	
		
//	}

}
