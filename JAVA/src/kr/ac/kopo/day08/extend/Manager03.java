package kr.ac.kopo.day08.extend;

public class Manager03 extends Employee {

	Employee[] empList; // 관리사원 목록

	Manager03() {
	}

	Manager03(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade); // 매개변수가 있는 생성자는 생략할 수 없으므로 명시적으로 적어야 한다. 
		this.empList = empList;
	}

	@Override
	void info() {

		super.info();

		System.out.println("-------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("-------------------------------");
	}

}
