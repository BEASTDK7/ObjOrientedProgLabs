package lw_6;

public class Drivers extends OrganizationVehicleUnit implements IVehicle {
	
	public Drivers() {
		Occupation = "Водитель";
		Route = "По требованию";
		Vehicle = "MB V-Class";
	}
	
	@Override
	public String getVehicle() {
		return Vehicle + " предоставлен";
	}

}
