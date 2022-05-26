import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player Character
 * 
 * @author Joey Guan
 * @version May 2022
 */
public class Leroy extends Actor
{
    private GreenfootImage[] rightImages = new GreenfootImage[7];
    private GreenfootImage[] leftImages = new GreenfootImage[7];
    private SimpleTimer aTimer = new SimpleTimer();
    private boolean isFacingRight = true;
    private boolean isMoving = false;
    
    private GreenfootSound bgMusic = new GreenfootSound("amongdrop.mp3");
    
    public Leroy()
    {
        for(int i = 0; i<rightImages.length; i++)
        {
            rightImages[i] = new GreenfootImage(i + ".png");
            leftImages[i] = new GreenfootImage(i + ".png");
            leftImages[i].mirrorHorizontally();
        }
        setImage(rightImages[0]);
        aTimer.mark();
    }

    int currentIndex = 1;
    public void animate()
    {
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left"))
        {
            isMoving = true;
        }
        else 
        {
            isMoving = false;
        }
        
        if(aTimer.millisElapsed()>70 && isMoving)
        {
            if(isFacingRight)
            {
                setImage(rightImages[currentIndex]);
            }
            else
            {
                setImage(leftImages[currentIndex]);
            }
            
            currentIndex++;
            if(currentIndex == 7)
            {
                currentIndex = 1;
            }
            aTimer.mark();
        }
        
        if(isFacingRight && !isMoving)
        {
            setImage(rightImages[0]);
        }
        else if (!isMoving)
        {
            setImage(leftImages[0]);
        }
    }

    public void act()
    {
        bgMusic.playLoop();
        
        if(Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-10);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            isFacingRight = true;
            setLocation(getX()+10, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            isFacingRight = false;
            setLocation(getX()-10, getY());
        }
        
        animate();
        
        if(isTouching(Bob.class))
        {
            Greenfoot.playSound("vineboom.mp3");
            removeTouching(Bob.class);
            ((MyWorld)getWorld()).increaseScore();
            ((MyWorld)getWorld()).numBobs--;
        }

        if(((MyWorld)getWorld()).numBobs==10)
        {
            GameOver gameOver = new GameOver();
            Greenfoot.setWorld(gameOver);
        }
    }
}
