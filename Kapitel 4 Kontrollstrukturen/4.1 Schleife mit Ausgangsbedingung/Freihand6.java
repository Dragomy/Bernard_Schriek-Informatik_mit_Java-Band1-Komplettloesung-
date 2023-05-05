import sum.kern.*;
public class Freihand6
{
    Bildschirm b;
    Stift s;
    Maus m;
    Tastatur t;
    public Freihand6()
    {
        b = new Bildschirm(500,500);
        s = new Stift();
        m = new Maus();
        t = new Tastatur();
        this.fuehreAus();
    }
    public void fuehreAus()
    {
      do{
          while(m.istGedrueckt())
          {
            if(m.istGedrueckt())
            {
             s.zeichneKreis(3);
            }else{
             s.runter();
             s.bewegeBis(m.hPosition(), m.vPosition());  
            }
          }
      }while(!m.doppelKlick());
    }
}
