import sum.kern.*;
public class Freihand2
{
    Bildschirm b;
    Stift s;
    Maus m;
    public Freihand2()
    {
        b = new Bildschirm(500,500);
        s = new Stift();
        m = new Maus();
        this.fuehreAus();
    }
    public void fuehreAus()
    {
      do{
          if(m.istGedrueckt())
          {
           s.bewegeBis(m.hPosition(), m.vPosition());
           s.zeichneKreis(3);
          }
      }while(!m.doppelKlick());
    }
}
