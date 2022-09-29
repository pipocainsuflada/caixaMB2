package geometry;

import geometry.Coordinate;

public class Vector {

	private Coordinate x;
	private Coordinate y;
	private Coordinate z;
	
	public Vector(double x, double y, double z) {
		this.x = new Coordinate(x);
		this.y = new Coordinate(y);
		this.z = new Coordinate(z);
	}

	public Vector(double x, double y) {
		this(x, y, 0.0); //In general a two-dimensional vector
	}
	
	
	public double getValueX() {
		return x.getValue();
	}

	public double getValueY() {
		return y.getValue();
	}

	public double getValueZ() {
		return z.getValue();
	}

	
	public Vector scalarMultiplication(double scalar) {
		
		return new Vector(
				scalar * x.getValue(), 
				scalar * y.getValue(), 
				scalar * z.getValue()
				);
	}

	
	public Vector sum(Vector w) { 
		
		return new Vector(
				x.getValue() + w.getValueX(), 
				y.getValue() + w.getValueY(), 
				z.getValue() + w.getValueZ()
				);
	}
	
	
	public double scalarProduct(Vector w) {
		
		return 	x.getValue() * w.getValueX() + 
				y.getValue() * w.getValueY() + 
				z.getValue() * w.getValueZ();
	}

	
	@Override
	public String toString() {
		return "<" + x + ", " + y + ", " + z + " >";
	}
		
}
