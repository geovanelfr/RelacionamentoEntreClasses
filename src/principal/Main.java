package principal;

import java.util.Random;

/**
 *
 * @author geovanelfr
 */
public class Main {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
         l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 3, 1);
        
         l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
         l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
         l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
         

        /*
        l[0].apresentar();
        l[0].ganharLuta();
        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        */
        
        Luta uec0 = new Luta();
        Luta uec1 = new Luta();
        
        System.out.println("Luta 1°");
        uec0.marcarLuta(l[0], l[1]);
        uec0.lutar();
        
        System.out.println("\n\nLuta 2°");
        uec1.marcarLuta(l[2], l[3]);
        uec1.lutar();
        
        System.out.println("\n\nLuta 3°");
        Luta uec2 = new Luta();
        uec2.marcarLuta(l[0], l[3]);
        uec2.lutar();
        
        
        
        
    }
    
}
