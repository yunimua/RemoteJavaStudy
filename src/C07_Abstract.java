
public class C07_Abstract {
	
	/*
		# �߻� Ŭ���� (abstract class)
		  
		  - ���¸� ����� ���� �ϼ��� �ڼ� Ŭ�������� �̷�� Ŭ����
		  - ���ο� �߻� �޼��带 �����ϰ� �ִ� Ŭ����
		  
		# �߻� �޼��� (abstract method)
		
		  - ������ ���� �޼���
		  - abstract�� ���� �޼���� ���� ������ �� ����, ��ӹ��� Ŭ�������� �����ؾ��Ѵ�
	*/
	public static void main(String[] args) {
		testPokemon(new Pikachu());
		testPokemon(new LongStone());
	}
	
	//Pokemon Ŭ������ ��ӹ��� ��� �ν��Ͻ��� �Ű������� ���� �� �ִ� �޼���
	public static void testPokemon(Pokemon p) {
		p.skill1();
		p.skill2();
	}
	//+ �Ʒ��� �޼��带 �߰� �������� �ʰ� �� �޼��� 1������ ��� ��ų ������ �ҷ��� �� �ִ�
	
	// �̷��� ����� ���ϸ� �Ѹ��� �߰��Ҷ� ���� �޼��尡 �ϳ��� �߰��ȴ�..
//	public static void testPokemon(Pikachu p) {
//		p.skill1();
//		p.skill2();
//	}
//	public static void testPokemon(LongStone stone) {
//		stone.skill1();
//		stone.skill2();
//	}
}

abstract class Pokemon { //+ abstract Ŭ�������� �ȿ��� abstract�� �ٿ����Ѵ�
	//+ Pokemon�� ��ӹ��� ��� Ŭ������ ��ų1,2�� �������ִ�
	abstract void skill1();
	abstract void skill2();
}

class Pikachu extends Pokemon {
	// skill 1, 2�� ���� �������̵尡 �ʿ������� �ȳ��� ������, �������̵� �ϱ����� ������ �߻���, ���� ������� ��
	@Override
	void skill1() {
		System.out.println("�����ġ��");	
	}

	@Override
	void skill2() {
		System.out.println("�鸸��Ʈ");
	}	
}

class LongStone extends Pokemon {

	@Override
	void skill1() {
		System.out.println("���ı�");
	}

	@Override
	void skill2() {
		System.out.println("��ġ��");
	}
	
}
