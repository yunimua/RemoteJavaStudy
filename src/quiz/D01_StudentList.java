package quiz;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import myobj.Student;
import myobj.sexual.SexualData;

public class D01_StudentList {

	/*
		�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����.
		
		1. �� �л��� ������ �������� ����
		
		2. ������ ��/��/��
		
		3. 30���� ��� ������ ���
		
		4. 30�� �� ���� ��� ������ ���� �л��� ������ ���
	*/
	
	public static void main(String[] args) {

		ArrayList<Student> student_list = new ArrayList<>();
		
		for (int i = 0; i < 30; ++i) {
			student_list.add(new Student());
		}
		
		for (Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("���� ���� ���� : " + Student.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : " + Student.best_avg_snum);
		
		// ���� Ǭ��..
//		double Aver = 0;
//		int studentID = 0;
//		ArrayList<SexualData> students = new ArrayList<>();
//		
//		for (int i = 0; i < 30; ++i) {
//			students.add(new SexualData());
//			System.out.printf("�й�<%02d> : �������[%.2f]\n", i+1, students.get(i).average());
//			if(students.get(i).average() > Aver) {
//				Aver = students.get(i).average();
//				studentID = i;
//			}
//		}
//		System.out.println("-----------------------------------");
//		System.out.printf("����� ���� Top : �й�<%02d> [%.02f]��", studentID +1, Aver);
		
	}	
}
