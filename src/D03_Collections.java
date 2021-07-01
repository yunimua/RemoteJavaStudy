import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D03_Collections {

	/*
		# Collections Ŭ����
		
		- �÷����� ���ϰ� �ٷ� �� �ִ� �پ��� ��ɵ��� ���ִ� Ŭ����
	*/
	
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("�ܹ���");
		foods.add("���");
		foods.add("���θ�");
		foods.add("û����");
		foods.add("ī��ư�");
		foods.add("¥���");
		
		// �ִ밪, �ּҰ�
		System.out.println("max food : " + Collections.max(foods)); //+ �����ټ�.. �ܹ��Ű� ������, ó���� ���
		System.out.println("min food : " + Collections.min(foods));
		
		// ����
		Collections.sort(foods);
		System.out.println("�����ټ� ���� : " + foods);
		
		int[] arr = {1, 7, 3, 5, 13, 1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//�ڼ���
		Collections.shuffle(foods);
		System.out.println("���� : " + foods);
		
		// �÷��ǿ� �ѹ��� ������ �߰��ϱ�
		Collections.addAll(foods, "����Ƣ��", "ġ�ƽ", "ġŲ�ʰ�", "��¡��Ƣ��", "����Ƣ��");
		System.out.println("������ �߰� : " + foods);
		
		foods.add("ġŲ�ʰ�");
		foods.add("ġŲ�ʰ�");
		foods.add("ġŲ�ʰ�");
		
		// �ش� ���� �� �� ����ִ����� ���� �˻��� �� �ִ�
		System.out.println(Collections.frequency(foods, "ġŲ�ʰ�"));
		
		// �÷����� �����´� (= ���ٷ� �ٲ۴�)
		Collections.reverse(foods);
		System.out.println(foods); //+ ������ �߰��� �ͺ��� ó�� �߰��Ѱű��� ��� ġŲ�ʰ� > �ܹ���..
		
		// �÷��� ���� �� ���� ��ġ�� ��ȯ�Ѵ�
		Collections.swap(foods, 0, 8);
		System.out.println(foods);
		
		// �Է��� ���ڸ�ŭ �̵�
		Collections.rotate(foods, 5); //+ ���������� 5ĭ �̵�
		System.out.println(foods);
		
		Collections.rotate(foods, -10); //+ �������� 10ĭ�̵�
		System.out.println(foods);
	}
}
