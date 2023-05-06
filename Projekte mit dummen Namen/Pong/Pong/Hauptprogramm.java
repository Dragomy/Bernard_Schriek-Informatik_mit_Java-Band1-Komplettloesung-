import sum.kern.*;

public class Hauptprogramm
{
    double Position;
    Bildschirm b;
    Buntstift s;
    Schiebeding SD;
    Schiebeding2 SD2;
    Kugel k;
    Maus m;

    // Konstruktor
    public Hauptprogramm()
    {
        b = new Bildschirm(1650,950);
        SD = new Schiebeding();
        SD2 = new Schiebeding2();
        s = new Buntstift();
        k = new Kugel(700, 500, 10, 1, 290, b, SD, SD2);
        m = new Maus();

        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {

        do
        {
            SD.zeichnen();
            SD2.zeichnen2();
            k.bewege();

        }while(!k.amUnterenRand() && !k.amOberenRand());
        s.bewegeBis(400, 200);
        s.schreibeText("OPFER");
    }
    
    
    
}