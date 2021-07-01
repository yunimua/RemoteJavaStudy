package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class D07_PhoneBook {

	public static class Info implements Comparable<Info>{
		String name;
		int bookNumber;
		
		public void info(String name, int bookNumber) {
			this.name = name;
			this.bookNumber = bookNumber;
		}

		@Override
		public int compareTo(Info o) {
			return this.name.compareTo(o.name) != 0 ? 
					this.name.compareTo(o.name) : Integer.compare(this.bookNumber, o.bookNumber);
		}
		
		@Override
		public String toString() {
			return String.format(name, bookNumber);
		}
	}

	HashMap<String, HashMap<String, Info>> phonebook; //+ �׷�� < ��ȭ��ȣ, info>
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
	}
	
	/*
		# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
		
		1. phonebook���� �׷�/ ��ȭ��ȣ / ������ ������ �� �ִ�
		2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�
		3. ���� HashMap�� ��ȭ��ȣ�� ������ �� ����� ������ ���� �� �ִ�	
		
		# �����ؾ� �� �޼���
		
		1. ���ο� �׷��� �߰��ϴ� �޼���
		2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
		3. ��ϵ� ��� ��ȣ�� ������ �׸�(info�� �ʵ�?) �������� ����/������������ �����ִ� �޼���
		4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
		5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	*/
	
	public void addGroup(String group) {
		if(!phonebook.containsKey(group)) { //+ containsKey : phonebook�ʿ� (group)Ű���� �ִ��� Ȯ��
			phonebook.put(group, new HashMap<String, Info>());
		}else {
			System.out.println("-----������ �׷���� �ֽ��ϴ�.-----");	
		}
	}

	public void addTel(String group, String tel, Info info) {
		phonebook.get(group).put(tel, info);
	}
	
	public static void main(String[] args) {
		D07_PhoneBook pb = new D07_PhoneBook();		
		String group;
		String tel;
		String name;
		int bookNumber;

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�׷�� �Է� > ");
			group = sc.nextLine();
			pb.addGroup(group);
		}
	}
}
