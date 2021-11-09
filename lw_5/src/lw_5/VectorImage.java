package lw_5;

public class VectorImage extends Image implements IDrawable {
	
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
	
	public String Note() {
		return "\nВекторное изображение: ";
	}
	
	public void Draw() {
		String output = "\n" 
	                  + "|||||||||||||||||||||||\n" 
	                  + "|||||=Limp Bizkit=|||||\n"
                      + "|||||||||||||||||||||||\n"
                      + "||_Significant Other_||\n"
                      + "||||||||-1999-|||||||||\n"
                      + "|||||||||||||||||||||||\n";
				
		System.out.println(output);
	}
}