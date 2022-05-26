import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Over Screen
 * 
 * @author Joey Guan
 * @version May 2022
 */
public class GameOver extends World
{
    public GameOver()
    {   
        super(1000, 600, 1); 
        Label gameOver = new Label("GAME OVER", 100);
        gameOver.setFillColor(Color.BLACK);
        addObject(gameOver, 500, 250);  
        Label highScore = new Label("Score: " + Integer.toString(MyWorld.score), 100);
        highScore.setFillColor(Color.BLACK);
        addObject(highScore, 500, 350);
    }

}
