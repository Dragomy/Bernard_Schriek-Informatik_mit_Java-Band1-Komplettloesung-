
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Kreis
{
    // Objekte
    Bildschirm derBildschirm;
    Stift meinStift;

    // Konstruktor
    public Kreis()
    {
        derBildschirm = new Bildschirm(600,600);
        meinStift = new Stift();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        meinStift.bewegeBis(100, 100);
        meinStift.zeichneKreis(50);
        
        // Aufraeumen
        meinStift.gibFrei();
    }
}