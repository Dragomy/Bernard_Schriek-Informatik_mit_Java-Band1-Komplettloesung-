
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class BlueJIstBlöd
{
    // Objekte
    Bildschirm derBildschirm;
    Stift meinStift;

    // Konstruktor
    public BlueJIstBlöd()
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
        meinStift.schreibeText("BlueJ Ist Blöd");
        
        // Aufraeumen
        meinStift.gibFrei();
    }
}