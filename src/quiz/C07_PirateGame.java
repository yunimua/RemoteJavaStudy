package quiz;

import java.util.Scanner;

import myobj.PiratePlay;
import myobj.pirate.Graphic;
import myobj.pirate.MrTong;
import myobj.pirate.Player;

public class C07_PirateGame {

	/*	
		1. �÷��̾�� ���ϴ� ���� ���ư��鼭 Į�� ���
		
		2. ���� �������� ���ư��� ������ �������� �����ȴ�
		
		3. �÷��̾�� �������� �� �� �ִ�(�ּ� 2��, �ִ�� ���� ���ڸ�ŭ)
		
		4. �� ���� ������ ���� ������ ������ �� �ִ�
		
		5. ���� �������� ���� �÷��̾ �й��Ѵ�
	*/
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
//		int numOfplayer = -1;
//		while(numOfplayer < 2) { //+2�� �̻� �Է��Ҷ����� ����
//			System.out.print("ħ���� �ο� ���� �Է� > ");
//			numOfplayer = sc.nextInt();
//		}
//		
//		Player[] players = new Player[numOfplayer]; //+ import�� �Ѵ� : import myobj.pirate.Player;
//		
//		for (int i =0; i < numOfplayer; ++i) {
//			players[i] = new Player("�÷��̾�" + (i+1));
//		}
//		System.out.println("[System] �÷��̾� ��� �Ϸ�");
//		
//		//���߿� �� ũ�� ����
//		int size = 30;
//		
//		while (true) {
//            MrTong tong = new MrTong(size); //+ MrTong���� size�� üũ
//            int turn = 0;
//            
//            boolean this_game = true;
//            while (this_game) {
//                System.out.println((turn + 1) + "�� > \"" 
//                                + players[turn % numOfplayer].getName() + "\"���� ����" );
//                Graphic.printTong(tong);
//                
//                System.out.println();
//                    
//                boolean this_turn = true;
//                while (this_turn) {
//                    int select = 0;
//                    while (select < 1 || select > size) {
//                            System.out.printf("� ���� ��ȣ�� �����ϼ��� (1 ~ %d) : ", size);
//                            select = sc.nextInt();
//                    }   
//                    if (tong.stab(select - 1)) { //+ MrTong���� stabüũ
//                            
//                            // ��⵵ �����ϰ� �߻絵 ��Ų ���
//                         if (tong.launched) {
//
//                                    // ���� ���� �÷��̾�� 1�� �߰�
//                                    // ������ �÷��̾���� 1�� �߰�
//                                    // ���� �������� �Ѿ�� ��
//                                for (int i = 0; i < numOfplayer; ++i) {
//                                    if (i == turn % numOfplayer) {
//                                            players[i].lose();
//                                            System.out.println(players[i].getName() + "���� �й�!");
//                                    } else {
//                                            players[i].win();
//                                    }
//                                }     
//                                this_game = false;
//                                        
//                         } else { // ������ �߻�� �Ƚ�Ų ���
//                                        
//                          // ���� ����� ��� ���� �� 
//                          this_turn = false;
//                         }
//
//                        break;
//                    } else {
//                     System.out.println("�̹� �񷶴� ���Դϴ�.");
//                    }
//                 }	
//                
//            turn++;
//            }
//            
//	        System.out.println("�� ������ ���۵˴ϴ�!");
//	        System.out.println("#################################");
//	        System.out.println("");
//	        System.out.println("#################################");
//		}
//	}
//}


//			tong.stab(5); //+ 5��°�� O���� X�� �ٲ�
//			
//			tong.stab(13);
//			
//			tong.stab(29); //+29��°�� X�� �ٲ�, 30��°�� ������
			
			// �̹� ������ tong �������� ������ ������ �׷��� �Լ��� �ѱ� 
			//+ Graphic �ȿ� ������ public static void "printTong"(MrTong tong) {���� ������
			//Graphic.printTong(tong.getStabbed()); //+��������� �����ͼ� �׷����� ����ϴ� ���(1��)
//			Graphic.printTong(tong);
			

		PiratePlay p = new PiratePlay(0, 0);
		
		p.new_Game();
	}
}	
		
//		Scanner sc = new Scanner(System.in);
//		
//		int hole = 10;
//		int player = 2;
//		int choice_hole;
//		int lose_hole;
//
//		//�÷��̾� ���� 2���� ���ų�, ������ �÷��̾� ������ ���ų� ���� ���� �ٽ� �Է�
//		while(player < 2) {
//			System.out.print("�÷��� �� �ο�(2���) �Է�: ");
//			player = sc.nextInt();
//		}
//		while(hole < player || hole == player) {
//			System.out.print("�� ���� ���� �Է�: ");
//			hole = sc.nextInt();
//		}
//		
//		lose_hole = (int)(Math.random()*hole+1);
//		System.out.println("���� : " + lose_hole);
//		
//		int i = 0;
//		while(i < hole) {
//			System.out.printf("�÷��̾�[%d] ��� > ", i % player+1);
//			choice_hole = sc.nextInt();
//			int[] check = {choice_hole};
//			
//			if(choice_hole > hole || choice_hole < 1) {
//				continue;
//			}
//			if(choice_hole == lose_hole) {
//				System.out.println("�й�...");
//				break;
//			}else {
//				System.out.print("���� ����!! ���� > \n");
//				++i;
//			}
//		}
//		System.out.println("Į�� ��� ����Ͽ����ϴ�.");
//	}
//}
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1.�����ϱ�\n 2.���ϱ� > ");
//		System.out.print("> ");
//		int select = sc.nextInt();
//		
//		Settings mySetting = null;
//		if(select == 1) {
//			System.out.print("�� ��?");
//			int a = sc.nextInt();
//			System.out.print("�� �� ��?");
//			int b = sc.nextInt();
//			System.out.print("�߻� ��ư�� �� ��?");
//			int c = sc.nextInt();
//			
//			mySetting = new Settings(a, b, c);
//		} else {
//			mySetting = new Settings();
//		}
//	}
//}
