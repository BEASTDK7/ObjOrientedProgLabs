package lw_5;

public class Video extends Multimedia implements IDrawable {
	
	protected String format;
	protected String codec;
	protected String resolution;
	protected String duration;
	
	public Video(String theFormat, String theCodec, String theResolution, String theDuration) { 
		super("- Видео -");
		format = theFormat;
		codec = theCodec;
		resolution = theResolution;
		duration = theDuration;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nФормат: " + format 
				+ "\nКодек: " + codec
				+ "\nРазрешение: " + resolution
				+ "\nПродолжительность: " + duration + "\n";
	}
	
	public String Note() {
		return "\nВидео: ";
	}
	
	public void Draw() {
		String output = "\n" 
	                  + "|||||||||||||||||||||||\n" 
	                  + "||||||||=QUEEN=||||||||\n"
                      + "|||||||||||||||||||||||\n"
                      + "|||||||_Live at_|||||||\n"
                      + "|||||_the Rainbow_|||||\n"
                      + "||||||||-1974-|||||||||\n"
                      + "|||||||||||||||||||||||\n";
				
		System.out.println(output);
	}
}