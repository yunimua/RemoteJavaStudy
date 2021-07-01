package quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
/*
	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	
	1. phonebook���� �׷�/ ��ȭ��ȣ / ������ ������ �� �ִ�
	2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�
	3. ���� HashMap�� ��ȭ��ȣ�� ������ �� ����� ������ ���� �� �ִ�	
	
	# �����ؾ� �� �޼���
	
	1. ���ο� �׷��� �߰��ϴ� �޼���
	2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼��� 
	5. ��ϵ� ��� ��ȣ�� ������ �׸� �������� ����/������������ �����ִ� �޼���
		(�ƹ��͵� �������� ���� �� �⺻ ������ ���)
*/
import java.util.TreeSet;

import quiz.D07_PhoneBook.Info;

public class D07_PhoneBook2 {
	
	private static Class[] comparators = {AgeComparator.class, PhoneComparator.class}; //+ ���赵(1),(2)�� �����صд�
	
	private class AgeComparator implements Comparator<Info> {	//+ �ν��Ͻ��� �������� ���� ���赵 2�� : ���赵(1)
		int ordering;
		
		public AgeComparator(Integer ordering) {
			this.ordering = ordering;
		}

		@Override
		public int compare(Info o1, Info o2) {
			return Integer.compare(o1.age, o2.age) * ordering;
		}
	}
	
	private class PhoneComparator implements Comparator<Info> { //+ ���赵(2)
		int ordering;
		
		public PhoneComparator(Integer ordering) {
			this.ordering = ordering;
		}
		
		@Override
		public int compare(Info o1, Info o2) {
			return ordering * o1.phoneNumber.compareTo(o2.phoneNumber);
		}
		
	}

	public static class Info implements Comparable<Info>{
		String name;
		String phoneNumber;
		String address;
		String socialNumber;
		int age;
		
		public Info() {}//+ ������ :�̰� �����ڴ�!!

		public Info(String name, int age, String phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public String toString() {
			return String.format("%s/%d", name, age);
		}
		
		// 5. ��ϵ� ��� ��ȣ�� ������ �׸� �������� ����/������������ �����ִ� �޼���
		@Override
		public int compareTo(Info o) {
			return name.compareTo(o.name) == 0 ? //+ �̸��� ���� ��� ����ȣ ����, ���� ������ �̸� �� ����
					phoneNumber.compareTo(o.phoneNumber) : name.compareTo(o.name);
			//+ ����� �̸��� �ִٸ� ? ����ȣ ���� ����, �ƴ϶�� �̸� ����
		}
	}
	
	HashMap<String, HashMap<String, Info>> phonebook; 
	
	public D07_PhoneBook2() {
		phonebook = new HashMap<>();
	}
	
	// 1. ���ο� �׷��� �߰��ϴ� �޼���
	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) { //+ containsKey : �ʿ� Ű���� �ִ��� Ȯ��, phonebook��/groupName Ű��
			System.out.println("�̹� ���� �̸��� �׷��� �����մϴ�.");
			return false;
		}else {
			phonebook.put(groupName, new HashMap<>()); // ���ο� �׷� �߰�
			System.out.printf("�� �׷� \" %s \" �� �߰��Ǿ����ϴ�.\n", groupName);
			return true;
		}
	}
	
	// 	2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	public void addInfo(String groupName, Info info) {
		HashMap<String, Info> group = phonebook.putIfAbsent(groupName, new HashMap<>()); //+ get ��� putIfAbsent �� ���
		
		if (group == null) { //+ �׷���� ���ٸ�(null), �׷���� �߰��Ѵ�
			group = phonebook.get(groupName); 
		}
		group.put(info.phoneNumber, info); //+ �׷��� �߰��ϸ鼭 �׷��̸�, info(����, ��ȣ)�� �߰��Ѵ� : put�� �ʿ� �����͸� �߰�..
	}
