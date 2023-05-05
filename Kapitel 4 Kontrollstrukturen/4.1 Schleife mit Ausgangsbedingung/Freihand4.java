import sum.kern.*;
public class Freihand4
{
    Bildschirm b;
    Stift s;
    Maus m;
    public Freihand4()
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
           s.runter();
          }else{
            s.hoch();
          }
      }while(!m.doppelKlick());
    }
}
