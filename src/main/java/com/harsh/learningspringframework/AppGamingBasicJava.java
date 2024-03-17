package com.harsh.learningspringframework;

import com.harsh.learningspringframework.game.GameRunner;
import com.harsh.learningspringframework.game.MarioGame;
import com.harsh.learningspringframework.game.PacmanGame;
import com.harsh.learningspringframework.game.SuperContraGame;

public class AppGamingBasicJava 
{
	public static void main(String[] args)
	{
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}