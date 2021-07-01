import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D08_String {

	/*
	
	
	*/
	
	public static void main(String[] args) { //+ ���ڿ��� �����ϴ� ������ Ŭ���� : String, static / �ν��Ͻ� ��ɵ��� ���ԵǾ��ִ�..

		String fruits = "apple/banana/orange/pineapple/kiwi"; //+ fruits�� �ּҰ� ����ִ�, String Ŭ������ �ν��Ͻ�(����)�� ����ִ�
		
		// split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] splitted = fruits.split("/");
		
		for (int i = 0; i < splitted.length; ++i) {
			System.out.println(i + " : " + splitted[i]); //+ �ϳ��� ������ / �������� ���� 0~4���� 5���� ������ ������ ���
		}
		
		// String.join(delim, �̾���̰� ���� ��...) : ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�
		String after = String.join(",", splitted);
		System.out.println(after); //+ apple,banana,orange,pineapple,kiwi
		System.out.println(String.join("-", "����", "���", "����", "�췰", "����")); //+ ����-���-����-�췰-����
		
		printRabbitWithMessage("Ŀ��", "����", "�ֽ�", "���", "�Ǹ�"); //+ �䳢 �ٷ� �ؿ� �Է��� ���� ���
		printRabbitWithMessage("����", "����");
		
		// substring(start) : ���ڿ��� start���� ���������� �ڸ���
		// substring(start, end) : ���ڿ��� start���� end �̸����� �ڸ� �ν��Ͻ��� ��ȯ
		String sn = "991231-123457";
		
		String year = sn.substring(0,2);
		String month = sn.substring(2,4);
		String date = sn.substring(4,6);
		
		System.out.println("year : " + year); //+ 99 �� ���ڸ� �迭�� ���� ���·� ©�� ��밡��
		System.out.println("month : " + month); //+ 12
		System.out.println("date : " + date); //+ 31
		
		// contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���? " + ph.contains("1234")); //+ ph�� 1234�� ���ԵǾ� �ֳ���? true
		
		// startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		System.out.println("ph�� 010���� �����ϳ���? " + ph.startsWith("010")); //+ ph�� 010���� �����ϳ���? true
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println("ph�� 4�� ��������? " + ph.endsWith("4")); //+ ph�� 4�� ��������? true
		
		// replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd"); //+ 1234�� abcd�� �ٲ۴�
		System.out.println("���� : " + ph + ", ��� : " + result); //+ ���� : 010-1234-1234, ��� : 010-abcd-abcd
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ�
		System.out.println(Arrays.toString("hello".getBytes())); //+ [104, 101, 108, 108, 111]
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes()));
		
		// � ��Ģ�� ����� byte[]�� ��ȯ�� �� ������ �� �ִ�
		try {
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-8"))); 
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-16")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("EUC-KR"))); //+ �ȳ��ϼ��� �ݰ����ϴ�.
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();	
		System.out.println(new String(message)); //+ String �����ڿ��� byte �迭�� �ٲٴ� ����� ����ִ�
		
		//trim() : ���ڿ� �ٱ����� ������ �������ش�
		String user_input = "\t java \n" ;
		String answer  = "java";
		System.out.println( "��������" + user_input.trim().equals(answer)); //+ .trim() �� �ϰ� �� equals > ��� : true
		
		String text = "hello, java!!";
		
		// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(text.toUpperCase()); //+ HELLO, JAVA!!
		System.out.println(text.toUpperCase().toLowerCase()); //+ hello, java!!
		
		// indexof(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		// indexof(seq, start) : ���� ��ġ���� ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		String languages = "Java, Pythonm, C, C++, C#, kotlin, JavaScript";
		
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java")); //+ ��� 0��°
		System.out.println(languages.indexOf("JavaScript", 350)); //+ ��� 35��°, 0�̾ƴ� 1���ĺ����� �ε����� ã�ұ� ����
		
		// ���� : languages���� "Java"��� ���ڿ��� ��� �ε����� ã�Ƽ� ������ �ڷ� �÷��ǿ� �����Ͽ� ����غ�����
		//System.out.println(languages.length()); //+ �� 360����
		
		ArrayList<Integer> indexes = new ArrayList<>();
		String search = "Java";
		
		// while������ �� ���	(3)	
		int found = -1;
		while((found = languages.indexOf(search, found+1)) != -1) {
			indexes.add(found);
		}
		System.out.println("ã���� : " + indexes);
		
		// while������ �� ���	(2)	
//		int start = 0;
//		int found = -1;
//		while((found = languages.indexOf(search, start)) != -1) {
//			indexes.add(found);
//			start = found + 1;
//		}
		
		// while������ �� ���	(1)	
//		int start = 0;
//		while(languages.indexOf(search, start) != -1) {
//			int found = languages.indexOf(search, start);
//			indexes.add(found);
//			start = found + 1;
//		}
		
		// for������ ����� 
//		for (int start = 0; start < languages.length();) { //+ 1�� ������ų �ʿ䰡 ����
//			int index = languages.indexOf(search, start);
//			
//			if(index == -1) {
//				break;
//			}
//			
//			System.out.println("�̹��� ã�� : " + index);
//			indexes.add(index);
//			start = index + 1;
//		}
//		System.out.println("ã���� : " + indexes);
		
//		ArrayList<Integer> indexChk = new ArrayList<>();
//		
//		indexChk.add(languages.indexOf("Java")); //+0
//		indexChk.add(languages.indexOf("Java", 1)); //+35 (35����)
//		indexChk.add(languages.indexOf("Java", 36)); //+45 (10����)
//		indexChk.add(languages.indexOf("Java", 46)); //+80 (35����)
//		indexChk.add(languages.indexOf("Java", 81)); //+90 (10����)
//		indexChk.add(languages.indexOf("Java", 91)); //+125 (35����) // 350�����ִ�..
//		System.out.println(indexChk);
		
		
	
	}
	
	//+ �������� �޼��� �����
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�
	//  �� �������ڴ� �׻� �޼����� �������� �����ؾ� �Ѵ�
	static void printRabbitWithMessage(String...msgs) {
		System.out.println("/)/)");
		System.out.println("( ..)");
		System.out.println("( >��");
		System.out.println(Arrays.toString(msgs));
	}
}
