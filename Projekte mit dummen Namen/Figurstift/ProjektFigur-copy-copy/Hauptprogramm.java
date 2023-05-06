
import sum.kern.*;

public class Hauptprogramm
{
    Bildschirm b;
    Figurstift f;
    
    public Hauptprogramm()
    {
        b = new Bildschirm(600,600);
        f = new Figurstift();
        this.fuehreAus();
    }

    public void fuehreAus()
    {
        f.bewegeBis(100, 100);
        f.zeichneRing();

        f.bewegeBis(200, 200);
        f.zeichneQuadrat(50); 

        f.bewegeBis(300, 300);
        f.summeDerErstenNZahlen(100);
        
        f.bewegeBis(400, 400);
        f.summeZwischenAundB(4,7);
        //Ring,Kreis 26.10.
        f.bewegeBis(100, 300);
        f.KreisInformationen(15);
        
        f.bewegeBis(200, 350);
        f.RingInformationen(20, 30);
        
        f.bewegeBis(100, 400);
        f.lebnitzreihe();
    }
}