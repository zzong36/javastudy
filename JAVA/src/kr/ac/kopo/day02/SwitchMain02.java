package kr.ac.kopo.day02;

public class SwitchMain02 {

		public static void main(String args[]) {
			/* String a = new String("Hello");
			
			System.out.println(a == "Hello"); // 문자는 동등 비교가 먹히지 않는다.
			System.out.println(a.equals("Hello"));
		 */
			String a = new String("Hello");
			
			switch (a) {
			case "Hello": // 문자열 비교에는 switch문이 더 편하다, 메뉴 화면을 구성할 때 사용, 일반적으로는 if 문을 더 사용
				System.out.println("true");
				break;
			default:
				System.out.println("false");
					
			}
			
			
		}
}
