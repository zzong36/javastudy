package kr.ac.kopo.day07;

class Dog{
	String name;
	int age;
	
	void info() {
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Dog(String n, int a){
		name = n;
		age = a;
		
	}
}

public class Practice01 {

	public static void main(String args[]) {
		
		
		Dog d = new Dog("쫑", 3);
		System.out.println("이름: " + d.name + " 나이 :" + d.age );
		
		Dog d2 = new Dog("메리", 4);
		System.out.println("이름: " + d2.name + " 나이 :" + d2.age );	
		
		
		
	}
	
}
