package linearalgebra;

import geometry.Vector;


public class Operations {

	static final Matrix rot2D90C = Matrix.rotationOverAxisZ(-90);
	
	
	public static Vector rotateClockwise90DegreesOverAxisZ(Vector v) {
		return rot2D90C.multiply(v);
	}
	
	
	public static Vector rotateOverAxisX(Vector v, int degrees) {
		return Matrix.rotationOverAxisX(degrees).multiply(v);
	}

	
	public static Vector rotateOverAxisY(Vector v, int degrees) {
		return Matrix.rotationOverAxisY(degrees).multiply(v);
	}


	public static Vector rotateOverAxisZ(Vector v, int degrees) {
		return Matrix.rotationOverAxisZ(degrees).multiply(v);
	}		
}