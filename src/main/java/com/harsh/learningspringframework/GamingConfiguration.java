package com.harsh.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harsh.learningspringframework.game.GameRunner;
import com.harsh.learningspringframework.game.GamingConsole;
import com.harsh.learningspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration 
{
    @Bean
    public GamingConsole game()
    {
        var game = new PacmanGame();
        return game;
    }

//    @Bean 
//    public GameRunner gameRunner()
//    {
//        var gameRunner = new GameRunner(game());
//        return gameRunner;
//   }

    @Bean
    public GameRunner gameRunner(GamingConsole game)
    {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    
}