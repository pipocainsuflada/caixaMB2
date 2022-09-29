package app;

import geometry.Vector;


public class Clock {
	
	private Vector vector;
	private int degrees;
	private int sleep = 1000;


	public Clock(Vector vector, int degrees) {
		this.vector = vector;
		this.degrees = degrees;
	}

	
	public void setVector(Vector vector) {
		this.vector = vector;
	}


	public void setDegrees(int degrees) {
		this.degrees = degrees;
	}
	

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	
	private void tick() {
		
		vector = linearalgebra.Operations.rotateOverAxisZ(vector, -degrees);

		app.Utilities.beep();

		System.out.println(vector);
		
		app.Utilities.sleep(sleep);

	}
	

	public void tick(int ticks) {

		for(int i=0; i<ticks+1; i++) {
			
			tick();
		}
	}
		

	public void infinite() {
		
		while(true) {
			
			tick();
						
		}
	}
	

	@Override
	public String toString() {
		return "Clock [vector=" + vector + "]";
	}
	
}