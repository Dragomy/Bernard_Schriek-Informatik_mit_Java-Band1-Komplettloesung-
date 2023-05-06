
import sum.kern.*;
import sum.werkzeuge.*;
public class Halal
{
    // Objekte
    Bildschirm DB;
    Buntstift s;
    Rechner r;
    Maus m;
    // Konstruktor
    public Halal()
    {
        DB = new Bildschirm(600,600);
        s = new Buntstift();
        r = new Rechner();
        m = new Maus();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        do
        {
        int h = r.ganzeZufallsZahl(0, DB.breite());
        int v = r.ganzeZufallsZahl(0, DB.hoehe());
        s.bewegeBis(h, v);
        s.setzeFarbe(r.ganzeZufallsZahl(0,15));
        for (int g = 0; g <= 5; g++)
       {
         
         s.runter();
         s.bewegeUm(10);
         s.dreheUm(144);
         s.hoch();
       }
    }while(!m.doppelKlick());
   }
}