
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Pentagon
{
    // Objekte
    Bildschirm derBildschirm;
    Stift s;

    // Konstruktor
    public Pentagon()
    {
        derBildschirm = new Bildschirm(600,600);
        s = new Stift();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        s.bewegeBis(100, 100);
        s.runter();
        s.bewegeUm(50);
        s.dreheUm(72);
        s.bewegeUm(50);
        s.dreheUm(72);
        s.bewegeUm(50);
        s.dreheUm(72);
        s.bewegeUm(50);
        s.dreheUm(72);
        s.bewegeUm(50);
        s.hoch();
    
    }
}