import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisang extends Actor
{
    Pisang(){
        GreenfootImage gambar = getImage();
        gambar.scale(40, 40);
        setImage(gambar);
    }

    public void act() 
    {
        move(Greenfoot.getRandomNumber(10));
        if (isAtEdge()){
            turn (90 + Greenfoot.getRandomNumber(90));
        }
        // batas();
    }
    
    // void batas(){
        // if(getX() >= 600){
            // setLocation(getX()+30, getY());
        // }
        // if(getY() >= 500){
            // setLocation(getX(), getY()+30);
        // }
    // }
}
