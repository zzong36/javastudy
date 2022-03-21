package kr.ac.kopo.day08.extend;

public class Employee {
	
	String name; // public은 누구나 그 값에 접근할 수 있다. 반면 private은 Employee라는 클래스에서만 접속할 수 있고 상속되어도 볼 수 없다.  
	int salary;
	String grade;
	
	Employee(){
		
	}
	
	public Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}

	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	
}
