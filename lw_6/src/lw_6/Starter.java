package lw_6;

public class Starter {

	public static void main(String[] args) {
		Management management = new Management();
		Drivers drivers = new Drivers();
		
		OrgTerminal.PrintVehicle(management);
		OrgTerminal.PrintVehicle(drivers);
		
		OrgTerminal.PrintBrief(management);
		OrgTerminal.PrintBrief(drivers);
	}
}
