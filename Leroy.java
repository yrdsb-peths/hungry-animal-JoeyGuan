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
            setRotation(270); 
            move(10);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(10);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(10);
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
            ((MyWorld)getWorld()).score = 0;
            ((MyWorld)getWorld()).scoreLabel.setValue(0);
        }
    }
}
