package lw_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyTask {
	
	public static void DoTask()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� >> ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		// ��������� ������ �������
		for(int i = 0; i < N; i++) {
			System.out.print("������� ����� " + String.valueOf(i+1) + " >> ");
			a = sc.nextDouble();
			aa.add(a);
		}
		
		// ������������� ������������������ ����� �� ��������
		Collections.sort(aa, Collections.reverseOrder());
		
		// ������� ����� ��������� max-����� � premax-����� � ����� ������
		System.out.println("����� ��������� max-����� � premax-����� ����� " 
				+ String.valueOf(Math.pow(aa.get(0), 2) + Math.pow(aa.get(1), 2)));
		
		sc.close();
	}
}
