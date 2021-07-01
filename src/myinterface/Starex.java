package myinterface;

public class Starex implements Vehicle {

	int speed;
	int max_seat = 10;
	int passengers = 0;
	
	
	@Override
	public int acceleration() {
		return speed += 20;
	}

	@Override
	public int deceleration() {
		return speed -= 50;
	}

	@Override
	public boolean ride() {
		if (passengers == max_seat) { //+ �ִ��ο��� ��� false
			return false;
		}else {
			passengers++; //+ ž�� �ο� 1�� ����
			return true;
		}
	}	
}
