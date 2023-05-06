
import sum.kern.*;

public class Quadrat
{
    // Objekte
    Bildschirm derBildschirm;
    Stift s;

    // Konstruktor
    public Quadrat()
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
        s.zeichneRechteck(50, 50);
        
        // Aufraeumen
    }
}