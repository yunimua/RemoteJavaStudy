import java.util.ArrayList;

public class D01_ArrayList {

	/*
		# Java Collections
		
		  - �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
		  - Collections �������̽��� ������ Ŭ������ List, Set ���� �ִ�
		  
		  
		# Java.util.ArrayList
		
		  - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
		  - �迭ó�� �����͸� ���������� �����Ѵ�
		  - ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�
	*/
	
	public static void main(String[] args) {
		
		/*
			# Ÿ���� �����ϸ� ArrayList �����ϱ�
			 - Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���
			 - �ش� Ŭ���� ������ ���� �������� ���� Ÿ���� �����ϴ� �����̴�
			 - ���׸����� �⺻�� Ÿ���� ����� �� ���� (ex : int byte..)
		*/
		ArrayList<String> fruits = new ArrayList<>();//+ StringŸ�Ը� ���� �� �ִ� ArrayList �̴�
		ArrayList<Integer> numbers = new ArrayList<>(); //+ Integer : �⺻�� Ÿ���� ����Ÿ�� (int�� ��������)
		ArrayList<Character> chars = new ArrayList<>();
		ArrayList<Character> chars2 = new ArrayList<>();
		
		chars.add('A');
		chars.add('B');
		chars.add('��');
		chars.add('��');
		
		chars2.add('A');
		chars2.add('B');
		chars2.add('��');
		chars2.add('��');
		
//		if (chars == chars2) {
//			System.out.println("��ġ");
//		}else {
//			System.out.println("����ġ");
//		} // ���� ���� ����־ ��ġ���������Ƿ� if �� ��� �Ұ�
			
		// add(item) : ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana"); //+ �������� ����, [apple, apple, apple, banana, banana] ��µ�	
			
		// add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		numbers.add(0, 10);
		numbers.add(0, 20);
		numbers.add(0, 99);
		numbers.add(0, 40);
		numbers.add(0, 0);
		numbers.add(0, 60);
		//+ [10, 20, 99, 40, 0, 60] ���������� �����͸� �����Ѵ� (���� ������ ��������)
		//+ 0, �� �߰��ϸ� [60, 0, 40, 99, 20, 10] ���� ��µȴ�
		
		System.out.println(fruits);
		System.out.println(numbers);
		
		// get(index) : ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ��ȯ�Ѵ�
		System.out.println(fruits.get(3)); //+ banana (4��°��)
		System.out.println(fruits.get(0)); //+ apple (1��°��)
		
		// size() : �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
		System.out.println("���� ����ִ� ���� ���� : " + fruits.size()); //+���� ����ִ� ���� ���� : 5
		
		// remove(index) : �ش� ��° �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ�Ѵ�.	
		System.out.println(fruits.remove(0));

//		//+ ����ó��		
//		try {
//			while (true) {
//				System.out.println(fruits.remove(0));
//			}
//		}catch (IndexOutOfBoundsException e) {
//			System.out.println("�� ���³׿�.");
//		}
		
		// remove(item) : �ش� ���� �����Ѵ�. ���� ���� ���θ� ��ȯ�Ѵ�.
		System.out.println(fruits.remove("kiwi")); //+ false : Ű������
		System.out.println(fruits.remove("banana")); // + true : �ٳ��� ����
		
		System.out.println(fruits); //+ �ε����� ���� 1�� ����, �ٳ��� 1�� �����Ǿ� [apple, apple, banana] �� ���
	}
}
