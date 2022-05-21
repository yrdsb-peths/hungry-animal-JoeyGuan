import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leroy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leroy extends Actor
{
    public void act()
    {
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
            setLocation(getX()+10, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-10, getY());
        }

        if(isTouching(Bob.class))
        {
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
