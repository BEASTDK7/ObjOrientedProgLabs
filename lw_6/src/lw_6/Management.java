package lw_6;

public class Management extends OrganizationVehicleUnit implements IVehicle {
	
	public Management() {
		Occupation = "Менеджмент";
		Route = "Офис-Склад";
		Vehicle = "VW Multivan";
	}
	
	@Override
	public String getVehicle() {
		return Vehicle + " предоставлен";
	}

}
