import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet { //+ List, Set�� �ݷ����̴�

	/*
		# Set
		  
		  - ������ �����س��� Ŭ����
		  - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
		  
		# Hash 
		
		  - �̸��� Hash�� �پ��ִ� Ŭ������ Hash �˰����� ����Ѵ�. //+ ��й�ȣ ����ÿ� ���� �����..�Է��� ���� ��ȯ�ع����� ������ �ǵ��� �� ����
		  - ���� ���� ������ �׻� ������ ���� ������ �˰���
		  - ����� �ٸ� ���� �ִ��� ���� ���� �Ұ����� ���� ���;� �Ѵ�
		  - Hash �˰������� ������ Ŭ�������� ������ �������� �ʴ´�
		  - �ߺ� üũ�ÿ� �پ ������ ���δ�
	*/
	
	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(50);
		numbers.add(50);
		numbers.add(60);
		
		System.out.println(numbers); //+ [50, 20, 40, 10, 60, 30] ���
		
		// HashSet���� index�� ���� ������ �����θ� ���� �� �ִ�
		numbers.remove(50); //+ 50�� ������ �������� ��µ� 1����
		
		// HashSet�� index�� ���� ������ for-each�� ����� �� �ִ�
		for(Integer number : numbers) {
			System.out.println(number + "-------");
		}
		
		//�÷��ǳ����� ��ȯ�� �����Ӵ�
		ArrayList<Integer> number_list = new ArrayList<>(numbers); //+ ()�� numbers�� ���� �� �ִ�		
		System.out.println(number_list); //+ [20, 40, 10, 60, 30]	
		
		// �÷����� ���� ���� ũ������� ������ �� �ִ�
		Collections.sort(number_list); 		
		System.out.println("���� �� : " + number_list); //+ ���� �� : [10, 20, 30, 40, 60]
		
		// Collections.addAll(Collections) �÷����� ��� ������ �ٸ� �÷��ǿ� �߰��ϱ� 	
		ArrayList<String> animals_list = new ArrayList<>(); //+ String�� ����� �����ִ�
		HashSet<String> animals = new HashSet<>();
		
		animals_list.add("dog");
		animals_list.add("cat");
		animals_list.add("cow");
		animals_list.add("lion");
		animals_list.add("tiger");
		
		animals.add("lion");
		animals.add("tiger");
		animals.add("horse");
		animals.add("zebra");
		animals.add("giraffe");
		
		animals_list.addAll(animals); //+ animals_list�� animals�� �߰��Ѵ� == ������
		//animals.addAll(animals_list); //+ (2)
		
		System.out.println(animals_list); //+ [dog, cat, cow, lion, tiger, horse, zebra, giraffe, tiger, lion]
		//+ �� �ߺ����� �ȵǰ� ������� ��µ�
		System.out.println(animals); //+ [horse, zebra, giraffe, cat, cow, tiger, dog, lion]
		//+ �� �ߺ����Ű� �ǰ� �ұ�Ģ�ϰ� ��µ�(2)
		
		
		// Collections.removeAll(Collections) : ������ �÷��ǰ� ���� ������ ��� ���� == ������
		animals_list.removeAll(animals); 
		System.out.println(animals_list); //+ [dog, cat, cow]

		// Collections.retainAll(Collections) : �� �÷��ǿ� ��� �����ϴ� ���� ���� == ������
		HashSet<Double> avg = new HashSet<>();
		HashSet<Double> avg2 = new HashSet<>();
		
		avg.add(1.8);
		avg.add(1.9);
		avg.add(2.0);
		
		avg2.add(2.0);
		avg2.add(38.8);
		avg2.add(40.1);
		
		System.out.println(avg.retainAll(avg2)); //+ true, avg���� avg2�� ���Ͽ� �����ϴ� ���� ����
		System.out.println(avg); //+[2.0] , ��ġ�� ���� 2.0�� �ֱ� ������ 2.0�� ��µ�
		
		
	}
}
