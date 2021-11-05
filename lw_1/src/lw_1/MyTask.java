package lw_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyTask {
	
	public static void DoTask()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите количество чисел >> ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		// заполн€ет список числами
		for(int i = 0; i < N; i++) {
			System.out.print("¬ведите число " + String.valueOf(i+1) + " >> ");
			a = sc.nextDouble();
			aa.add(a);
		}
		
		// упор€дочивает последовательность чисел по убыванию
		Collections.sort(aa, Collections.reverseOrder());
		
		// подсчЄт суммы квадратов max-числа и premax-числа и вывод ответа
		System.out.println("—умма квадратов max-числа и premax-числа равна " 
				+ String.valueOf(Math.pow(aa.get(0), 2) + Math.pow(aa.get(1), 2)));
		
		sc.close();
	}
}
