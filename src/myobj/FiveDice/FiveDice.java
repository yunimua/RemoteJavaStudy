package myobj.FiveDice;

import java.util.Arrays;

public class FiveDice {
	
	final static int MAX_DICE_NUM = 6;
	final static int FIVEDICE = 5;
	
	static int[] dice; 
	static int[] count;
	
	boolean five;
	boolean four;
	boolean two;
	boolean three;
	boolean strL;
	boolean strS;
	
	public void randomDice() {
		dice = new int[FIVEDICE]; // 5���� �ֻ���
		count = new int[MAX_DICE_NUM]; // 6���� ����
		
		for(int i = 0; i < FIVEDICE; ++i) { // 5���� �ֻ���(0~4���� 5�� ����)
			dice[i] = (int)(Math.random() * MAX_DICE_NUM +1); // 1~6 ���� ���� (0~5�� ���� �ʱ� ���� +1)
		}
		for (int i = 0; i < FIVEDICE; i++) {
			count[dice[i] - 1]++; // 1�̳����� count[0]�� �ֱ� ���ؼ� -1�� �ʿ�
			//System.out.print (count[(dice[i] -1)] + " "); // ���� ������ �� ī��Ʈ �����Ǵ°� Ȯ��
		}
	}
	
	boolean fiveDice(){
		for (int chk : count) {
			if (chk == 5) {
				five = true;
			}
		}
		System.out.println("[5same_Num] ? : " + five); // true, false üũ��..
		return five;
	}
	
	boolean fourDice() {
		for (int chk : count) {
			if (chk == 4) {
				four = true;
			}
		}
		System.out.println("[4same_Num] ? : " + four);
		return four;
	}
	
	boolean fullHouse() {
		for (int chk : count) {
			if (chk == 2) { // ���� �ΰ��� ���� �� , chk == 2 && chk == 3 �� �ְԵǸ� 111�� ������ ���� true�� ��
				two = true;
			}else if (chk == 3) { // ���� ������ ���� ��, ������ üũ
				three = true;
			}
		}
		System.out.println("[2]+[3]same_Num ? : " + (two && three));
		return two && three; // 2���� ������ ��� true �϶�..
	}
	
	boolean largeStraight() {
		for (int chk : count) {
			//System.out.print(chk + "-"); // �� ���ں� ī��Ʈ�� ���� üũ..
			if (count[1] >= 1 && count[2] >= 1 && count[3] >= 1 && count[4] >= 1 ) { // 1~6���� 2,3,4,5�� 1�϶�
				if (count[0] >= 1 || count[5] >= 1) { // 1~6���� 1,6�� 1�� ��
					strL = true;
				}
			}
		}
		System.out.println("[5Serial_Num] ? : " + strL);
		return strL;
	}
	
	boolean smallStraight() {
		for (int chk : count) {
			//System.out.print(chk + " "); 
			if (count[2] >= 1 && count[3] >= 1) { // 1~6���� 3,4�� 1�϶�
				if (count[0] >= 1 && count[1] >= 1 || // 1~6���� 1,2�� 1�϶�
					count[1] >= 1 && count[4] >= 1 || // 1~6���� 2,5�� 1�϶�
					count[4] >= 1 && count[5] >= 1) {   // 1~6���� 5,6�� 1�϶�
					strS = true;
				}
			}
		}
		System.out.println("[4Serial_Num] ? : " + strS);
		return strS;
	}
	
	public void result() {
		if(fiveDice()) {
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
			System.out.println("   �Ƣ�       5Dice!        �Ƣ�");
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		}else if (fourDice()) {
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
			System.out.println("   �Ƣ�       4Dice!        �Ƣ�");
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		}else if (fullHouse()) {
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
			System.out.println("   �Ƣ�     FULL HOUSE!!    �Ƣ�");
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		}else if(largeStraight()) {
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
			System.out.println("   �Ƣ�   largeStraight!!!  �Ƣ�");
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		}else if (smallStraight()) {
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
			System.out.println("   �Ƣ�   Small Straight!!  �Ƣ�");
			System.out.println("   �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		}else {
			System.out.println("��������������������������������������������������������������");
			System.out.println("   ����!!! ������ ������ �����ϴ�. ");
			System.out.println("��������������������������������������������������������������");
		}
		System.out.println(">>>>> ������ ����Ǿ����ϴ�.");
	}
	@Override
	public String toString() {
		return Arrays.toString(dice);
	}

//	public static void main(String[] args) { // ���� üũ��..
//		FiveDice dice = new FiveDice();
//		
//		dice.randomDice();
//		System.out.println("��������������������������������������������������������������");
//		System.out.println(" Random Dice : " + dice);
//		System.out.println("��������������������������������������������������������������");
//		dice.result();
//		
//	}
}





