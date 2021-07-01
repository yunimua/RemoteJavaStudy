import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class D05_Comparator {

	/*
		# Comparable
		
		  - �� �������̽��� ������ Ŭ������ ���� ũ�Ⱑ �� ������ Ŭ������ �ȴ�
		  - �� �������̽��� ������ Ŭ������ Collections�� ���� ����� �̿��� �� �ִ�	
		  
		# Comparator
		
		  - �� �������̽��� ������ Ŭ������ ���� �������� ���ȴ�
	*/
	
	public static void main(String[] args) {
		
		//+ Snack Ÿ���̴� = ���ο� Ÿ�� : ���ڿ��� �ƴϴ�
		Snack s1 = new Snack("��Ϲ���Ĩ", "�Ե�", "��Ϲ��͸�", 600, 2000);
		Snack s2 = new Snack("�����۽�", "�ѱ�P&G", "���ĸ�", 800, 2000);
		Snack s3 = new Snack("ĭ��", "�Ե�", "����", 250, 1000);
		Snack s4 = new Snack("Ȩ����", "��������", "����", 359, 1750);
		Snack s5 = new Snack("����ƽ", "���", "���ڸ�", 700, 1200);	
		
		Snack s6 = new Snack("�Ҹ���", "ũ�������", "���ڸ�", 445, 590);	
		Snack s7 = new Snack("�ٳ���ű", "���", "�ٳ�����", 150, 1200);	
		Snack s8 = new Snack("����Ĩ", "������", "�����򷯽���", 790, 883);	
		
		//System.out.println(s1 > s2); // ũ��񱳸� �Ϸ���? �׳� Ÿ�� �̸����δ� �� �Ұ�
		
		ArrayList<Snack> snacks = new ArrayList<>();
		
		Collections.addAll(snacks, s1, s2, s3, s4, s5);
		
		System.out.println(snacks); //+ �׳� ����ϸ� �ּҰ�, toString �������̵��ؼ� ���� �߰�
		
		Collections.sort(snacks, new ����������());
		System.out.println(snacks);
		
		Collections.sort(snacks, new ���ںз���());
		System.out.println(snacks);
		
		Comparator<Snack> reversed_���ںз��� = Collections.reverseOrder(new ���ںз���());
		
		//+ Collections.sort(snacks, new ���ںз���_��������());
		//+ �Ʒ��� ���� ��������
		Collections.sort(snacks, reversed_���ںз���);
		System.out.println(snacks);
		
		Collections.addAll(snacks, s6, s7, s8);
		
		Collections.sort(snacks, new ������());
		System.out.println(snacks);
		
	}
}

class Snack implements Comparable<Snack>{
	String name;
	String company;
	String taste;
	int calorie;
	int price;
	
	// �����ڸ����
	public Snack(String name, String company, String taste, int calorie, int price) {
		this.name = name;
		this.company = company;
		this.taste = taste;
		this.calorie = calorie;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s/%dKcal/%d��", name, company, taste, calorie, price);
	}

	@Override
	public int compareTo(Snack o) {
		if(this.price > o.price) {
			return 1; // 1 �ٲ۴�
		}else if (this.price < o.price) {
			return -1; // -1 �ȹٲ۴�
		}else {
			return this.name.compareTo(o.name); //���� ��� �̸������� ������ ����
		}
	}

	public String getName() {
		return name;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int compareTo_(Snack snack) {
		return this.company.compareTo(snack.company);
	}
}
/*
	������ �̸� ���� �������� ������ �ϵ�, ���� �������� ������ �̸����� �������� ������ ���ּ���
	(���� 3���� �� �߰��غ���)
*/

class ������ implements Comparator<Snack> {

	@Override
	public int compare(Snack o1, Snack o2) {
		if (o1.getCompany().equals(o2.getCompany())) {
			return o1.getName().compareTo(o2.getName());		
		}else {
			return o2.getCompany().compareTo(o1.getCompany());	
		}
	}
}



class ���ںз���_�������� implements Comparator<Snack> { 

	@Override
	public int compare(Snack o1, Snack o2) {
		if (o1.calorie > o2.calorie) {
			return -1;
		}else if (o1.calorie < o2.calorie) {
			return 1;
		}else {
			return 0;
		}	
	}
}


class ���ںз��� implements Comparator<Snack> { //+Į�θ� �������� �����Ҽ��ִ� : Collections.sort�� �̿��Ͽ�..

	@Override
	public int compare(Snack o1, Snack o2) {
		if (o1.calorie > o2.calorie) {
			return 1;
		}else if (o1.calorie < o2.calorie) {
			return -1;
		}else {
			return 0;
		}	
	}
}

class ���������� implements Comparator<Snack> {
	
	/*
	 	# Compare ��Ģ
	 	
			�� ���� �ڸ��� �ٲٰ� ������ 1�� ����
			�� ���� �ڸ��� �ٲ��� �ʰ� �����ϰ� ������ -1�� ����
			�� ���� ���� ���� ���̶�� 0�� ����
	*/

	@Override // ���� �����밡 �ִ�
	public int compare(Snack o1, Snack o2) {
		if (o1.price > o2.price) {
			return 1;
		}else if (o1.price < o2.price) {
			return -1;
		}else {
			return 0;
		}		
	}
}