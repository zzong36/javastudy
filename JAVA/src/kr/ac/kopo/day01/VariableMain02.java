package kr.ac.kopo.day01;

public class VariableMain02 {
	public static void main(String args[]) {
		
		//"Hello" ���ڿ��� �����ϱ� ���� ���� str ����
		// String str;
		// str = "Hello";
		
		// String str = "Hello"; String�̶�� Ŭ������ new�� �� �ᵵ ������� �� �ִ�.
		
		String str = new String("Hello"); //�̰� ��Ģ��, heap�� �������, str�� ��������(reference or pointer in c)
	
		
		System.out.println(str);
	
	}

}
