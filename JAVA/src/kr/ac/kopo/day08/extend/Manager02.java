package kr.ac.kopo.day08.extend;


// 관리자(Manager02)는 사원(Employee)의 한 형태다 조건 부합 => 상속 관계 포함
public class Manager02 extends Employee{
	
	Employee[] empList; // 관리사원 목록
	
	Manager02(){}
	
	Manager02(String name, int salary, String grade, Employee[] empList) {
		// super();가 생략되어 있는데 Employee에 기본생성자를 만들어 두어야 한다. 
		
		this.name = name; //  private으로 제한되어 있다면 접근할 수 없음. 상속은 받았지만 직접 초기화했기 때문에 에러가 난다. 
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	@Override
	void info() {
		// System.out.println("사원명 : " + name+ ", 연봉 : " + salary + "만원, 직급 : " + grade);

		super.info(); // this.info();는 자기 것을 호출하게 됨. 
		
		System.out.println("-------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("-------------------------------");	
	}
	

}
