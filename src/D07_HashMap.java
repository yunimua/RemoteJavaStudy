import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import myobj.Student;

public class D07_HashMap {

	/*
		 # Map
		 
		   - �����͸� key�� Value �� ������ �����ϴ� ����� �ڷᱸ��
		   - key ���� ���� Value�� ������ �� �ִ�
		   - key�� �ߺ��� ������� �ʴ´�
	*/
	
	public static void main(String[] args) {
		
		// ù ��° ���׸��� Key Ÿ���̰�, �ι�° ���׸��� Value�� Ÿ�Դϴ�
		HashMap<String, String> addr = new HashMap<>();
		
		// Map.put(key, value) : �ʿ� �����͸� �߰��Ѵ�
		// Map.putAll(Map) : �ٸ� ���� �����͸� ��� �߰��Ѵ�
		// Map.putIfAbsent() : �ش� Ű���� ��������� �ְ�, ���� ������ �����ش�. ���� ��� null�� �����Ѵ�
		
		addr.put("�츮��", "����Ư���� ���۱� �뷮��1�� ...");  //+ put : �ش� �ʿ� key�� value�� �ִ´�
		addr.put("����", "����Ư���� ������ �������84�� 16");
		addr.put("����2", "����Ư���� ���α� ����3��");
		
		System.out.println(addr.putIfAbsent("�츮��", "���� �� �ִ�")); //+ ����Ư���� ���۱� �뷮��1�� ...
		System.out.println(addr.putIfAbsent("�츮��2", "���� �� �ִ�")); //+ null
		
		// �̹� �����ϴ� Ű�� ���� �߰��ϸ� value�� �����Ѵ�
		addr.put("����", "������"); //+ �����ּҸ� ������ؼ� value�� ���������� ��µ�
		
		System.out.println(addr.get("�츮��"));
		System.out.println(addr.get("����"));
		System.out.println(addr.get("����2")); //+ ����Ư���� ���α� ����3�� => value�� ���´�..
		System.out.println(addr.get("�츮��2")); //+ ���� �� �ִ�
		
		// ���� ������ Ÿ�Ե� ����� �� �ִ� (ex)Student
		HashMap<Integer, Student> students = new HashMap<>(); //+ Collection�� �ƴ϶� ���Ұ�
		
		students.put(1, new Student());
		students.put(2, new Student());
		
		System.out.println(students.get(1)); //+ [1000]�� �л��� ��� ������ 55.33�Դϴ�. => �� ��µ�
		System.out.println(students.get(2)); 
		
		// �������� Ÿ���� ����� �� �ִ�
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("�̸�", "ȫ�浿");
		info.put("����", 23);
		info.put("��ȭ��ȣ", "010-1234-1234");
		info.put("�����ϴ� ��", new String[] {"��ȭ", "�", "�ܹ���"});
		info.put("ģ�� ���", new ArrayList<>());
		
		// �������� : ģ�� ��Ͽ� �����͸� 3���� �߰��غ�����.
		//ArrayList<String> friends = (ArrayList<String>) info.get("ģ�� ���"); //+ �ٿ�ĳ����...
		
//		friends.add("ö��");
//		friends.add("����");
//		friends.add("�μ�");
		
		((ArrayList<String>) info.get("ģ�� ���")).add("ö��");
		((ArrayList<String>) info.get("ģ�� ���")).add("����");
		((ArrayList<String>) info.get("ģ�� ���")).add("�μ�");
				
		System.out.println(info.get("ģ�� ���"));
		
		/*
			# �ݺ������� MapŸ�� Ȱ���ϱ�
			
			  - Map.keySet() : key��� �̷���� Set�� ��ȯ�Ѵ�
			  - Map.values() : ����� �̷���� Set�� ��ȯ�Ѵ�
			  - Map.entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�
		*/
		
		System.out.println(info.keySet()); //+ [ģ�� ���, �����ϴ� ��, �̸�, ��ȭ��ȣ, ����] : ���� ������ ���������ʴ�(HashSet�� ����ȿ��)
		
		for (String key : info.keySet()) { //+ �ϳ��� ���������� ������ ����� �� �ִ�
			System.out.println("�ݺ������� ���� ���� : " + info.get(key));
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(info.values()); //+ Collection Ÿ������ ��µ�
		
		List value_list = new ArrayList<>(info.values()); //+ ���� ����
		System.out.println(value_list);
		
		for (Object value : info.values()) { //+ ���������� ������ ����
			System.out.println(value);
		}
		
		for (Entry<String, Object> entry : info.entrySet()) { //+ import java.util.Map.Entry (class�ȿ� class�� �ִ�) �ʿ�...
			System.out.print(entry.getKey() + "\t: "); //+ key�� �����´�
			System.out.println(entry.getValue()); //+ value�� �����´�
		}
	}
}
