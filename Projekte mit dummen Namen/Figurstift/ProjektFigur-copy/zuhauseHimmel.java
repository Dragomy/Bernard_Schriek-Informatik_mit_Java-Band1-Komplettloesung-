import sum.kern.*;
import sum.werkzeuge.*;
public class zuhauseHimmel
{
    // Objekte
    Bildschirm b;
    Buntstift s;
    Rechner r;
    Maus m;
    // Konstruktor
    public zuhauseHimmel()
    {
        b = new Bildschirm(1000,1000);
        s = new Buntstift();
        r = new Rechner();
        m = new Maus();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        do
        {   int h = r.ganzeZufallsZahl(0, b.breite());
            int v = r.ganzeZufallsZahl(0, b.hoehe());
            s.bewegeBis(h, v);
            s.setzeFarbe(r.ganzeZufallsZahl(0, 15));
            for(int i=0 ; i<=5 ; i++)
            {
                s.runter();
                s.bewegeUm(10);
                s.dreheUm(144);
                s.hoch();
            }
        }while (!m.doppelKlick());
    }
}