package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File dirObj = new File("iotest");
		if (dirObj.exists()) {

			File[] list = dirObj.listFiles(); // 배열로 만들어줘야 함
			for (File f : list) {
				System.out.print(f.isDirectory() ? "디렉토리: " : "파일: ");
				System.out.println(f.getName());
			}

		}

//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() ? "디렉토리" : "파일");
//			}
//		}

		/*
		 * File dirObj = new File("iotest/강아지/리트리버"); System.out.println("존재여부 : " +
		 * dirObj.exists()); System.out.println("디렉토리 여부 : " + dirObj.isDirectory());
		 * System.out.println("파일여부 : " + dirObj.isFile());
		 * 
		 * if(!dirObj.exists()) { dirObj.mkdirs(); // 중간 폴더까지 만들려면 이렇게 써야 함 }
		 */

		/*
		 * File fileObj = new File("iotest/a.txt"); // iotest 아래 a.txt. 가져오기. 현 프로젝트 경로
		 * 아래에 있음. (파일명이 아니라 경로를 가질 수 있다) String fileName = fileObj.getName(); String
		 * parent = fileObj.getParent();
		 * 
		 * System.out.println("파일명 : " + fileName); System.out.println("부모 : " +
		 * parent);
		 * 
		 * System.out.println("파일 존재 여부 : " + fileObj.exists()); // 없으면 false 있으면 true
		 * long fileSize = fileObj.length(); System.out.println("파일 크기 : " + fileSize +
		 * " byte(s)"); System.out.println(fileObj.canRead() ? "읽기 가능" : "읽기 불가능"); //
		 * 읽을 수 있는 여부 판단 System.out.println(fileObj.canWrite() ? "쓰기 가능" : "쓰기 불가능");
		 * 
		 * 
		 * long lastTime = fileObj.lastModified(); // 언제 마지막으로 수정했는지 알려줌 long type
		 * String pattern = "yyyy-MM-dd HH:mm:ss"; SimpleDateFormat sdf = new
		 * SimpleDateFormat(pattern); System.out.println("마지막 수정시간 : " + sdf.format(new
		 * Date(lastTime)));
		 */

	}
}
