package com.irmakTekin.learnspringframework.game;

public class GameRunner {
	private MarioGame game;


	public GameRunner(MarioGame game) {
		this.game=game;
	}
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
		
		
	}
	

}
