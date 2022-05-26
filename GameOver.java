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
        
        Label restart = new Label("Press <space> to restart", 50);
        restart.setFillColor(Color.BLACK);
        addObject(restart, 500, 500);
        
        MyWorld.score = 0;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld myworld = new MyWorld();
            Greenfoot.setWorld(myworld);
        }
    }

}
