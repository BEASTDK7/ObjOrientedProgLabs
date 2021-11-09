package lw_4;

public class Starter {

	public static void main(String[] args) {
		
		Multimedia m1 = new Multimedia("=== Мультимедиа ===");
		Video v1 = new Video("MP4", "H.264", "1920x1080", "1:27:43");
		Image i1 = new Image("- Изображения -");
		RasterImage ri1 = new RasterImage("JPEG","3840x2160");
		VectorImage vi1 = new VectorImage("DXF");
		
		System.out.println(m1.toString());
		System.out.println(v1.toString());
		System.out.println(i1.toString());
		System.out.println(ri1.toString());
		System.out.println(vi1.toString());
	}
}