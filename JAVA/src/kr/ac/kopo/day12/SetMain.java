package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  Set : 순서(x), 중복(x)
  - Hashset
  - Treeset
 */
public class SetMain {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>(); // 알파벳 오름차순의 형태를 취함
		System.out.println("\"one\" 입력성공여부 : " + set.add("one"));
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one"); // set은 중복을 허용하지 않기 때문에 원소의 개수는 불변
		System.out.println("\"one\" 입력성공여부 : " + set.add("one")); // 중복 불가
		
		System.out.println("전체 원소의 개수: " + set.size() + "개");
		
		/*
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5버전의 for문 이용
		 * 2. toArray() 메소드 이용
		 * 3. Iterator 객체를 이용 
		 */
		
		System.out.println("<1.5 for문 이용한 출력>");
		for(String str : set) {
			System.out.println(str); // 순서가 다른 이유: 자바 자체적인 hash코드에 맞춰서 출력됨
		}

		System.out.println();
		System.out.println("<toArray() 이용한 출력>"); //set에 있는 내용을 object 배열의 형태로 접근한다.
		Object[] arr = set.toArray(); // 모든 클래스는 Object 클래스를 상속하기 때문인가? 묵시적 형변환
		
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i] + " " ); // arr[i]의 타입은 object형이지만 출력가능하다 b/c .toString을 저절로 호출하기 때문
		}
	
		/*
		 * Iterator(순환객체) 주요 메소드
		 	- hasNext(): 내 뒤에 데이터가 있는지 여부 판단 true or false로 나옴
		 	- next()   : 데이터 접근 		
		 */
		
		System.out.println();
		System.out.println();
		System.out.println("<Iterator 이용한 출력 >");
		Iterator<String> ite = set.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}
}
