import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
		# ����ǥ���� (Regular Expression)
		
		  - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
		  - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�
		  - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
		  
		# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
		
		  - Pattern
		  - Matcher
	*/
	
	public static void main(String[] args) {
		
		//+ boolean java.util.regex.Pattern.matches(String regex, CharSequence input)
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep")); //+ true
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ���� // �ϳ��� �ѱ���!!!!!!!!!!!!!!!!!
		System.out.println(Pattern.matches("s[l@]eep", "sleep"));
		System.out.println(Pattern.matches("s[l@]eep", "sheep")); //+ false
		System.out.println(Pattern.matches("s[l@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[l@]eep", "saeep")); //+ false
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijk]", "sleek")); //+ []�ȿ� �� ��� ���ĺ����� üũ�ȴ�, ��ҹ��� ���е�
		
		/*
			[abc]	: �ش� �ڸ��� a �Ǵ� b�Ǵ� c�� ���
			[^abc]	: �ش� �ڸ��� abc�� ������ ��� ���� ���
			[a-z]	: a���� z���� ��� ���
			[A-Z]	: A���� Z���� ��� ���
			[\\-]	: ���ڷμ� -�� ���(Escape)
			[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ���(������)
		*/
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep")); //+ false
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep")); //+ true
		System.out.println(Pattern.matches("s[a-e&&c-z]eep", "sceep")); //+ true
		
		/*
			# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		
				.  : ��� ����
				\d : ��� ���� [0-9]
				\D : d���ڸ� ������ ��� ��
				\s : ��� ���� (\t, \n, \r, ' ')
				\S : ������ ������ ��� �� (S�빮��)
				\w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
				\W : \w�� ������ ��� �� (W�빮��)
				
		*/
		System.out.println(Pattern.matches("s.eep", "s eep")); //+ .�� ��繮�� 1���� ���(Ư��, ����, ���� ���о���)
		System.out.println(Pattern.matches("s\\Seep", "sdeep")); //+ ������ ������ ���� 
		
		/*
			# �ش� ������ ����� ������ ������ �����ϴ� ���
			
				[.]{n} : {}���� ������ n��(n�� ����) ��ġ�ؾ� �Ѵ�
				[.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
				[.]{n,} : {}���� ������ �ּ� n���̻� ��ġ�ؾ� �Ѵ�
				[.]? : ? ���� ������ 0���Ǵ� �ѹ� ���;��Ѵ�
				[.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;��Ѵ�
				[.]* : * ���� ������ 0�� �̻� ���;� �Ѵ� (���͵��ǰ�, �ȳ��͵���)
		*/
		
		System.out.println(Pattern.matches("[.]{5}", ".....")); //+ .�� 5�� ���Ǵ� ��쿡�� ���(true)
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abs..")); //+ .�� ��ҹ��� ���ĺ��� 5���� �ִ� ��쿡�� ���(true)
		System.out.println("---------------------------------------------------------");
		
		System.out.println(Pattern.matches("[.]{1,2}", ".")); //+ false
		System.out.println(Pattern.matches("[.]{1,2}", ".."));
		System.out.println(Pattern.matches("[.]{1,2}", "..."));
		System.out.println(Pattern.matches("[.]{2,5}", "...."));
		System.out.println(Pattern.matches("[.]{2,5}", "....."));
		System.out.println(Pattern.matches("[.]{2,5}", "......")); //+ false
		
		System.out.println(Pattern.matches("s?heep", "heep")); //+ true
		System.out.println(Pattern.matches("s?heep", "sssheep")); //+ false
		System.out.println(Pattern.matches("s?heep", "kheep")); //+ false, s�� ���� k�� ���Ե��� ���� �����̹Ƿ�.
		
		System.out.println(Pattern.matches("s+heep", "ssssssheep")); //+ s�� ������ ���͵� true
		System.out.println(Pattern.matches("s?heep", "heep")); //+ s�������� false
		System.out.println(Pattern.matches("s*heep", "heep")); 
		
		System.out.println("---------------------------------------------------------");
	
		//��������
		System.out.println(Pattern.matches("010{1}-[2-9]\\d{3}-[0-9]{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("\\d{6}-?[1-4]\\d{6}", "001231-1234567"));
		System.out.println(Pattern.matches("\\d{6}-?[1-4]\\d{6}", "111111-1234567"));
		System.out.println(Pattern.matches("\\w{2,}@\\w+.\\w+.\\w*","emaiL123@gmail.co.kr"));
	
		// �������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������.
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", "010-2234-1234"));
		
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("\\d{2}(0[1-9]|1[1-2])(0[1-9]|[12][\\d]|3[01])-?[1-4]\\d{6}", "001231-1234567"));
		
		// �������� : �ش� �������� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?","emaiL123@gmail.co.kr"));
		
		String email1 = "emaiL123@gmail.co.kr";
		
		emailChk(email1);
		emailChk("e@g.c.r");
		emailChk("@d.d");
		
		// # Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern0 = Pattern.compile("an"); //+ (1) an�� ��ġ�ϴ� ������ ã���ش� : 4��
		Pattern pattern1 = Pattern.compile("a.{2}le"); //+ (2) . : ��� ���� >> apple 4��
		Pattern pattern2 = Pattern.compile("na");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern2.matcher(fruit); //+ import java.util.regex.Matcher; ����Ʈ �ʿ�!!!
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while (matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + "���� " + matcher.end() + "����");
			System.out.println(fruit.substring(matcher.start(), matcher.end())); //+ ���� ���� ��..
			
			System.out.println();
		}
	}
	
	static void emailChk(String email) {
		String chk = email;
		if (Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?", chk)) {
			System.out.println("�ùٸ� �̸��� ���� �Դϴ�.");
		}else {
			System.out.println("�ùٸ��� ���� �̸��� ���� �Դϴ�.");
		}
	}
}
