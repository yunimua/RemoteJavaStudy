
	/*
		1. �� ���� ������ 30���̴�
		
		2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
		
		2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
		
		2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
		
		3. ��� �л��� ���� ������ �̸��� �������� �����Ѵ�
		   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�.(�Ǵ� �ߺ����� ������ ����)
		
		4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.
	
	*/
package quiz;

import myobj.school.ProgrammingStudent;
import myobj.school.Student;
import myobj.school.MachinelearningStudent;
import myobj.school.NetworkStudent;

public class C07_School {
	
	public static void main(String[] args) {
		
		Student[] school = new Student[30];
		
		for(int i = 0; i < school.length; ++i) {
			school[i] = new ProgrammingStudent(); //+ �迭�ȿ� 30���� �л��� ��
			school[i].printGradeCard();
		}
		
		for(int i = 0; i < school.length; ++i) {
			school[i] = new NetworkStudent();
			school[i].printGradeCard();
		}
		
		for(int i = 0; i < school.length; ++i) {
			school[i] = new MachinelearningStudent();
			school[i].printGradeCard();
		}

	}
	
	
}
//	String[] first_Name = {"��", "��", "��", "��", "��", "��", "��", "��", "��"};
//	String[] last_Name = {"�ϳ�","�γ�","����","����","����","����","����","����","����","���"};	
//	String[] class_name = {"programming", "network", "Machinelearning"};	
//	String[] class_programming = new String[30];
//	String[] class_network = new String[30];
//	String[] class_Machinelearning = new String[30];
//	
//	//���ϴ� ����
//	int[] kor = new int[30];
//	int[] mat = new int[30];
//	int[] eng = new int[30];
//	int[] programming = new int[30];
//	int[] algorithm = new int[30];
//	int[] data_structure = new int[30];
//	int[] linux = new int[30];
//	int[] network = new int[30];
//	int[] ccna = new int[30];
//	int[] statistics = new int[30];
//	
//	void name_Produce() {
//		System.out.print("<���� ����>" + "\t");
//		for(int i = 0; i < 30; ++i) {
//			int first = (int)(Math.random() * 9);
//			int last = (int)(Math.random() * 9);
//			class_programming[i] = first_Name[first] + last_Name[last];
//			System.out.printf("[%02d]%s\t", i+1, class_programming[i]);
//		}
//		System.out.println();
//	}
//	
//	void kor_record() {
//		System.out.print("���� "+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			kor[i] = (int)(Math.random() * 101);
//			System.out.print(kor[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void eng_record() {
//		System.out.print("����"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			eng[i] = (int)(Math.random() * 101);
//			System.out.print(eng[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void mat_record() {
//		System.out.print("����"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			mat[i] = (int)(Math.random() * 101);
//			System.out.print(mat[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void algo_record() {
//		System.out.print("�˰���"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			algorithm[i] = (int)(Math.random() * 101);
//			System.out.print(algorithm[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void program_record() {
//		System.out.print("���α׷���"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			programming[i] = (int)(Math.random() * 101);
//			System.out.print(programming[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void date_record() {
//		System.out.print("�ڷᱸ��"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			data_structure[i] = (int)(Math.random() * 101);
//			System.out.print(data_structure[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void record_total() {
//		for(int i = 0; i < 30; ++i) {
//			int total = kor[i] + eng[i] + mat[i] + algorithm[i] + programming[i]+ data_structure[i];
//			int average = total / 6; 
//			System.out.printf("[%s]�� ������[%d], ���������[%d]�Դϴ�.\n", 
//					class_programming[i], total, average);
//		}
//		System.out.println();
//	}
//}
//
//class network extends C07_School {
//	
//	void name_Produce() {
//		System.out.print("<���� ����>" + "\t");
//		for(int i = 0; i < 30; ++i) {
//			int first = (int)(Math.random() * 9);
//			int last = (int)(Math.random() * 9);
//			class_network[i] = first_Name[first] + last_Name[last];
//			System.out.printf("[%02d]%s\t", i+31, class_network[i]);
//		}
//		System.out.println();
//	}
//	
//	void linux_record() {
//		System.out.print("������"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			linux[i] = (int)(Math.random() * 101);
//			System.out.print(linux[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	
//	void network_record() {
//		System.out.print("��Ʈ��ũ"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			network[i] = (int)(Math.random() * 101);
//			System.out.print(network[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	
//	void ccna_record() {
//		System.out.print("CCNA"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			ccna[i] = (int)(Math.random() * 101);
//			System.out.print(ccna[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	void record_total() {
//		for(int i = 0; i < 30; ++i) {
//			int total = kor[i] + eng[i] + linux[i] + network[i]+ ccna[i];
//			int average = total / 5; 
//			System.out.printf("[%s]�� ������[%d], ���������[%d]�Դϴ�.\n", 
//					class_network[i], total, average);
//		}
//		System.out.println();
//	}
//}
//
//class machinelearning extends C07_School {
//	
//	machinelearning() {
//		
//	}
//	
//	void name_Produce() {
//		System.out.print("<���� ����>" + "\t");
//		for(int i = 0; i < 30; ++i) {
//			int first = (int)(Math.random() * 9);
//			int last = (int)(Math.random() * 9);
//			class_Machinelearning[i] = first_Name[first] + last_Name[last];
//			System.out.printf("[%02d]%s\t", i+61, class_Machinelearning[i]);
//		}
//		System.out.println();
//	}
//	
//	void statistics_record() {
//		System.out.print("�����"+"\t"+"\t");
//		for(int i = 0; i < 30; ++i) {
//			statistics[i] = (int)(Math.random() * 101);
//			System.out.print(statistics[i] + "\t" + "\t"); 
//		}
//		System.out.println();
//	}
//	
//	void record_total() {
//		for(int i = 0; i < 30; ++i) {
//			int total = kor[i] + eng[i] + mat[i]+ statistics[i] + programming[i];
//			int average = total / 5; 
//			System.out.printf("[%s]�� ������[%d], ���������[%d]�Դϴ�.\n", 
//					class_Machinelearning[i], total, average);
//		}
//		System.out.println();
//	}
//}