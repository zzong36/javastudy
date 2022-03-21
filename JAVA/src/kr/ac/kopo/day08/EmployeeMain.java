package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//System.out.printf("총사원수: %d%n", Employee.employeeCnt);
		
		Employee.employeeCntInfo();	// 입사한 사원 수를 어떻게 알 수 있을까?
		System.out.println();
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");

		e.info(); 	// 은닉성을 위해 e.name은 쓰지 향후 쓰지 않도록 노력한다.
		e2.info();
		
		System.out.println();
		
		Employee.employeeCntInfo();	// 클래스 이름으로 접근하게 한다. 

		
		

		

	}

}
