package kr.ac.kopo.day08.extend2;

public class Manager extends Employee {
	
	Employee [] emplist;

	public Manager() {
	}

	public Manager(String name, int salary, String grade, Employee[] emplist) {
		super(name, salary, grade);
		this.emplist = emplist;
	}

	

}
