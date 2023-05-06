
import sum.kern.*;
import sum.werkzeuge.*;
public class Striche
{
    // Objekte
    Bildschirm DB;
    Buntstift s;
    Maus m;
    Rechner r;

    // Konstruktor
    public Striche()
    {
        DB = new Bildschirm(600,600);
        s = new Buntstift();
        m = new Maus(); 
        r = new Rechner();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        do
        {
        int h = r.ganzeZufallsZahl(0, DB.breite());
        int v = r.ganzeZufallsZahl(0, DB.hoehe());
        s.bewegeBis(h, v);
        s.setzeFarbe(r.ganzeZufallsZahl(0,15));
        s.runter();
        s.bewegeUm(10);
        s.hoch();
     }while(!m.doppelKlick());
        
    }
 }