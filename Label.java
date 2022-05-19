import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color fillColor = Color.BLACK;
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
