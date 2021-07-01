
public class C14_AnonymousTnnerClass {

	/*
		# �͸� ���� Ŭ����
		
		  - Ŭ������ �������ڸ��� �̸��� �����ʰ� �ٷ� ����Ѵ��� ������ ���
		  - ��ȸ���̴�
	*/
	
	public static void main(String[] args) {
		
		fight(new Dragon()); //+ private static void fight(Monster monster) �� �־�� �ش籸�� ��밡��
		fight(new SkeletonWarrior()); //+ (Monster monster) = (new SkeletonWarrior() =>  monster�� ���̷������縦 ����
		
		// �͸� ���� Ŭ������ �Ｎ���� �ش� Ŭ������ ����� �����Ѵ�
		// ������ �ڿ� {}�� ��� �Ｎ�ؼ� Ŭ������ �����ؼ� ����ϴ� ����� �͸� ���� Ŭ������� �Ѵ�
		Dragon dragon01 = new Dragon() { //+ �ٷ� ��ӹ޾Ƽ� �Ʒ��� �����Ѵ�. (�̰� ��ĳ�����̴�) //+ new Dragon()�� Dragon�� �ڽ��̴�
			@Override
			void attack() { //+� �巡�� ���������� �˼�������, �͸� �巡�� �����̴�
				//super.attack(); //+��� �⺻��
				System.out.println("���� �巡���� ������ �վ �����մϴ�.");
			}
		}; //+ �̰� ���, �̰� ��� �����ϰڴ�(!!!)
		
		fight(dragon01);
		fight(new SkeletonWarrior() { //+� �ذ� ���������� �˼�������, �͸� �ذ� �����̴�
			@Override
			void attack() {
				//super.attack(); //+�ذ����簡 Į�� �ֵѷ��� �����մϴ�.
				System.out.println("���̷��� ���к��� ���и� �о �����մϴ�.");
			}
		});
		
		// �ν��Ͻ�ȭ �� �� ���� �߻� Ŭ������ �Ｎ�ؼ� ��ӹ޾� �����ع��� �� �ִ�
		Monster monster01  = new Monster() { //+� ���������� �˼�������, �͸� �ڼ�(����)�̴�
			@Override
			void attack() {
				System.out.println("���� ��ġ��!");
			}
		};
		fight(monster01);
	}
	private static void fight(Monster monster) { //+ MonsterŸ���� monster�� �����ϸ�,
		monster.attack(); //+ monster�� ����(attack)���Ѵ�
	}
}
//+ abstract : ���¸� ����� ���� �ϼ��� �ڼ� Ŭ�������� �̷�� Ŭ����
abstract class Monster {
	abstract void attack();
}
//+ abstract class Monster�� �ڼ� Ŭ����
class Dragon extends Monster { //+ abstract class Monster���� ������ ���� ����� �����(�������̵�)
	
	@Override
	void attack() { //+ �͸�Ŭ�������� �Ʒ��� ������ �����Ѵ�. ���ο� �巡���̵ȴ�(!!!)
		System.out.println("�巡���� ���� �վ �����մϴ�.");
	}
}

class SkeletonWarrior extends Monster {
	
	@Override
	void attack() {
		System.out.println("�ذ����簡 Į�� �ֵѷ��� �����մϴ�.");	
	}
}