package myobj;

public class School {

	String[] first_Name = {"��", "��", "��", "��", "��", "��", "��", "��", "��"};
	String[] last_Name = {"�ϳ�","�γ�","����","����","����","����","����","����","����","���"};	
	String[] class_name = {"programming", "network", "Machinelearning"};	
	String[] class_programming = new String[30];
	String[] class_network = new String[30];
	String[] class_Machinelearning = new String[30];
	
	int personnel = 30;
	int subject_1 = 6;
	int subject_2 = 5;
	
	int[] exam = new int[30];
	
	School( ) {
		
	}
	
	void Print_title() {
		System.out.println("[�й�]�̸�\t\t����\t����\t����\t���α׷���\t�˰���\t�ڷ���\t����\t���\t");
	}
	
	void programming_class() {
		for(int i = 0; i < personnel; ++i) {
			int first = (int)(Math.random() * 9);
			int last = (int)(Math.random() * 9);
			class_programming[i] = first_Name[first] + last_Name[last];
			System.out.printf("[%02d]%s\t", i+1, class_programming[i]);
			int sum = 0;
			for (int j = 0; j < subject_1; ++j) {
				exam[j] = (int)(Math.random() * 101);
				System.out.print(exam[j] + "\t");
				sum += exam[j];
				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/6 + "\t");
			System.out.println();
		}
	}
}

class Network extends School {
	
	void Print_title() {
		System.out.println("[�й�]�̸�\t\t����\t����\t������\t��Ʈ��ũ\tCCNA\t����\t���\t");
	}
	
	void Network_class() {
		for(int i = 0; i < personnel; ++i) {
			int first = (int)(Math.random() * 9);
			int last = (int)(Math.random() * 9);
			class_network[i] = first_Name[first] + last_Name[last];
			System.out.printf("[%02d]%s\t", i+31, class_network[i]);
			int sum = 0;
			for (int j = 0; j < subject_2; ++j) {
				exam[j] = (int)(Math.random() * 101);
				System.out.print(exam[j] + "\t");
				sum += exam[j];
				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/5 + "\t");
			System.out.println();
		}
	}
}

class Machinelearning extends School {
	
	void Print_title() {
		System.out.println("[�й�]�̸�\t\t����\t����\t����\t�����\t���α׷���\t����\t���\t");
	}
	
	void Machinelearning_class() {
		for(int i = 0; i < personnel; ++i) {
			int first = (int)(Math.random() * 9);
			int last = (int)(Math.random() * 9);
			class_Machinelearning[i] = first_Name[first] + last_Name[last];
			System.out.printf("[%02d]%s\t", i+61, class_Machinelearning[i]);
			int sum = 0;
			for (int j = 0; j < subject_2; ++j) {
				exam[j] = (int)(Math.random() * 101);
				System.out.print(exam[j] + "\t");
				sum += exam[j];
				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/5 + "\t");
			System.out.println();
		}
	}
}











