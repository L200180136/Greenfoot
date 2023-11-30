import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    public MyWorld()
    {    
        super(600, 500, 1);
        GreenfootImage background = getBackground();
        prepare();
    }

    private void prepare()
    {
        addObject(new Gajah(), 30, 30);
        addObject(new Pisang(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        addObject(new Pisang(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        addObject(new Pisang(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        addObject(new Pisang(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        addObject(new Pisang(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        addObject(new Tamat(),550,40);
        // Spawn();
        // addObject(new Platform(), )
    }
    
    static ArrayList<Integer> spawnMob = new ArrayList<Integer>();
    static int Mspawn;
    
    int[] spawn = {1,12,15,23,43,32,54,14,32};

    void ada(){
        for(int i=0;i<spawn.length;i++){
            int m = i;
        }
    }
    
    void Spawn(){
        for(int a=0;a<6;a++){
            spawnMob.add(125+50*a);
        }
        for(int b=0;b<5;b++){
            Mspawn=Greenfoot.getRandomNumber(5);
            addObject(new Pisang(),spawnMob.get(Mspawn),180*(b+1));
        }
    }
}
