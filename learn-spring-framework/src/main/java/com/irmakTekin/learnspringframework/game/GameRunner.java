package com.irmakTekin.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	//Changing this to
	//private MarioGame game;
	//this
	//It is tightly coupled with the SuperContraGame object
	
	
	
	//@Autowired
	private GamingConsole gamingConsole;
	
	
	//injection via setter
	
	/*@Autowired
	public void setGamingConsole(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
		System.out.println("Setter injection");
	}*/


	//injection via constructor
	/*public GameRunner(GamingConsole game) {
		this.gamingConsole=game;
	}*/
	public void runGame() {
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
		
		
	}
	

}
