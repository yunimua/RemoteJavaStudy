package quiz;

public class A09_ConditionQuiz {
	public static void main(String[] args) {
	/*
	 	[ �˸��� �񱳿����� �������� ]
	 	
	 	1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
	 	2. int�� ���� b�� ¦���� �� true
	 	3. int�� ���� c�� 7�� ����� �� true
	 	4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12 �̻��� �� true
	 	5. int�� ���� d�� e�� ���̰� 30�϶� true
	 	6. int�� ���� year�� 400���� ������ �������ų�
	 		�Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
	 	7. �μ��� ö������ 2�� ������ true
	 	8. �μ��� ö������ ������ 3�� ������ true 
	 	9. boolean�� ���� powerOn �� false �� �� true
	 	10. ���ڿ� �������� str�� "yes"�� �� true
	
	*/
	
	int a = 11;
	int b = 2;
	int	c = 28;
	int d = 13;
	int hour = 13;
	int e = 43;
	int year = 204;
	int minAge = 22, cheolAge = 20;
	int minBirth = 6, cheolBirth = 9;
	boolean powerOn = false;
	String str = "yes";
	
	System.out.print("1�� : ");
	System.out.println(a > 10 && a < 20);
	
	System.out.print("2�� : ");
	System.out.println(b % 2 == 0);
	
	System.out.print("3�� : ");
	System.out.println(c % 7 == 0);
	
	System.out.print("4�� : ");
	System.out.println(hour < 24 && hour >= 12);
	
	System.out.print("5�� : ");
	System.out.println(Math.abs(d - e) == 30);

	System.out.print("6�� : ");
	System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

	System.out.print("7�� : ");
	System.out.println(minAge - 2 == cheolAge);

	System.out.print("8�� : ");
	System.out.println(minBirth + 3 == cheolBirth);

	System.out.print("9�� : ");
	System.out.println(!powerOn);
	
	System.out.print("10�� : ");
	// System.out.println(str == (String)"yes"); // ������ ��..
	System.out.println(str.equals("yes"));

	
	String str2 = "yes";
	String str3 = new String("yes");
	
	// ������ ������ ==�� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�
	System.out.println("str == \"yes\" : " + (str == "yes"));
	System.out.println("str == str2 : " + (str == str2));
	System.out.println("str == str3 : " + (str == str3));
	
	/* stack ,  heap 
	
		�޸𸮿� ����Ǵ� ����� �ٸ��� ������ equals�� ���ؾ��Ѵ�.
		- Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�
		- �ҹ��ڷ� �����ϴ� Ÿ�� �������� stack�� �������� ���δ�
		- �빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
		- �빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, �ű⿡ .�� ��� ���� �����͸� ������ �� �ִ�
	
	*/
	
	
	/*
		[����]
		
		int a = 15;
		int b = 7;
		int c = 7;
		int hour = 13;
		int d = 40, e = 10;
		
	
	System.out.println(a > 10 && a < 20);
	System.out.println(b % 2 != 1);	
	System.out.println(c % 7 == 0);
	
	System.out.println(hour < 24 && hour >= 12);
	// hour >= 0 �� hour >= 12 �� ������ ���� ���̹Ƿ� ���� : ������ �信�� hour > 0�� �־���..
	// (!(hour < 0 || hour >= 24) && hour >= 12);

	System.out.println(Math.abs(d - e) == 30);
	// ���밪.Math.abs ��� : ���� ������..
	
	System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	// && ���� �켱 ���ǵ��� () �߰� : ���� ���� &&�� ���� �ʰ�, ||�θ� �ۼ�, ���� &&�� ���������� ()�� ���� ����
		
	System.out.println(!powerOn);
	// !�� ������� () �ʿ����..
	
	System.out.println(str.equals("yes"));
	// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�
	
	*/
	}
}
