package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String args[]) {
		int a;
		byte b = 10;
		
		a = (int)b; // ������ ����ȯ: = �� ���� ������, ��Ģ�� ���� �������� �ڷ����� ���ƾ� �Ѵ�
		b = (byte)a; // �����(������) ����ȯ: �� ����� ��
		
		System.out.println(10 + 20.3); // ������ ū ���� Ÿ���� ���󰡰� �ȴ�(������ ����ȯ)
		System.out.println(10 + (int)20.3); // �� ���� Ÿ������ ����ϱ� ���ؼ��� ����� ����ȯ�� �ʿ��ϴ�.
		
		double d = 10 +20.2; // ���ϱ� �����϶��� ����ȯ�� �̷����
		int i = 10 + (int)20.2;
		int c = (int)(10 + 20.2);
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		
		final int NUM = 100;
		System.out.printf("num : %d%n", NUM);
		
		char ch = '!';
		ch = '\'';// ���� ����ǥ
		System.out.println(ch);
		
		String path = "D:\\Lecture\\java-workspace\\JAVA\\src\\kr\\ac\\kopo\\day01";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);
	
		
	}
}
