import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob extends Actor
{
    /**
     * Act - do whatever the Bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if(System.currentTimeMillis()%50 == 0)
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
    
    public void runAway()
    {
        MyWorld world = (MyWorld) getWorld();
        Leroy leroy = world.getObjects(Leroy.class).get(0);
        int leroyX = leroy.getX();
        int leroyY = leroy.getY();
    }
}
