import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
           turn(Greenfoot.getRandomNumber(90));
        }
        
        if(isTouching(Crab.class))
        {
            World mundo = getWorld();
            //mundo.showText("Game Over", 250, 250);
            Label etiquetaFin = new Label("GAME OVER :v", 75);
            mundo.addObject(etiquetaFin, 250, 250);
            Greenfoot.stop();
        }
    }    
}
