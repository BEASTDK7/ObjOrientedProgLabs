package fractions;

import java.util.Scanner;

public class Fractions {
	
	public void InOutFractions() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====-----------------------------====\n"
				         + "=== УМНОЖЕНИЕ ОБЫКНОВЕННЫХ ДРОБЕЙ ===\n"
				         + "====-----------------------------====\n");
		
		System.out.println("ПЕРВАЯ ДРОБЬ");
		System.out.print("Введите числитель   >> ");
		int num1 = scan.nextInt();
		System.out.print("Введите знаменатель >> ");
		int denom1 = scan.nextInt();
		
		// Проверка первой дроби
		Check ch1 = new Check();
		ch1.MakeACheck(num1, denom1);
		
		System.out.println("\nВТОРАЯ ДРОБЬ");
		System.out.print("Введите числитель   >> ");
		int num2 = scan.nextInt();
		System.out.print("Введите знаменатель >> ");
		int denom2 = scan.nextInt();
		
		// Проверка второй дроби
		Check ch2 = new Check();
		ch2.MakeACheck(num2, denom2);
	 			
	    System.out.print("\nРЕЗУЛЬТАТ УМНОЖЕНИЯ: " + Fractions.Calculate(num1, denom1, num2, denom2));
	    
	    scan.close();
	}
	
	// Вычисление результата
	public static String Calculate(
			int numerator1, int denominator1, 
			int numerator2, int denominator2)	
	{
    	
		// Умножение числителей
		int numeratorsMultiply = numerator1 * numerator2; 
    	// Умножение знаменателей
		int denominatorsMultiply = denominator1 * denominator2;
    	
    	int reducedNum = numeratorsMultiply;
	    int reducedDenom = denominatorsMultiply;
	    
	    // НОД
	    int gcd = 0;

	    while (numeratorsMultiply != denominatorsMultiply){
	    	if(numeratorsMultiply > denominatorsMultiply) {
	    		numeratorsMultiply = numeratorsMultiply - denominatorsMultiply;
	    		gcd = numeratorsMultiply;
	    	}else
	        	denominatorsMultiply = denominatorsMultiply - numeratorsMultiply;
	    		gcd = denominatorsMultiply;
	    }      
	    
	    // Сокращение числителя и знаменателя
	    numeratorsMultiply = reducedNum / gcd;
	    denominatorsMultiply = reducedDenom / gcd;
    	
    	String numeratorsMultiplyStr = Integer.toString(numeratorsMultiply); 
    	String denominatorsMultiplyStr = Integer.toString(denominatorsMultiply); 
    	return numeratorsMultiplyStr + " / " + denominatorsMultiplyStr; 
    }
}


