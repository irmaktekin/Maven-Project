/*
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
		
		
		//var game = new MarioGame();
		
		//var game = new SuperContraGame();
		//var runner= new GameRunner(game);//wiring dependency
		//Game is a dependency for runner class
		runner.runGame();
				
	}

}
*/