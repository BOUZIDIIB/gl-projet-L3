package test;

import gui.MainGuiTest;

public class Test {
	
	public static void main(String[] args) {
		MainGuiTest gameTest = new MainGuiTest("test ");
		Thread gameThread = new Thread(gameTest);
		gameThread.start();
	}

}
