
public class C12_InnerClass {
	
	/*
	  	# Ŭ���� ���ο� Ŭ���� ����ϱ�
	  	
	  	 - Ŭ���� ���ο��� Ŭ������ �����ϰ� ����� �� �ִ�
	  	 - Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ�
	  	 - static Ŭ������ �����ϸ� �ν��Ͻ��� ��� ����� �� �ִ�	
	
	*/
	public static void main(String[] args) {
		// ���� �ν��Ͻ� Ŭ������ �ν��Ͻ� ����
		MintChocoLatte drink = new MintChocoLatte(true);
		MintChocoLatte drink2 = new MintChocoLatte(false);
		
		drink.new Chocolate(); //+ ���ݸ��� �� ��ҽ��ϴ�.
		drink2.new Chocolate(); //+ ���ݸ��� �� �ȳ���ϴ�.
		
		// ���� ����ƽ Ŭ������ �ν��Ͻ� ���� //+hot�� ������ �����ʴ´�
		MintChocoLatte.Mint mint = new MintChocoLatte.Mint(); //+��Ʈ�� �µ��� ������ ���� �ʰ� ġ����� ���ϴ�.
	}
}

class MintChocoLatte { //+��Ʈ ���ڶ󶼶��..
	
	boolean hot;
	
	public MintChocoLatte(boolean ishot) { //+ishot�� ������, �װ� hot��(false)����
		hot = ishot;
	}
	
	/**
		������ Ŭ������ MintChocoLatte�� �ν��Ͻ��� �����ؾ� �Բ� �����Ǵ� ���赵�̴�. 
		���ο��� ��Ʈ���ڶ��� �ν��Ͻ� ������ ������ �޴� Ŭ������ ������ �� �ִ�
	*/ 
	//+ hot ���ΰ� �����Ǿ�� Chocolate Ŭ���� ������ �����ϴ�
	class Chocolate {
		String msg;
		
		public Chocolate() {
			if(hot) {
				System.out.println("���ݸ��� �� ��ҽ��ϴ�.");
			}else {
				System.out.println("���ݸ��� �� �ȳ���ϴ�.");
			}
		}
	}
	/**
	   ���ο� �ν��Ͻ��� ������ ���� �ʴ� ����ƽ Ŭ������ �����ϴ� �͵� �����ϴ�.
	*/
	
	static class Mint {
		public Mint() {
			System.out.println("��Ʈ�� �µ��� ������ ���� �ʰ� ġ����� ���ϴ�.");
		}
	}
}
