import java.util.InputMismatchException;

public class C17_Throw {

	/*
		# throw
		
		  - ���ϴ� ���ܸ� �߻���Ų��
	
		# throws
		
		  - �ش� �޼��忡�� �߻��ϴ� ���ܸ� ����Ѵ�
		  - �ش� �޼��带 ȣ���ϴ� ������ ����ó���� �̷��
		  
		# Exception Ŭ����
		
		  - Exception Ŭ������ ��Ӵ䤧�� ���ܸ� ������ �� �ִ�
		  - Exception Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó���ؾ��ϴ� ���ܰ� �ȴ�
		  - �ݵ�� ����ó���� �Ǿ� �־�� �������� ������ش�
		  
		# RuntimeException Ŭ����
		
		  - RuntimeException Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó������ �ʾƵ� �Ǵ� ���ܰ� �ȴ�
		  - ����ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ´�
	*/
	
	public static void main(String[] args) {
		
		test2();
		
		//throw new InputMismatchException(); //+���� ���ܸ� �߻���Ŵ
		try {
			test(); //+ test()�� �������� �� ����ó���� �ʿ��ϴ�
		} catch (NotAnimalException e) {//+(1��) : ����ó��
			//e.printStackTrace(); //+ ���� ����Ʈ ��µ�
			System.out.println("ȣ������� ������ �ƴմϴ�.");
		} catch (RuntimeException e) {
			
		}
	}
	
	public static void test() throws NotAnimalException {
		String name = "ȣ������";
		
		if (name.equals("ȣ����")) {
			System.out.println("����");
		} else if(name.equals("ȣ������")) {
			throw new NotAnimalException(); //+ �ݵ�� ����ó���� �ʿ��ϴ�(1��)
		}
	}
	
	public static void test2() {
		int a = 3;
		
		if (a % 2 == 0) {
			System.out.println("¦��"); 
		} else {
			throw new NotEvenException(); //+ Exception in thread "main" NotEvenException: ¦���� �ƴմϴ�.
		}
	}
	//+ å������
//	public static void test() throws InputMismatchException { //+ �̷�(InputMismatchException) ���ܰ� �߻��� ���� ����
//		
//		int[] num = new int[10]; //+ ���� ����ó���� �̷��? 
//		num[15] = 1;
//	}
}

class NotAnimalException extends Exception {
	public NotAnimalException() {
		super("������ �ƴմϴ�.");
	}
}

class NotEvenException extends RuntimeException {
	public NotEvenException() {
		super("¦���� �ƴմϴ�.");
	}
}
