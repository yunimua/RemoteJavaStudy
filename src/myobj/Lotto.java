package myobj;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	
	static Set<Integer> lottonum;
	static Set<Integer> lottopick;

	static int[] count;
	
	final private static int MAX_NUMBER = 45;
	
	public static Set<Integer> winningLotto() { //��÷ ��ȣ
		Set<Integer> lottoNum = new HashSet<>();
		
		while(lottoNum.size() < 7) {
			lottoNum.add((int)(Math.random()*MAX_NUMBER+1));
		}
		//System.out.println("��÷ ��ȣ : " + lottoNum);
		return lottoNum;
	}
	
	public static Set<Integer> pickLotto() { //��÷ ��ȣ
		Set<Integer> pickNum = new HashSet<>();
		
		while(pickNum.size() < 6) {
			pickNum.add((int)(Math.random()*MAX_NUMBER+1));
		}
		//System.out.println("������ ��ȣ : " + pickNum);
		return pickNum;
	}	
}
