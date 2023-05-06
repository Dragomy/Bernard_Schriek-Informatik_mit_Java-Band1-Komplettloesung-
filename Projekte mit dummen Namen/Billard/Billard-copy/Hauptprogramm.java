
import sum.kern.*;

public class Hauptprogramm
{
    // Objekte
    Bildschirm s;
    Kugel k;
    Stift z;
    Maus m;
    // Konstruktor
    public Hauptprogramm()
    {
        Bildschirm pBildschirm= new Bildschirm(1200,1200);
        z = new Stift();
        m = new Maus();
        k = new Kugel();
        z.zeichneRechteck(400, 300);
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil

        do
        {
            k.bewege(); 
        }while (true);
    }
}