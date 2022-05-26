import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Label class that allows you to display a textual value on screen.
 * 
 * The Label is an actor, so you will need to create it, and then add it to the world
 * in Greenfoot.  If you keep a reference to the Label then you can change the text it
 * displays.  
 *
 * @author Amjad Altadmri 
 * @version 1.1
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color fillColor = Color.WHITE;
    private Color lineColor = Color.WHITE;
        
    private static final Color transparent = new Color(0,0,0,0);
    
    public Label(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }
    public Label(int value, int fontSize)
    {
        this.value = Integer.toString(value);
        this.fontSize = fontSize;
        updateImage();
    }

    public void updateImage()
    {
        setImage(new GreenfootImage(value, fontSize, fillColor, transparent, lineColor));
    }
    
    public void setValue(String value)
    {
        this.value = value;
        updateImage();
    }
    
    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();
    }
    
    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
        updateImage();
    }
    
    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
        updateImage();
    }
}
