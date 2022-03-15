package kr.ac.kopo.day05;

public class ArrayMain08 {

	public static void main(String args[]) {

		String[] strArr = new String[3];
		strArr[0] = "hello";
		strArr[1] = new String("good");
		strArr[2] = "bye bye";

		/*
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		*/
		System.out.print(strArr);
		
		for(String str : strArr) {
			System.out.println(str);
		}
		

	}

}
