package com.harsh.learningspringframework.game;

public class GameRunner 
{
    //here the GameRunner class is tightly coupled to any particular gaming class
//    private MarioGame game;
    
//    public GameRunner(MarioGame game) 
//    {
//        this.game = game;
//    }

    //we are making use of interface here 
    private GamingConsole game;

    public GameRunner(GamingConsole game)
    {
        this.game = game;
    }


    public void run() 
    {
        System.out.println("Running Game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}