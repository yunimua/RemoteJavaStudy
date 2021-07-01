import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.Student;

public class D06_TreeSet {

	/*
		# TreeSet
		
		  - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
		  - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
		  - ó�� Set�� �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
		  - �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
		  - �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
	*/
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers); //+ [10, 13, 41, 50, 86, 99] : ũ�� ������� ���ĵǾ�����(��������X)
		
		// TreeSet�� ���ϴ� Comparator�� ����ϱ� (���� ��������)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) { //+�͸� �̳�Ŭ����(����) ���
				/*
					�ڸ��� �ٲٰ� �ʹٸ� ��� ���� //+ ū������ ���� ���� ���� ����� �ǹǷ� �ڸ��� �ٲ� ���������� �ȴ�
					�ڸ��� �ٲٱ� ������ ���� ����
					�� ���� ���� ���̸� 0 ����				
				*/
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		System.out.println(numbers2);  //+ [99, 86, 50, 41, 13, 10] ������������ ���ĵȴ�
		
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head); //+ [10, 13, 41]
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail); //+ [50, 86, 99] : �Է��� ���� �������� �ȴ�
		
		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc); //+ [99, 86, 50, 41, 13, 10] : numbers2�� ������ ȿ��
		
		System.out.println("first ? " + numbers.first()); //+ first ? 10
		System.out.println("last ? " + numbers.last()); //+ last ? 99
		System.out.println("pollFirst ?" + numbers.pollFirst());
		System.out.println(numbers); //+ [13, 41, 50, 86, 99] : ���� ���� ���� ����� null, ������ ���� ǥ��
		System.out.println("pollFirst ?" + numbers.pollLast());
		System.out.println(numbers); //+ [13, 41, 50, 86] : ���� ���� ���� ����� null, ������ ���� ǥ��
		
		//numbers.subSet(30, 70); //+ sub => �κ� ����, 30���� 70������ ���� ��ȯ�ްڴ�
		System.out.println("subSet(30, 70) ? " + numbers.subSet(30, 70)); //+ subSet(30, 70) ? [41, 50]
			
		System.out.println(numbers.comparator()); //+ � �з��⸦ ����ߴ��� �ľ��ϱ� ���� ��� (=�ڿ������� ������ ����ϴ� ��� null�� ��ȯ)
		System.out.println(numbers2.comparator()); //+ D06_TreeSet$1@1e81f4dc �ּҰ��� ����..�̾Ƽ� ��Ȱ�밡��? (����), �����Ұ�, �͸� Ŭ���� ������ ��밡��
		
		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator()); //+ �� ������������ ����
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		
		System.out.println("list : " + list); //+  [86, 50, 41, 13]
		
		System.out.println("contains 41 ? " + list.contains(41)); //+ contains 41 ? true
		System.out.println("contains 41 ? " + list.contains(42)); //+ list�� 42�� �ִ�? : contains 41 ? false
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(41);
		
		// �Ʒ��� �ڵ尡 true�� �������� null�� �ٸ� ������ �ٲ㺸���� (3���� �̻�)
		//System.out.println(list.containsAll(null));
		// list, numbers, numbers3 / true , numbers2 / false
		
		System.out.println(list.containsAll(numbers2.subSet(43, 41)));
		System.out.println(list.containsAll(numbers));
		System.out.println(list.containsAll(list));
		
		// �л� �ν��Ͻ��� 100�� �����, Ʈ���¿� ��� ���� ������ ������ ��
		// ��� ������ 50������ 70�� ������ �л��� ��� ������� �������
		
		TreeSet<Student> stu_set = new TreeSet<>();
		
		//stu_set.add(new Student()); // �̷��Գ����� ����!!!, �񱳰� �ȵǴϱ� �ȵ� : public class Student implements Comparable<Student>{ ���� ����
		
		for (int i = 0; i < 100; ++i) {
			stu_set.add(new Student());
		}
		
		System.out.println(stu_set);
		System.out.println("�л��� �� " + stu_set.size() + "�� �Դϴ�."); //+ ���� ����� ���ܽ��ѹ����� 100���� ��µ��� ����
		
		Student from = new Student();
		Student to = new Student();
		
		from.avg = 50.0;
		to.avg = 70.0;
		
		System.out.println(stu_set.subSet(from, to).size());
		
		
		//���� Ǭ��..
		ArrayList<Student> students = new ArrayList<>();

		for (int i = 0; i < 100; ++i) {
			students.add(new Student());
		}

		TreeSet<Student> average = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (int) (o2.avg - o1.avg);
			}
		});
		
		average.addAll(students);
		System.out.println(average); // ��� �������� ���ĵ�...
		
		System.out.println("check : " + average.subSet(new Student(70,70,70), new Student(49,49,49)).size());
		
		
		
		
		System.out.println("---------------------------------------------------------------------------------");
	}
}


