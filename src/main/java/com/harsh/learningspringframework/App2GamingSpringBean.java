package com.harsh.learningspringframework;

import java.text.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harsh.learningspringframework.game.GameRunner;
import com.harsh.learningspringframework.game.GamingConsole;
import com.harsh.learningspringframework.game.MarioGame;
import com.harsh.learningspringframework.game.PacmanGame;
import com.harsh.learningspringframework.game.SuperContraGame;

@Configuration
class GamingConfiguration 
{
    @Bean
    public GamingConsole game()
    {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game)
    {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    
}

public class App2GamingSpringBean 
{
	public static void main(String[] args)
	{
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) 
		{
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		} 
	}
}