package geometry;

import java.text.DecimalFormat;
import java.lang.Math;


class Coordinate {

	static final double EPSILON = 1e-9;
	static final String DECIMALFORMAT = "0.000";
	static final int FORMAT_SIZE = DECIMALFORMAT.length()+1;
	static final DecimalFormat df = new DecimalFormat(DECIMALFORMAT);
	
	private double value;
	
	
	Coordinate(double value) {
		if(Math.abs(value) < EPSILON ) {
			value = 0.0;			
		}
		this.value = value;
	}

	
	double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.format(
				"%" + FORMAT_SIZE + "s", 
				df.format(value)
				); 
	}
		
}
