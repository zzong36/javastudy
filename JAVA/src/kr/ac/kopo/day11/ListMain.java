package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;

/*
 * List : 순서 O, 중복 O
 * ArrayList
 * LinkedList
 * 
 * add()
 * get()
 * size()
 * remove()
 * isEmpty()
 * contains()
 * clear()
 */

public class ListMain {
	
	public static void main(String args[]) {
		
//		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();	// 생략가능
		List<String> list = new LinkedList<>();	// Linked로 해도 문제없이 돌아감
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		System.out.println("전체 원소의 개수 : " + list.size()+ "개");
		
		System.out.println("< PRINT >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("<1.5 버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
