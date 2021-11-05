package lw_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyTask2 {
	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	
	public void InputArray() 
	{
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� >> ");
		N = sc.nextInt();
		
		double a;
		// ��������� ������ �������
		for(int i = 0; i < N; i++) {
			System.out.print("������� ����� " + String.valueOf(i+1) + " >> ");
			a = sc.nextDouble();
			aa.add(a);
		}
		// ������������� ������������������ ����� �� ��������
		Collections.sort(aa, Collections.reverseOrder());
		
		sc.close();
	}
	
	public void PrintResult()
	{
		// ������� ����� ��������� max-����� � premax-����� � ����� ������
		System.out.println("����� ��������� max-����� � premax-����� ����� " 
				+ String.valueOf(Math.pow(aa.get(0), 2) + Math.pow(aa.get(1), 2)));
	}

}
