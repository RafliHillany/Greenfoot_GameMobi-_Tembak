import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobil1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobil1 extends Actor
{
    /**
     * Act - do whatever the mobil1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter=0;
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3); 
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3); 
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3,getY()); 
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3,getY()); 
        }
        counter++;
        if (counter==60)
        {
            tembak();
            counter=0;
        }
        
    }
    void tembak()
    {
        Peluru peluru=new Peluru();
        getWorld().addObject(peluru,getX(),getY()); 
        Greenfoot.playSound("ammo.wav");
    }
}
