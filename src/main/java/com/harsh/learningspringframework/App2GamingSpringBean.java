package com.harsh.learningspringframework;

import java.text.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.learningspringframework.game.GameRunner;
import com.harsh.learningspringframework.game.GamingConsole;
import com.harsh.learningspringframework.game.MarioGame;
import com.harsh.learningspringframework.game.PacmanGame;
import com.harsh.learningspringframework.game.SuperContraGame;

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