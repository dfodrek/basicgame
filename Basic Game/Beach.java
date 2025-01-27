import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beach extends World
{
    private int counter;   //uvjet za lose game (vrijeme)
    
    public Beach()
    {    
        // Create a new world with 15x10 cells with a cell size of 60*60 pixels.
        super(15, 10, 60); //cells in a row (width), height, dimension of 1 cell
        this.prepareTheBeach();
    }
    
    public void endTheGame(boolean win){  //parametar win je opcija za poruku (win-loose)
        
        this.removeObjects(this.getObjects(Actor.class));  //brisanje svih objekata iz svijeta
        int x=this.getWidth()/2;    //pozicioniranje na sredinu Worlda: x,y koordinate
        int y=this.getHeight()/2;
        String message;
        if (win){
            message="The robber was caught. You won!";
        } else{
            message="The robber escaped. You lost!";
        }
        this.showText(message, x, y);
        Greenfoot.delay(40);   //pauza
        this.showText(null, x, y);  //brisanje teksta sa svijeta
        this.prepareTheBeach();  //ponovno pozivanje igre
        Greenfoot.stop();
    }
    
    public void act(){
        this.counter--;   //svakim actom se counter smanjuje za 1
        if (this.counter==0){   //kad se counter smanji na 0
            this.endTheGame(false);   //boolean uvjet je false - poruka za kraj igre se poziva
        }
    }
    
    private void prepareTheBeach(){
        this.addObject(new Police("w","s","a","d"), 0, 0);
        
        
        for (int i=0; i<10; i++){   //stvaranje 10 HidingSpota
            
            int x=0;
            int y=0;
        
            while(!this.getObjectsAt(x,y,Actor.class).isEmpty()){  //ako pozicija nije empty
                x=Greenfoot.getRandomNumber(this.getWidth());  //random koordinate
                y=Greenfoot.getRandomNumber(this.getHeight());
            
            }
        
            this.addObject(new HidingSpot(), x, y);  //stvaranje objekta HidingSpot na koordinatama x,y
        }
        
        //this.addObject(new Police("up","down","left","right"), 5, 5);
        this.addObject(
            new Robber(),
            Greenfoot.getRandomNumber(this.getWidth()),
            Greenfoot.getRandomNumber(this.getHeight())
        );
        
        this.counter=500;    //100 pozivanja metode act  
    }
}
