package com.irmakTekin.learnspringframework;

import com.irmakTekin.learnspringframework.game.GameRunner;
import com.irmakTekin.learnspringframework.game.MarioGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		
		
		var game = new MarioGame();
		
		//var game = new SuperContraGame();
		var runner= new GameRunner(game);//wiring dependency
		//Game is a dependency for runner class
		runner.runGame();
				
	}	

}
