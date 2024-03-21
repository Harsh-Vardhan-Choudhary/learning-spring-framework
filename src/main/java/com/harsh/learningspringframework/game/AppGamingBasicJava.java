package com.harsh.learningspringframework.game;

public class AppGamingBasicJava 
{
	public static void main(String[] args)
	{
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();				//object creation
		var gameRunner = new GameRunner(game);		//object creation + wiring of Dependencies
		//Game is a Dependency of GameRunner
		gameRunner.run();
	}
}