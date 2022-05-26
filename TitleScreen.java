import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Joey Guan
 * @version May 2022
 */
public class TitleScreen extends World
{
    public TitleScreen()
    {    
        super(1000, 600, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld myworld = new MyWorld();
            Greenfoot.setWorld(myworld);
        }
    }
    
    private void prepare()
    {
        Label titleLabel = new Label("Amogsus", 100);
        addObject(titleLabel, 500, 50);
        Label label = new Label("Press <space> to Start", 50);
        addObject(label,500,500);

        Label label3 = new Label("Arrow keys to move", 50);
        addObject(label3,500,180);
        Label label4 = new Label("The bobs are invading", 50);
        addObject(label4,500,265);
        Label label5 = new Label("Run into them to catch them", 50);
        addObject(label5,500,340);
        Label label6 = new Label("You lose when there's more than 10", 50);
        addObject(label6,500,408);
    }
}
