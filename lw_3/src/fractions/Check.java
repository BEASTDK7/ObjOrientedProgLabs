package fractions;

public class Check {
	public void MakeACheck(int num, int denom) {
		if (denom == 0) {
            System.out.println("\nЗнаменатель не может равняться нулю!");
            return;
		}
		if (num == 0) {
            System.out.println("\nВыражение равно нулю!");
            return;
		}
	}
}
