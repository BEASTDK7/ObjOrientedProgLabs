package lw_4;

public class VectorImage extends Image {
	
	private String format;
	
	public VectorImage(String theFormat) {
		super("+ Векторное изображение");
		format = theFormat;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nФормат: " + format + "\n";
	}
}