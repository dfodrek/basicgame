import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robber extends Person
{

 
    public Robber(){
        super(6);     //pozivanje konstruktora iz nadklase s delay 6
    }
    
    //act metoda ne treba jer je identična metodi iz nadklase
    //ako ipak želimo metodu, može izgledati ovako:
    //public void act()
    //{
    //    super.act();  //pozivanje act metode iz nadklase
    //}
    
    public void movement(){
        this.setRotation(90*Greenfoot.getRandomNumber(4));   //brojevi 0-3, koji će se množiti sa 90 stupnjeva
        this.move(1);
    }     
}
