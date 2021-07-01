package myobj.school;

public class MachinelearningStudent extends Student {

	int math;
	int ss;
	int pl;
	
	public MachinelearningStudent() {
		math = generateRandomScore();
		ss = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + ss + pl);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("  �̸� : " + name + " �� ���� :" + getSum() + " ��� : " + getAverage()); 
		System.out.println("  ����\t����\t����\t���\tPL");
		System.out.println(" �աաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաա�");
		System.out.printf("  %d\t%d\t%d\t%d\t%d\t\n", kor, eng, math, ss, pl);
		System.out.println("������������������������������������������������������������������������������������������������������������");
		
	}
}
