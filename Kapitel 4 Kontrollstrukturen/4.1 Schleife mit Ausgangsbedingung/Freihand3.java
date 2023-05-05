import sum.kern.*;
public class Freihand3
{
    Bildschirm b;
    Stift s;
    Maus m;
    public Freihand3()
    {
        b = new Bildschirm(500,500);
        s = new Stift();
        m = new Maus();
        this.fuehreAus();
    }
    public void fuehreAus()
    {
      do{
          while(m.istGedrueckt())
          {
           s.bewegeBis(m.hPosition(), m.vPosition());
           s.zeichneKreis(3);
          }
      }while(!m.doppelKlick());
    }
}
