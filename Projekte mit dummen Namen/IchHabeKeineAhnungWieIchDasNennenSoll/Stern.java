
import sum.kern.*;
public class Stern
{
    // Objekte
    Bildschirm derBildschirm;
    Stift s;

    // Konstruktor
    public Stern()
    {
        derBildschirm = new Bildschirm(600,600);
        s = new Stift();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil

        s.bewegeBis(200, 200);
        s.runter();
        for(int i=0;i<8 ; i++)
        {
            s.bewegeUm(200);
            s.dreheUm(-144);
        }
    }
}