package com.irmakTekin.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.irmakTekin.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		
		
		//MarioGame game = new MarioGame();
		
		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner= new GameRunner(game);
		runner.runGame();
				
	}

}
