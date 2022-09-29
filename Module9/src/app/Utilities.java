package app;


import java.lang.Thread;


class Utilities {

	
	static void beep() {
		java.awt.Toolkit.getDefaultToolkit().beep();
	}

	
	static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
