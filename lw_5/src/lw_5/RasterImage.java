package lw_5;

public class RasterImage extends Image implements IDrawable {
	
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
	public String Note() {
		return "\nРастровое изображение: ";
	}
	
	public void Draw() {
		String output = "\n" 
	                  + "|||||||||||||||||||||||\n" 
	                  + "||||=Guns N' Roses=||||\n"
                      + "|||||||||||||||||||||||\n"
                      + "||||_November Rain_||||\n"
                      + "||||||||-1991-|||||||||\n"
                      + "|||||||||||||||||||||||\n";
				
		System.out.println(output);
	}
}