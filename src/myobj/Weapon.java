package myobj;

public class Weapon {

	/*	
		������ �Ӽ�
		 - ���ݷ�
		 - ���� ��ȭ ���
		 - ��ȭ ��޺� ��ȭ Ȯ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
		 - ������ ���ݷ� ������
		 
		������ �޼���
		 - ��ȭ�ϱ�
		   (������ ��ȭ Ȯ���� ���� ��ȭ�� �����ϰų� �����Ѵ�) : ����
		   �����ϸ� ��ȭ ����� 1 �����Ѵ�
		   �����ϸ� ��ȭ ����� �״�� �����ȴ� (���Ѵٸ� ����߷��� ����)
	*/
	String name;
	int attack;
	int grade;
	int[] upgrade_chance = {
			90, 90, 80, 80, 80, 70, 70, 30 ,30, 30, 
			15, 15, 15, 10, 10, 10, 10, 5, 5, 5
			};
	//Ȯ���� ���Ҽ��� ����.
	int[] attack_incremaent = {
			10, 30, 100, 150, 200, 300, 700, 700, 700, 700,
			1000, 1000, 1000, 1000, 1500, 1500, 2500, 2500, 3000, 3500
			};
			
	Weapon(){
		name = "��������";
		attack = 5;
		grade = 0;
	}

	Weapon(int attack, String name){
		this.attack = attack;
		this.name = name;
		grade = 0;
	}
	
	boolean upgrade() {
		int value = (int) (Math.random() * 100); // 0~99 
		
		if(value < upgrade_chance[grade]) { // upgrade_chance[0] = 90, upgrade_chance[19] = 5
			System.out.printf("\"%s %+d\" ��ȭ�� �����ϼ̽��ϴ�\n", name, grade);
			grade++;
			return true;
		}else {
			System.out.println("��ȭ ����...");
			return false;
		}
	}
	
	void attack() {
		int damage = attack;
		
		for (int i = 0; i < grade; ++i) {
			damage += attack_incremaent[i];
		}
		
		System.out.printf("\"%s %+d\"�� �ֵѷ����ϴ�.[ ������:%d ]\n", 
				name, grade, damage);
	}

	//������ �ٸ� ������ �ִ�.
	public static void main(String[] args) {
		//��ü������ ���� ���� �޼��尡 ���ο��� ��� ���ٽ����� �����ϸ鼭 ����� ���� ����
		Weapon w = new Weapon();
		Weapon gun = new Weapon(10, "�񴰹�� ��");
		
		for (int i = 0; i < 30; ++i) {
			gun.upgrade();
			gun.attack();
		}
		
		//System.out.println(w.upgrade_chance.length); // 20�� 
		//System.out.println(w.attack_incremaent.length); // 20��
	
	}	

}
