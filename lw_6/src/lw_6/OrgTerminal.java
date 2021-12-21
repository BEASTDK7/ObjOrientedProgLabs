package lw_6;

public class OrgTerminal {
	
	public static <T extends IVehicle> void PrintVehicle(T v) {
		
		System.out.println(v.getVehicle());
	}
	
	public static <T extends OrganizationVehicleUnit & IVehicle> void PrintBrief(T m) {
		
		System.out.println("\nСтатус: " + m.Occupation +
				"\nМаршрут: " + m.Route +
				"\nАвтомобиль " + m.getVehicle() + " и учтён");
	}

}
