import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public abstract class Person extends Actor   //neće generirati objekte
{
    private int delay;
    private int delayCounter;
    
    public Person(){
       this(3); 
    }
    
    public Person(int delay){
       this.delay=delay;
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
    
    public abstract void movement();    //apstraktna metoda, zbog nasljeđivanja
}
