package myobj.school;

public class ProgrammingStudent extends Student {
	
	int math;
	int pl; //+���α׷��� ���
	int al; //+�˰���
	int ds; //+�ڷᱸ��
	
	public ProgrammingStudent() {
		super(); //+�θ��� �����ڸ� �θ���, ���� ������
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds);
	}
	
	double getAverage() {
		return getSum() / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("��������������������������������������������������������������������������������������������������������������");
		System.out.println("  �̸� : " + name + " �� ���� :" + getSum() + " ��� : " + getAverage()); 
		//+ �ڽ�Ŭ������ name�� ���� ������ super.name���� ���� �ʾƵ� �ȴ�
		System.out.println("  ����\t����\t����\tPL\tAL\tDS");
		System.out.println("------------------------------------------------------");
		System.out.printf("  %d\t%d\t%d\t%d\t%d\t%d\t\n", kor, eng, math, pl, al, ds);
		System.out.println("��������������������������������������������������������������������������������������������������������������");
	}


}
