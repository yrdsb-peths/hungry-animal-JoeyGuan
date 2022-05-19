import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob extends Actor
{
    public void act()
    {
        move(5);
        if(System.currentTimeMillis()%10 == 0)
        {
            if(Greenfoot.getRandomNumber(100)>=50)
            {
                turn(Greenfoot.getRandomNumber(90));
            }
        }
        
    }
        
    public Bob()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
}
