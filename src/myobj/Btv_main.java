package myobj;

public class Btv_main {
	
	public static void main(String[] args) {
		Btv tv = new Btv();
		
		tv.power();
		tv.powerChk();
		System.out.println("-------");
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("���� ä���� " + tv.channel + "�Դϴ�.");
		tv.fv1();
		System.out.println("���ã�⿡ " + tv.chan[0].name + "�� �߰��Ͽ����ϴ�.");
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		System.out.println("���� ä���� " + tv.channel + "�Դϴ�.");
	}
}
