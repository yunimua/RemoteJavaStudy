package myobj.school;

public abstract class Student {
	
	final static int MAX_SCORE = 100;

	static String[] lastNameArray = {
			"��", "��", "��", "��", "��", "��", "��", "��", 
			"��", "����", "����", "��", "��", "��", "��", "��", "��",
			"��", "��", "��", "��", "��", "����"};
	
	static String[] firstNameArray = {
			"��ȯ", "�Ǽ�", "����", "����", "õ��", "�ҿ�", "��ö", "�¸�",
			"����", "�¹�", "����", "����", "��ȣ", "�ѳ�", "����", "�ν�", 
			"����", "��ȣ"
	};
	
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random() * lastNameArray.length)] 
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	//+ �����Ǳ� ������ �����Ǿ� �ִ� �ֵ��� public Student()���� �ٷ� ��밡���ϴ�
	//+ ó������ �����ϴ� �����ڴ� static�� �ٿ� ����� �� �ִ�
	
	static int generateRandomScore() {
		return (int)(Math.random() * (MAX_SCORE +1));
	}
	
	String name;
	int kor; //+ ����� ����� ���� �����̹Ƿ� �θ� Ŭ������ ����
	int eng;
	
	public Student() {
		name = generateRandomName(); //+ �����ϰ� ������ �̸��� �����´�
		kor = generateRandomScore(); //+ �����ϰ� ������ ������ �����´�
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();
	
	public String getName() { //+ �ٸ���Ű������ import�� �� �� public ������ �ʿ��ϴ�
		return name;
	}
	
}
