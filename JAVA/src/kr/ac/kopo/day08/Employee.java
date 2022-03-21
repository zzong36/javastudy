package kr.ac.kopo.day08;

public class Employee {

	String name;
	int salary;
	String grade;
	static int employeeCnt;

	Employee() {
		Employee.employeeCnt++;

	} // 매개변수가 있는 생성자를 만들 때는 기본 생성자를 하나 만들어 주는 것이 좋다.

	Employee(String name, int salary, String grade) {

		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}

	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}

	static void employeeCntInfo() {
		System.out.println("총 사원수: " + Employee.employeeCnt + "명"); // 클래스명까지 써주는 것이 가독성이 더 좋다.
	}

}