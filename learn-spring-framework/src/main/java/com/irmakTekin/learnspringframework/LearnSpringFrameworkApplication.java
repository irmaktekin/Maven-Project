package com.irmakTekin.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.irmakTekin.learnspringframework.game.GameRunner;
import com.irmakTekin.learnspringframework.game.MarioGame;
import com.irmakTekin.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		
		//SuperContraGame game = new SuperContraGame();
		GameRunner runner= new GameRunner(game);
		runner.runGame();
				
	}

}
