package lw_4;

public class Video extends Multimedia {
	
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
}