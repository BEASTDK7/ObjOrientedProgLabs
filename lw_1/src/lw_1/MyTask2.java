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
		System.out.print("¬ведите количество чисел >> ");
		N = sc.nextInt();
		
		double a;
		// заполн€ет список числами
		for(int i = 0; i < N; i++) {
			System.out.print("¬ведите число " + String.valueOf(i+1) + " >> ");
			a = sc.nextDouble();
			aa.add(a);
		}
		// упор€дочивает последовательность чисел по убыванию
		Collections.sort(aa, Collections.reverseOrder());
		
		sc.close();
	}
	
	public void PrintResult()
	{
		// подсчЄт суммы квадратов max-числа и premax-числа и вывод ответа
		System.out.println("—умма квадратов max-числа и premax-числа равна " 
				+ String.valueOf(Math.pow(aa.get(0), 2) + Math.pow(aa.get(1), 2)));
	}

}
