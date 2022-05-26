import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy Character
 * 
 * @author Joey Guan
 * @version May 2022
 */
public class Bob extends Actor
{
    public void act()
    {
        move(10);
        if(System.currentTimeMillis()%10 == 0)
        {
            if(Greenfoot.getRandomNumber(100)>=50)
            {
                turn(Greenfoot.getRandomNumber(90));
            }
            else
            {
                turn(Greenfoot.getRandomNumber(90)*-1);
            }
        }
        if(isAtEdge())
        {
            turn(180);
        }
    }
        
    public Bob()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
