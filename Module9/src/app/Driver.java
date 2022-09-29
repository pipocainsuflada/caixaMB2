package app;


import geometry.Vector;
import app.Clock;


public class Driver {
	
	public static void main(String[] args) {

		vectorDemo();
		
//		driveClock();
	}
	
	
	private static void vectorDemo() {

		Vector u = new Vector(3, 4, 1);
		
		System.out.println(u);
		
		System.out.println(u.scalarMultiplication(2));
		
		
		Vector v = new Vector(0, 1, 0);
		
		System.out.println(u.scalarProduct(v));
		
		
		Vector w = new Vector(-1, -2, 1);
		
		System.out.println(u.sum(w));	
		
	}

	
	private static void driveClock() {

		Vector a = new Vector(0, 1);
		
		Clock clock = new Clock(a, 90);
		
		System.out.println(clock);
		
		clock.tick(4);

		System.out.println(clock);
		
		clock.infinite();
		
	}
				
	
}