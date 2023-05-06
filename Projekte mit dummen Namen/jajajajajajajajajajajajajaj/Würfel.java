
import sum.kern.*;

import sum.werkzeuge.*;
/**
 * @author 
 * @version 
 */
public class Würfel
{
    // Objekte
    Bildschirm derBildschirm;
    Stift meinStift;
    Rechner r;
    int[] würfel = new int[30];

    // Konstruktor
    public Würfel()
    {
        r = new Rechner();
        
        this.fuehreAus();
        System.out.println(this.durchschnitt());
    }

    // Dienste
    public void fuehreAus()
    {
        
        for(int i = 0; i<würfel.length; i++){
            würfel[i] = r.ganzeZufallsZahl(1,6);
            System.out.println(würfel[i]);
        }
        
    }
    
    public int ausrechnen(){
        int lSumme = 0;
        for(int i = 0; i<würfel.length; i++){
            lSumme = lSumme + würfel[i];
        }
        return lSumme;
    }
    
    public double durchschnitt(){
        double d = this.ausrechnen() / (double)würfel.length;
        return d;
    }
    
    
}