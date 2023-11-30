import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gajah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gajah extends Actor
{
    Gajah(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
        live = 100;
        kenyang = 0;
        speed = 100f;
        tamat = false;
    }

    static int live = 100;
    float speed = 100f;
    static int kenyang = 0;

    public void act() 
    {
        control();
        if(adamakanan()){
            memakan();
        }
        selesai();
        batas();
    }

    boolean adamakanan(){
        Actor pisang = getOneObjectAtOffset(0, 0, Pisang.class);
        return pisang != null;
    }

    void memakan(){
        Actor pisang = getOneObjectAtOffset(0, 0, Pisang.class);
        if(pisang != null){
            getWorld().removeObject(pisang);
            getWorld().addObject(pisang, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
            kenyang += 1;
        }
    }

    static boolean tamat;

    void selesai(){
        if( kenyang == 10){
            tamat = true;
            Greenfoot.stop();
        }
    }

    void control(){
        int x = getX(), y = getY();
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-10,y);
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+10,y);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x,y-10);
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x,y+10);
            setRotation(90);
        }
    }

    static int getLive(){
        return live;
    }

    void batas(){
        if(getX() >= 600){
            setLocation(getX()+30, getY());
        }
        if(getY() >= 500){
            setLocation(getX(), getY()+30);
        }
    }

    
}
