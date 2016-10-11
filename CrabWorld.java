import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public final in TIEMPO_NIVEL = 15;
    private Counter contGusanos;
    private Counter contVidas;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private Crab cangrejo;
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1);
        contGusanos = new Counter("Gusanos: ");
        addObject(contGusanos, 64, 20);
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj = new SimpleTimer();
    }
    public void started(){
        reloj.mark();
        system.out.println("Boton Run presionado");
    }
    public void stopped(){
        system.out.println("Boton Pause presionado");
    }
    public void act()
    {
        if(reloj.millisElapsed() < 1000){
            contTiempo.add(-1);
            reloj.mark();
        }
    }
    public void cangrejoAtrapado()
    {
        decrementaVidas();
        langosta.setlocation(20,30);
        cangrejo.setlocation(215,210);
        if(contVidas.getValue() == 0){
            Label etiquetafin = new Label("Game Over", 50);
            addObject(etiquetaFin, 250 250);
            Greenfoot.stop();
        }
    }
    public void reiniciaPosCangrejo(){
        cangrejo.setlocation
    }
    public void incrementaGusanos()
    {
        contGusanos.add(1);
    }
    public void decrementaVidas()
    {
        contGusanos.remove(1);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,506,258);
        Worm worm2 = new Worm();
        addObject(worm2,276,115);
        Worm worm3 = new Worm();
        addObject(worm3,152,384);
        Worm worm4 = new Worm();
        addObject(worm4,397,483);
        Worm worm5 = new Worm();
        addObject(worm5,424,365);
        Worm worm6 = new Worm();
        addObject(worm6,348,325);
        Worm worm7 = new Worm();
        addObject(worm7,66,206);
        Worm worm8 = new Worm();
        addObject(worm8,67,206);
        Worm worm9 = new Worm();
        addObject(worm9,246,165);
        Worm worm10 = new Worm();
        addObject(worm10,357,163);
        Worm worm11 = new Worm();
        addObject(worm11,377,163);
        Worm worm12 = new Worm();
        addObject(worm12,392,157);
        Worm worm13 = new Worm();
        addObject(worm13,507,86);
        Worm worm14 = new Worm();
        addObject(worm14,140,477);
        Worm worm15 = new Worm();
        addObject(worm15,38,449);
        Worm worm16 = new Worm();
        addObject(worm16,169,269);
        Worm worm17 = new Worm();
        addObject(worm17,159,87);
        Worm worm18 = new Worm();
        addObject(worm18,356,43);
        Crab crab = new Crab();
        addObject(crab,285,254);
        //counter = new Counter("Otro contador");
        //addObject(counter, 339, 24);
        Lobster lobster = new Lobster();
        addObject(lobster,248,421);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,86,105);
        removeObject(worm10);
        removeObject(worm12);
        removeObject(worm11);
        removeObject(worm6);
        removeObject(worm5);
        lobster.setLocation(388,375);
        removeObject(worm3);
        removeObject(worm14);
        removeObject(worm9);
    }
}
