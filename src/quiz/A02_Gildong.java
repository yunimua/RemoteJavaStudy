package quiz;

public class A02_Gildong {
	public static void main(String[] args) {
		
		// byteŸ���� ������ ���۽ÿ� ����ϴ� ��찡 ��κ��̴�
		// ���� ������ �۴ٰ��ؼ� byteŸ���� ��������� �ʴ´�
		String banner = "========== ȸ�� ���� ==========";
		String name = "ȫ�浿";
		int age = 20;
		String tel = "010-123-1234";
		double height = 178.5;
		double weight = 75; // �Ҽ� ������ �Էµ� ���� ������! int > double�� ����
		String booldType = "O";
		boolean smoker = true;
		
		System.out.println(banner + "\n");
		System.out.println("�̸�\t: " + name);
		System.out.println("����\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("Ű\t: " + height);
		System.out.println("������\t: " + weight);
		System.out.println("������\t: " + booldType);
		System.out.println("������\t: " + smoker);
	}
}
