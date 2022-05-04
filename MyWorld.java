import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public void act()
    {

        Bob bob = new Bob();
        addObject(bob, randomX(), randomY());

    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Leroy leroy = new Leroy();
        addObject(leroy,284,207);
    }
    
    public int randomX()
    {
        return Greenfoot.getRandomNumber(600);
    }
    
    public int randomY()
    {
        return Greenfoot.getRandomNumber(400);
    }
}
