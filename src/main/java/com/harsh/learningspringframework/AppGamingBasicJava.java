package com.harsh.learningspringframework;

import com.harsh.learningspringframework.game.GameRunner;
import com.harsh.learningspringframework.game.MarioGame;
import com.harsh.learningspringframework.game.PacmanGame;
import com.harsh.learningspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
