package myobj.school;

public class NetworkStudent extends Student {

	int linux;
	int nw;
	int ccna;
	
	public NetworkStudent() {
		linux = generateRandomScore();
		nw = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + linux + nw + ccna);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("  �̸� : " + name + " �� ���� :" + getSum() + " ��� : " + getAverage()); 
		System.out.println("  ����\t����\tLN\tNW\tCA");
		System.out.println();
		System.out.printf("  %d\t%d\t%d\t%d\t%d\t\n", kor, eng, linux, nw, ccna);
		System.out.println("������������������������������������������������������������������������������������������������������������");
		
	}

}
