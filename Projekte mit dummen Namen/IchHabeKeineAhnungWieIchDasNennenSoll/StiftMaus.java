import sum.kern.*;
public class StiftMaus
{
    // Objekte
    Bildschirm derBildschirm;
    Stift s;
    Maus m;
    // Konstruktor
    public StiftMaus()
    {
        derBildschirm = new Bildschirm(600,600);
        s = new Stift();
        m = new Maus();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        s.runter();
        do
        {
            s.bewegeBis(m.hPosition(), m.vPosition());
        } while( !m.doppelKlick());
    }
}