package lw_4;

public class Image extends Multimedia {
	
	protected String format;
	
	public Image(String theName) {
		super(theName);
	}
	
	public Image(String theName, String theFormat) { 
		super(theName);
		format = theFormat;
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}