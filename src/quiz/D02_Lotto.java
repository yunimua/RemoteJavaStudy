package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import myobj.Lotto;

public class D02_Lotto {

	/*
		1. 1���� 45 ������ �ߺ����� ���� ���� 6�� �Ǵ� 7���� �����ϴ� �޼��带 �ۼ��غ�����
			(��÷��ȣ 6�� + ���ʽ���ȣ 1��, �մ��� ���� ��ȣ�� 6��)
		
		2. ���α׷��� ���۵Ǹ� ��÷��ȣ�� �ϳ� �����ϰ� (���� 7��)
		   ��÷��ȣ�� ��ġ�ϴ� 6���� ���ڰ� ���� ������ ��ȣ�� ��� �̾ƺ�����
		   
		3. 1�� �Ǵ� 2� ��÷�ɶ����� ���� �󸶳� ����� ����غ�����
			(���� 6�� ���� ������ õ��, 1������ 2�������� �˷���� ��)
	*/
	
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 4;
	
	private static int bonus = 0;
	
	
	public static Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size() != len) {
			int ranNum = (int) (Math.random() * LOTTO_SIZE +1);
			//System.out.println("Set��" + ranNum + "�� �������ϴ�.");
			lotto.add(ranNum);
			
			if (len == 7 && lotto.size() == BONUS_INDEX) { //+ 4��° ���� ���ʽ� ��ȣ�� ����
				bonus = ranNum;
			}
		}
		return lotto;
	}
	
	public void test() {
		Set<Integer> win = generate(7); //+ len�� 7�̴�
		System.out.println("��÷ ��ȣ�� " + win + "�Դϴ�.\n �� �� ���ʽ� ��ȣ�� " + bonus + "�Դϴ�." );
		
		List<Integer> checkList = new ArrayList<>(7); //+������� 7�̴�(=��÷��ȣ ������ ��ȭ�����ʱ� ������ 7�� ����)
		
		long spent = 0;
		int count = 0;
		
		while (true) {
			Set<Integer> blackcow = generate(6);
			count++;
			
			checkList.addAll(win); //+��÷��ȣ
			checkList.removeAll(blackcow); //+������ȣ
			
			if (checkList.size() == 1) {
				spent = count * 1000;
				if (checkList.get(0) == bonus) { //+ ���� ���ڰ� ���ʽ���ȣ�� 1�� 	
					System.out.println("1�� ��÷�Դϴ�. " + count + "�� �����ϼ�����, ���±��� ���� ���� " 
								+ spent * 1000 + "�� �Դϴ�.");
				}else {
					System.out.println("2�� ��÷�Դϴ�. " + count + "�� �����ϼ�����, ���±��� ���� ���� " 
							+ spent * 1000 + "�� �Դϴ�.");
				}
				break;
			}
			checkList.clear();
		}
	}
	
	
	public static void main(String[] args) {
		D02_Lotto quiz = new D02_Lotto();
		quiz.test();
		
//		Set<Integer> win = quiz.generate(7); //+ ��÷��ȣ �̾Ҵ�.
//		
//		System.out.println("��÷ ��ȣ�� " + win + "�Դϴ�.\n �� �� ���ʽ� ��ȣ�� " + quiz.bonus + "�Դϴ�." );
//		
//		List<Integer> checkList = new ArrayList<>(7); //+������� 7�̴�
//		
//		long spent = 0;
//		int count = 0;
//		while (true) {
//			Set<Integer> blackcow = quiz.generate(6);
//			count++;
//			
//			checkList.addAll(win);
//			checkList.removeAll(blackcow);
//			
//			if (checkList.size() == 1) {
//				spent = count * 1000;
//				if (checkList.get(0) == quiz.bonus) {
//					System.out.println("1�� ��÷�Դϴ�. " + count + "�� �����ϼ�����, ���±��� ���� ���� " 
//								+ spent * 1000 + "�� �Դϴ�.");
//				}else {
//					System.out.println("2�� ��÷�Դϴ�. " + count + "�� �����ϼ�����, ���±��� ���� ���� " 
//							+ spent * 1000 + "�� �Դϴ�.");
//				}
//				break;
//			}
//			checkList.clear();
//		}
		
	}
}
		// +���� Ǭ��
//		List<Integer> winlist = new ArrayList<>();
//		List<Integer> picklist = new ArrayList<>();
//		
//		winlist = new ArrayList<>(Lotto.winningLotto());
//		
//		Collections.sort(winlist);
//		Collections.sort(picklist);
//		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
//		System.out.printf("> 1�� ��÷ ��ȣ : [%d, %d, %d, %d, %d, %d]\n> ���ʽ� ��ȣ : [%d]\n", 
//				winlist.get(0),winlist.get(1),winlist.get(2),winlist.get(4),
//				winlist.get(5),winlist.get(6),winlist.get(3));
//		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
//		
//		long count = 0L;
//		while(true) {
//			count++;
//			picklist = new ArrayList<>(Lotto.pickLotto());
//			inter(picklist, winlist);
//			if (inter(picklist, winlist).size() == 5 && winlist.get(3) != null) {
//					System.out.println("----------2�� ��÷ >>> ��ġ�� ��ȣ : " 
//							+ inter(picklist, winlist) + "[" + winlist.get(3) +"]");
//					break;
//			}
//		}
//		System.out.println("����� �ݾ��� : " + (count*1000) + "�� �Դϴ�.");
//		
//		winlist.remove(3);
//		
//		count = 0;
//		while(true) {
//			count++;
//			picklist = new ArrayList<>(Lotto.pickLotto());
//			inter(picklist, winlist);
//			if (inter(picklist, winlist).size() == 6) {
//				System.out.println("----------1�� ��÷ >>> ��ġ�� ��ȣ : " + inter(picklist, winlist));
//				break;
//			}	
//		}
//		System.out.println("����� �ݾ��� : " + (count*1000) + "�� �Դϴ�.");
//	}
//	
//	public static ArrayList<Integer> inter(Collection<Integer> picklist, Collection<Integer> winlist) {
//		ArrayList<Integer> inter = new ArrayList<>();
//		inter.addAll(winlist);
//		inter.retainAll(picklist);
//		
//		return inter;
//	}
//}
