package myobj.item;

public class Eraser extends Item {

	public Eraser() {
		super("���찳", 500);
	}

	@Override
	public void use() {
		System.out.println("�ʱ⸦ ���� �� �ֽ��ϴ�. ������ ������ϴ�.");
	}

}
