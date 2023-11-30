import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tamat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tamat extends Actor
{
    Tamat() {
        setImage(new GreenfootImage("Score\n", 32, Color.WHITE, null, Color.BLACK));
    }
    int scr;
    public void act(){
        setLocation(550,40);
        setImage(new GreenfootImage("Score\n"+Gajah.kenyang, 32, Color.WHITE, null, Color.BLACK));
        if(Gajah.tamat == true)
        {
            setLocation(300,250);
            setImage(new GreenfootImage("Finish\n\nScore\n"+Gajah.kenyang, 48, Color.YELLOW, null, Color.BLACK));
        }
    }    
}
