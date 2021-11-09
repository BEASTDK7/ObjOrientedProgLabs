package lw_4;

public class Multimedia {
	
	protected String name;
	
	public Multimedia() {}
	
	public Multimedia(String theName) {
		name = theName;
	}
	
	@Override
	public String toString() {
		return name + "\n";
	}
}