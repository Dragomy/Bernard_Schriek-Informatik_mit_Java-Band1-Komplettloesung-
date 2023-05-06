
import sum.kern.*;

public class Hauptprogramm
{
    // Objekte
    Bildschirm s;
    Kugel k1,k2;
    Stift z;
    Maus m;
    // Konstruktor
    public Hauptprogramm()
    {
        Bildschirm pBildschirm= new Bildschirm(1200,1200);
        z = new Stift();
        m = new Maus();
        k1 = new Kugel(100,100,5,0.005);
        k2 = new Kugel(200,200,10,0.01);
        z.zeichneRechteck(400, 300);
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil

        do
        {
            k1.bewege(); 
            k2.bewege(); 
        }while (true);
    }
}