package com.harsh.learningspringframework;

import java.text.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.harsh.learningspringframework.game.GameRunner;
import com.harsh.learningspringframework.game.GamingConsole;
import com.harsh.learningspringframework.game.MarioGame;
import com.harsh.learningspringframework.game.PacmanGame;
import com.harsh.learningspringframework.game.SuperContraGame;

@Configuration
@ComponentScan("com.harsh.learningspringframework.game")
public class App2GamingSpringBean 
{
	public static void main(String[] args)
	{
		try (var context = new AnnotationConfigApplicationContext(App2GamingSpringBean.class)) 
		{
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		} 
	}
}