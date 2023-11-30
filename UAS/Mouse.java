import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    //3
    public Mouse()
    {
        setImage("mouse.png");
        int initialScore = 0;
        int initialLives = 4;
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("4"))
        {
            coordObject(5);
            pressToMove();
        }
    }
    //2
    public void moveBackward()
    {
        move(-3);
    }
    public void pressToMove()
    {
        move(1);
        if(Greenfoot.isKeyDown("L"))
        {
            turn(-30);
        }
        if(Greenfoot.isKeyDown("R"))
        {
            turn(45);
        }
    }
    public boolean notRightEdge()
    {
        if(getX() == getWorld().getWidth()-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void catchAnt()
    {
        if(isTouching(Ant.class))
        {
            removeTouching(Ant.class);
        }
    }
    //4
    public void coordObject(int jumlah)
    {
        int a = 2;
        int b = 5;
        int[] x_axis = new int[jumlah];
        int[] y_axis = new int[jumlah];
        for(int i = 0; i < jumlah; i++)
        {
            x_axis[i] = (i * a * 50) + 25;
            y_axis[i] = (i * b * 75) + 75;
        }
        System.out.println(Arrays.toString(x_axis));
        System.out.println(Arrays.toString(y_axis));
    }
}
