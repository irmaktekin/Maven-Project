package com.irmakTekin.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.irmakTekin.learnspringframework.game.GameRunner;
import com.irmakTekin.learnspringframework.game.GamingConsole;
import com.irmakTekin.learnspringframework.game.MarioGame;

@Configuration
public class GamingConfiguration {

@Bean
public GamingConsole game() {
	return new MarioGame();
}

@Bean 
public GameRunner runner(GamingConsole game) {
	return new GameRunner(game);
	
}

}
