import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public GameOver()
    {   
        super(1000, 600, 1); 
        Label gameOver = new Label("GAME OVER", 100);
        addObject(gameOver, 500, 250);  
        Label highScore = new Label("Score: " + Integer.toString(MyWorld.score), 100);
        addObject(highScore, 500, 350);
    }
}
