import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_Exception {

	/*
		# ���� (Exception)
		  
		  - �츮�� ������� �˰� �ִ� ���� �۾����� ��� ���ܶ�� �θ���
		  - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ������� �θ���(��Ÿ ��)
		  - ���α׷��Ӱ� �߻� ������ ���ܸ� �̸� �����ϰ� ����صδ� ���� ����ó����� �θ���
		  - ����ó���� �⺻ ������ ���α׷� �������������� ���α׷��Ӱ� �ٸ� ��ġ�� ���Ѵٸ�
		    ���α׷��� ����ؼ� ������ �� �ִ�
		    
		# ���� ó��
		
		  - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
		  - try�� ������ �ڵ忡�� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
		  - try�� ���ο��� ���ܰ� �߻��ϴ� ��� ������ �ߴ��ϰ� �߻��� ���ܸ� ����ϴ� 
		    catch������ �Ѿ�� �ȴ�
		  - catch������ �߻��� ���ܿ� ���� ������ ����ִ� ���� �ν��Ͻ��� ���޵ȴ�
		  - catch���� ��ø�ؼ� ������ ����� �� �ִ�
		  - ���ܰ� �߻��ϵ� ���ϵ� ������ �����ϰ� ���� �ڵ�� finally���� �ۼ��Ѵ�
	*/
	
	public static void main(String[] args) {
		//System.out.println(10/0); //+ ������ �߻����� ������, ����� ������ �߻�
		// Exception in thread "main" java.lang.ArithmeticException: / by zero ������ ���� ArithmeticException ������ Ȯ�ΰ����ϴ�
		
		Scanner sc = new Scanner(System.in);
		//int[] values = new int[5];
		int[] values = null;
		
		// ����ó�� ��Ÿ�� 2����(�� �� ��1)
		// 1. if�� ����������
		// 2. ����ó��
		
		try {
			//System.out.println(values[3]);
			System.out.println(values.length);
			System.out.println(10/1);
			System.out.print("�ݵ�� 10���� ������ �Է����ּ��� ^^");
			int a = sc.nextInt();			
		} catch (ArithmeticException e) { //+ ���ܿ����� ������ �����°��� e��
			// e.printStackTrace() : ���ܰ� �߻��� ������ ���� ����� ����ϴ� �޼���
			e.printStackTrace(); //+ java.lang.ArithmeticException: / by zero //+ at C16_Exception.main(C16_Exception.java:19)
			//System.out.println(e.toString()); //+ java.lang.ArithmeticException: / by zero //+�̷� �޼����� ��µ�
			System.out.println("���� �ȵǴ� ����� �ϼ̳׿�. �������ʹ� �׷��� ������.");			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ִ� �ε����� ���̺��� 1�۽��ϴ�--- ^^");
		} catch (InputMismatchException e) {
			System.out.println("�ݵ�� 10���� ������ �Է��϶�� �����ٵ�?");
		} catch (NullPointerException e) {
			System.out.println("null ���� ���ľ����� ������..?");
		} finally { //+finally�� ���ܰ� �߻����� �ʴ�, �߻��ϴ� ������ ��µȴ�
			System.out.println(" /)/)");
			System.out.println("(  ..)");
			System.out.println("(  >��");
		}
		
		System.out.println("���α׷� ��!!");
	}
}
