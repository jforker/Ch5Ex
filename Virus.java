import greenfoot.*;

/**
 * Virus objects move from right to left through the bloodstream.
 * 
 * @author John Forker 
 * @version V1.0 11/25/15
 */
public class Virus extends Actor
{
    /**
     * Act - Virus rotates counter-clockwise and moves right to left
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        turn(-1);
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }// Add your action code here.
    }    
}
