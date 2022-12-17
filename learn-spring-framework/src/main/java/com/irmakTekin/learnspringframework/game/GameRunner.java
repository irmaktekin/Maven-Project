package com.irmakTekin.learnspringframework.game;

public class GameRunner {
	//Changing this to
	//private MarioGame game;
	//this
	//It is tightly coupled with the SuperContraGame object
	private GamingConsole gamingConsole;


	public GameRunner(GamingConsole game) {
		this.gamingConsole=game;
	}
	public void runGame() {
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
		
		
	}
	

}
