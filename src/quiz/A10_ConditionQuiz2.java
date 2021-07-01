package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	/*
	 	[ �븣留욎� 議곌굔�떇�쓣 留뚮뱾�뼱蹂댁꽭�슂 ]
	 	
	 	1. char�삎 蹂��닔 a媛� 'q' �삉�뒗 'Q' �씪�븣 true
	 	2. char�삎 蹂��닔 b媛� 怨듬갚�씠�굹 �꺆�씠 �븘�땺�븣 true
	 	3. char�삎 蹂��닔 c媛� 臾몄옄 ('0'~'9') �씪�븣 true
	 	4. char�삎 蹂��닔 d媛� �쁺臾몄옄(��臾몄옄 �삉�뒗 �냼臾몄옄)�씪 �븣 true
	 	
	 	�� �쑀�땲肄붾뱶 �몴 寃��깋
	 	5. char�삎 蹂��닔 e媛� �븳湲��씪 �븣 true
	 	6. char�삎 蹂��닔 f媛� �씪蹂몄뼱�씪 �븣 true
	 	
	 	7. �궗�슜�옄媛� �엯�젰�븳 臾몄옄�뿴�씠 exit�씪 �븣 true
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = 'Q';
		char b = 'a';
		char c = '1';
		char d = 'g';
		
		char e = '뷔';
		char f = 'ぽ';
		
		String text = "exit";
		
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' || b != '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		System.out.println(e >= '가' && e <= '힣');
		System.out.println((f >= 0x30A1 && f <= 0x30FF) || (f >= 0x3041 && f <= 0x309F));
		
		System.out.print("exit를 입력하면 true, 아닐 시 false 출력 >> ");
		text = sc.nextLine();
		System.out.println(text.equals("exit"));
	
		
		/*
		char a = 'q';
		char b = 'b';
		char c = '8';
		char d = 's';
		
		//char e = (44032);
		//char f = (12356);
		
		String str = "exit";
		
		System.out.println(a == 'q' || a == 'Q');  // 대문자도 같이 포함시키기..
		System.out.println(b != '\t' && b != ' '); //공백 조건도 포함..
		System.out.println(c >= '0' && c <= '9');  // int 변환 필요없...그대로 한문자로 적기
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')); // a~z, A~Z까지 모두 포함해야함..
		//System.out.println(e >= (char)44032 && e <= 55203);
		//System.out.println(f >= (char)12353 && f <= 12543);
		System.out.println(str.equals("exit"));

		// 정답 정리..
		System.out.println("======================");
		
		char e = '가';
		char f = 'ぁ';
			
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != '\t' && b != ' ');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		
		System.out.println(e >= '가' && e <= '힣');
		//16진수를 나타낼때 0x를 붙여서 입력한다
		System.out.println((f >= 0x3041 && f <= 0x3096) || (f >= 0x30A1 && f <= 0x30FF));
		//System.out.println((f >= 'ぁ' && f <= 'ゖ') || (f >= 'ァ' && f <= 'ヿ')); 
		// ㄴ 위와 같이 일본어로 입력하면 실행 및 저장시 UTF-8 로 저장해야함
		
		System.out.println("exit를 입력하면 true가 나옵니다 > ");
		String txt = sc.nextLine();
		System.out.println(str.equals("exit"));
		*/		
		
	}
}
