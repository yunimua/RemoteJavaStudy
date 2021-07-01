package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> { //+ <T> : ���� �������� ���� Ÿ���̴�. �ν��Ͻ��� ������ �� Ÿ���� �����ȴ�

	/*
		1. �� �÷����� �Ű� ������ ���� ������ �� �÷����� �������� Set Ÿ������ ��ȯ�ϴ� �޼���
		
		[1, 2, 3, 4] ������ [3, 4, 5] => [1, 2, 3, 4, 5]
		
		2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		
		[1, 2, 3, 4] ������ [3, 4, 5] => [3, 4]
		
		3. �� �÷����� �Ű� ������ ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		
		[1, 2, 3, 4] ������ [3, 4, 5] => [1, 2]
		[3, 4, 5] ������ [1, 2, 3, 4] => [5]
		
		�� ����� �׽�Ʈ�غ�����.
	*/
	
	static class Fruit {}
	
	static class Apple extends Fruit {}
	static class Banana extends Fruit {}
	static class Carrot {}
	
	
	public static void main(String[] args) {
		D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();
		
		List<String> A = new ArrayList<>();
		Set<String> B = new HashSet<>();
		
		A.add("�Ƹ޸�ī��");
		A.add("�Ƹ޸�ī��");
		A.add("�ݵ���");
		A.add("��");
		
		B.add("�Ƹ޸�ī��");
		B.add("�ݶ�");
		B.add("��������Ʈ");
		
		System.out.println(jiphap.union(A, B));
		System.out.println(jiphap.Intersection(A, B));
		System.out.println(jiphap.diff(A, B));

		
		D02_JiphapQuiz<Fruit> jiphap2 = new D02_JiphapQuiz<>();
		
		List<Apple> apple_list = new ArrayList<>();
		Set<Banana> apple_set = new HashSet<>();
			
		jiphap2.union(apple_list, apple_set);

	}
	
	//public HashSet<T> union(Collection<T> A, Collection<T> B) { //+ <T>�� ������ static�� �����ؾ��Ѵ�
	// + �� T�� ��ӹ��� ���𰡰� ���ü��ִ�
	public HashSet<T> union(Collection<? extends T> A,Collection<? extends T> B) { //���� ����		
		HashSet<T> union = new HashSet<>();
		//+������
		union.addAll(A);
		union.addAll(B);
		return union;
	}
	
	public HashSet<T> Intersection(Collection<? extends T> A,Collection<? extends T> B) { 
		HashSet<T> inter = new HashSet<>();
		//+������ : A�� B�� �����ո� �����ִ´�
		inter.addAll(A);
		inter.retainAll(B);
		return inter;
	}
	
	public HashSet<T> diff(Collection<? extends T> A,Collection<? extends T> B) { 
		HashSet<T> diff = new HashSet<>();
		//+������
		diff.addAll(A);
		diff.removeAll(B);
		return diff;
	}
	
	//+ <Integer> : �̰� ���׸��̶��Ѵ�
	//+ <Integer>�� �����ϸ� ��� Ÿ�� ����� �����ϳ�, Object(��� Ÿ���� �θ�)�� �ȴ�.
	
	

		
		
		
		
//		ArrayList<String> trip_traffic = new ArrayList<>();
//		ArrayList<String> transportation = new ArrayList<>();
//		
//		trip_traffic.add("airplane");
//		trip_traffic.add("train");
//		trip_traffic.add("subway");
//		trip_traffic.add("ownCar");
//		trip_traffic.add("ship");
//		trip_traffic.add("boat");
//		trip_traffic.add("tourBus");
//		
//		transportation.add("bus");
//		transportation.add("texi");
//		transportation.add("subway");
//		transportation.add("motorcycle");
//		transportation.add("ownCar");
//		transportation.add("bicycle");
//		transportation.add("kickboard");
//		
//		System.out.println("1.������ : " + sum(trip_traffic, transportation));
//		System.out.println("2.������ : " + same(trip_traffic, transportation));
//		System.out.println("3.������ : " + differ(trip_traffic, transportation));
//		
//	}
//	
//	public static HashSet sum(Collection trip_traffic, Collection transportation) { //������
//		HashSet sum = new HashSet<>();
//		sum.addAll(trip_traffic);
//		sum.addAll(transportation);
//		return sum;
//	}
//	
//	public static HashSet same(Collection trip_traffic, Collection transportation) { //������
//		HashSet same = new HashSet<>();
//		same.addAll(trip_traffic);
//		same.retainAll(transportation);
//		return same;
//	}
//	
//	public static HashSet differ(Collection trip_traffic, Collection transportation) {
//		HashSet differ = new HashSet<>();
//		differ.addAll(trip_traffic);
//		differ.removeAll(transportation);
//		return differ;

}
