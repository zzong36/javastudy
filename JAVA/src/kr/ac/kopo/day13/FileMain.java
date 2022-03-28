package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		File fileObj = new File("iotest/a.txt"); // iotest 아래 a.txt. 가져오기. 현 프로젝트 경로 아래에 있음.
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);
		System.out.println("파일 존재 여부 : " + fileObj.exists()); // 없으면 false 있으면 true
				
				
	}

}
