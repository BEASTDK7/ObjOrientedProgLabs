package lw_4;

public class RasterImage extends Image {
	
	private String format;
	private String resolution;
	
	public RasterImage(String theFormat, String theResolution) {
		super("+ Растровое изображение");
		format = theFormat;
		resolution = theResolution;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nФормат: " + format
				+ "\nРазрешение: " + resolution + "\n";
	}
}