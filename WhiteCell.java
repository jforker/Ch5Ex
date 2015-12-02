import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch 
 * bacteria and remove them from the blood.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class WhiteCell extends Actor
{
    int score = 0;
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }
    }
    
    /*
     * 
     */
    private void checkCollision()
    {
        getWorld().showText("Score: " + score, 80, 25);
        if(isTouching(Bacteria.class))
        {
            removeTouching(Bacteria.class);
            Greenfoot.playSound("OmNom.wav");
            score += 20;
        }
        if(isTouching(Virus.class))
        {
            removeTouching(Virus.class);
            Greenfoot.playSound("game-over.wav");
        }
    }
    
}
