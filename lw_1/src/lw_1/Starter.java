package lw_1;

public class Starter {

	public static void main(String[] args) {
		// При использовании статического метода 
		//MyTask.DoTask();
		
		//При использовании методов уровня объекта
		MyTask2 ob = new MyTask2();
		ob.InputArray();
		ob.PrintResult();
	}
}
