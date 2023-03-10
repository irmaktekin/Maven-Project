package com.irmakTekin.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//You need to manage this component
@Component
public class MarioGame implements GamingConsole {
	
	//when the up button is pressed
	@Override
	public void up() {
		System.out.println("jump");
	}
	@Override
	public void down() {
		System.out.println("go into a hole");
	}
	@Override
	public void right() {
		System.out.println("go faster");
	}
	@Override
	public void left() {
		System.out.println("stop");
	}

}
