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
    public static Counter score = new Counter("score : ");
    public static Counter hp = new Counter("HP: ");
    GreenfootSound suara=new GreenfootSound("bg1.wav");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mobil1 mobil1 = new mobil1();
        addObject(mobil1,195,727);
        mobil1.setLocation(195,739);
        mobil3 mobil3 = new mobil3();
        addObject(mobil3,308,240);
        mobil2 mobil2 = new mobil2();
        addObject(mobil2,213,112);
        mobil4 mobil4 = new mobil4();
        addObject(mobil4,43,75);
        mobil2.setLocation(118,137);
        mobil2.setLocation(256,304);
        mobil3.setLocation(111,174);
        mobil2.setLocation(269,255);
        mobil3.setLocation(373,34);
        mobil2.setLocation(220,114);
        mobil3.setLocation(359,106);
        removeObject(mobil3);
        mobil4.setLocation(49,93);
        mobil2.setLocation(233,115);
        removeObject(mobil2);
        mobil4.setLocation(49,89);
        mobil4 mobil42 = new mobil4();
        addObject(mobil42,200,124);
        mobil4 mobil43 = new mobil4();
        addObject(mobil43,355,74);
        mobil43.setLocation(364,73);
        mobil43.setLocation(382,31);
        mobil1.setLocation(195,740);
        mobil1.setLocation(196,717);
        Peluru peluru = new Peluru();
        addObject(peluru,196,717);
        addObject(score,57,26);
        score.setLocation(54,779);
        score.setLocation(63,779);
        score.setValue(0);
        mobil4 mobil44 = new mobil4();
        addObject(mobil44,302,223);
        mobil42.setLocation(175,169);
        mobil44.setLocation(244,32);
        mobil44.setLocation(244,25);
        mobil42.setLocation(194,140);
        removeObject(mobil44);
        mobil42.setLocation(220,168);
        addObject(hp,339,782);
        hp.setValue(3);

        mobil2 mobil22 = new mobil2();
        addObject(mobil22,313,76);
        mobil2 mobil23 = new mobil2();
        addObject(mobil23,139,247);
    }

    public void started()
    {
        suara.playLoop();
    }
}