//		phonebook.get(groupName).put(info.phoneNumber, info); //+ �׷���� �������� ���� �� ó���� �ȵǾ�����
//		�� phonebook.get(groupName) �׷��̸��� �����ͼ� put(��ȣ, info)�� �Ѵ�
//		return true;
//	}
	
	// 3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	public void searchByName(String name) {
		System.out.println("---�̸� �˻� : \"" + name + "\"�� ����Դϴ�. --");
		for (String groupName : phonebook.keySet()) { //+ group���� groupName�� ������
			HashMap<String, Info> group = phonebook.get(groupName); 
			
			//+ �̸��� ��ġ�ϴ� ����� ������
			for (Entry<String, Info> entry : group.entrySet()) {
				if (entry.getValue().name.contains(name)) {
					System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey()); //+ �Է��� ���ڿ��� ���Ե� �ָ� get���� ������
				}
			}
		}
	}
	
	// 4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼��� 
	public void searchByPhoneNumber(String numberFrag) {
		System.out.println("---��ȣ �˻� : \"" + numberFrag + "\"�� ����Դϴ�. --");
		for (String groupName : phonebook.keySet()) { //+ group���� groupPhoneNumber�� ������
			HashMap<String, Info> group = phonebook.get(groupName); 
			
			for (Entry<String, Info> entry : group.entrySet()) {
				//if (entry.getValue().phoneNumber.contains(numberFrag)) {
				if (entry.getValue().phoneNumber.replace("-", "").contains(numberFrag)) { //+�Ű����� ��(-)������ ã���� ��("")������ �������־�� 
					System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey()); //+ �Է��� ���ڿ��� ���Ե� �ָ� get���� ������
				}
			}
		}
	}
	
	public void show() {
		TreeSet<Info> info_set = new TreeSet<>(); //+���� ���ĵǴ� Set
		
		for (HashMap<String, Info> group : phonebook.values()) { //+ phonebook�� values�� ���� �ϳ��� ������, TreeSet�� �ִ´�
			info_set.addAll(group.values());
		}
		System.out.println(info_set);
	}
	
	public void show(int column, boolean asc) {
        // String searchColumn = Info.class.getDeclaredFields()[column].getName();
        int ordering = asc ? 1 : -1;
        
        Comparator<Info> comparator = null;
        
        try {
                comparator = (Comparator<Info>) comparators[column]
                                .getDeclaredConstructors()[0]
                                .newInstance(this, ordering);                        
                //System.out.println(comparator);
        } catch (Exception e) {
                e.printStackTrace();
        }        
        
        TreeSet<Info> info_set = new TreeSet<>(comparator);
        
        for (HashMap<String, Info> group : phonebook.values()) {                        
                info_set.addAll(group.values());                        
        }
        
        System.out.println(info_set);
	}

	
	public static void main(String[] args) {
		D07_PhoneBook2 phone = new D07_PhoneBook2(); //+ �ν��Ͻ������
		
		phone.addGroup("ģ��"); //+ �� �׷� " ģ�� " �� �߰��Ǿ����ϴ�.
		phone.addGroup("ģ��"); //+ �̹� ���� �̸��� �׷��� �����մϴ�.
		
		phone.addInfo("ģ��", new Info("����", 15, "010-2222-2223"));
		phone.addInfo("ģ��", new Info("�μ�", 13, "010-2222-2234"));
		phone.addInfo("ģ��", new Info("�μ�", 17, "010-0001-2234"));
		
		phone.addInfo("�б�", new Info("����", 18, "010-1234-1234"));
		phone.addInfo("�б�", new Info("����", 21, "010-1111-1111"));
		phone.addInfo("�б�", new Info("���", 25, "010-1111-1112"));
		phone.addInfo("�б�", new Info("���", 44, "010-1233-1122"));
		
		phone.searchByName("��");
		phone.searchByPhoneNumber("1111");
		phone.searchByPhoneNumber("123");
		phone.searchByPhoneNumber("23");
		phone.searchByPhoneNumber("010111");
		
		phone.show(); //+ �⺻ ���
		phone.show(0, true); //+ age ��������
		phone.show(0, false); //+ age ��������
		phone.show(1, true); //+ phoneNumber ��������
		phone.show(1, false); //+ phoneNumber ��������
	}
}
