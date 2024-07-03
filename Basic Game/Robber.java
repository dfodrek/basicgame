import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robber extends Actor
{
    private int delay;
    private int delayCounter;
 
    public Robber(){
        this.delay=3;
        this.delayCounter=0;
    }
    
    public void act()
    {
        if (this.delayCounter==this.delay)
        {
            this.movement();
            this.delayCounter=0;
        }else{
            this.delayCounter++;
        }
    }
    public void movement(){
        this.setRotation(90*Greenfoot.getRandomNumber(4));   //brojevi 0-3, koji će se množiti sa 90 stupnjeva
        this.move(1);
    }     
}
