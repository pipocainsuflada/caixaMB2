package math;

import java.lang.Math;


public class Trigonometry {

	
	public static double degreesToRadians(int degrees) {
		return degrees * Math.PI/180;
	}

	
	public static long radiansToDegrees(double radians) {
		return Math.round(radians * 180 / Math.PI);
	}
	
	
	public static double cosine(double angle) {
		return Math.cos(angle);
	} 
	

	public static double sine(double angle) {
		return Math.sin(angle);
	} 


}