package lw_5;

import java.util.Vector;

public class Starter {

	public static void main(String[] args) {
			
		Video v1 = new Video("MP4", "H.264", "1920x1080", "1:27:43");
		RasterImage ri1 = new RasterImage("JPEG","3840x2160");
		VectorImage vi1 = new VectorImage("DXF");
			
		Vector<IDrawable> allMultimedia = new Vector<IDrawable>();
		
		allMultimedia.add(v1);
		allMultimedia.add(ri1);
		allMultimedia.add(vi1);
		
		for (IDrawable m : allMultimedia) { 
			System.out.println(m.Note());
			m.Draw();
		}
	}
}
