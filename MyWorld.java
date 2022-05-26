import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game World
 * 
 * @author Joey Guan
 * @version May 2022
 */
public class MyWorld extends World
{
    private int time = 0;
    public static int score = 0;
    public int numBobs = 0;
    public Label scoreLabel = new Label(score, 80);
    public int spawnSpeed = 40;
    
    public void act()
    {
        time++;
        if(time == spawnSpeed)
        {
            spawnBob();    
        }
        time %= spawnSpeed;
        
        if(score >= 10 && score < 30)
        {
            spawnSpeed = 30;
        }
        if(score >= 30)
        {
            spawnSpeed = 20;
        }
    }
    
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        score = 0;
        scoreLabel.setValue(score);
        
        Leroy leroy = new Leroy();
        addObject(leroy,500,300);
        
        scoreLabel.setFillColor(Color.WHITE);
        addObject(scoreLabel,50,50);
    }
    
    public void spawnBob()
    {
        Bob bob = new Bob();
        addObject(bob, Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(600));
        numBobs++;
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
