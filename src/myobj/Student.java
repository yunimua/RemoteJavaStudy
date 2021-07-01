package myobj;

import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student>{
	public int snum; //�й�
	public int kor;
	public int eng;
	public int math;
	public double avg;
	
	public static double best_avg = 0;
	public static int best_avg_snum = 0;
	
	final private int MAX_SCORE = 100;
	final private int NUM_OF_SUVJECT = 3; // ���� 3��
	
	private static int curr_snum = 1000;
	private static Random ran = new Random();
	
	public Student() {
		snum = curr_snum++;  //1000������ �й� ����
		kor = ran.nextInt(MAX_SCORE + 1);
		eng = ran.nextInt(MAX_SCORE + 1);
		math = ran.nextInt(MAX_SCORE + 1);
		avg = (kor+ eng +math) / (double) NUM_OF_SUVJECT;
		
		if ( avg > best_avg ) {
			best_avg = avg;
			best_avg_snum = snum;
		}
	}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		avg = (kor+ eng +math) / 3.0;
	}
	
	
	@Override
	public String toString() {
		return String.format("[%d]�� �л��� ��� ������ %.2f�Դϴ�.\n", snum, avg);
	}


	@Override
	public int compareTo(Student o) {
		//return (int) Math.ceil(this.avg - o.avg); //+ 0.1�̶� ���̰� ���� �÷���!
			
		return Double.compare(this.avg, o.avg) != 0 ? 
				Double.compare(this.avg, o.avg) : Integer.compare(snum, o.snum); //+ 0�� �ƴ϶�� �״�� ����
	}
}
