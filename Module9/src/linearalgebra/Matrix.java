package linearalgebra;

import geometry.Vector;
import math.Trigonometry;

class Matrix {
	
	private Vector row1;
	private Vector row2;
	private Vector row3;
	
	Matrix(Vector row1, Vector row2, Vector row3) {
		this.row1 = row1;
		this.row2 = row2;
		this.row3 = row3;
	}

	Matrix(Vector row1, Vector row2) {
		this(row1, row2, new Vector(0, 0));	
	}

	
	Vector multiply(Vector v) {
		return new Vector(
				row1.scalarProduct(v),
				row2.scalarProduct(v),
				row3.scalarProduct(v)				
				);
	}
	
	static Matrix rotationOverAxisX(int degrees) {
		
		double angle = Trigonometry.degreesToRadians(degrees);
		double cos = Trigonometry.cosine(angle);
		double sin = Trigonometry.sine(angle);

		return new Matrix(
				new Vector(1,	0,		0),
				new Vector(0,	cos,	-sin),
				new Vector(0,	sin,	cos)
				);		
	}

	static Matrix rotationOverAxisY(int degrees) {
		
		double angle = Trigonometry.degreesToRadians(degrees);
		double cos = Trigonometry.cosine(angle);
		double sin = Trigonometry.sine(angle);

		return new Matrix(
				new Vector(cos,	0,	sin),
				new Vector(0,	1,	0),
				new Vector(-sin,	0,	cos)
				);	
	}

	static Matrix rotationOverAxisZ(int degrees) {
		
		double angle = Trigonometry.degreesToRadians(degrees);
		double cos = Trigonometry.cosine(angle);
		double sin = Trigonometry.sine(angle);

		return new Matrix(
				new Vector(cos,	-sin,	0),
				new Vector(sin,	cos,	0),
				new Vector(0,	0,		1)
				);		
	}

}