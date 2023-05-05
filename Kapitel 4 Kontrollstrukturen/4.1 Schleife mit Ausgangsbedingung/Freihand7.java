import sum.kern.*;
public class Freihand7
{
    Bildschirm b;
    Buntstift s;
    Maus m;
    Tastatur t;
    public Freihand7()
    {
        b = new Bildschirm(500,500);
        s = new Buntstift();
        m = new Maus();
        t = new Tastatur();
        this.fuehreAus();
    }
    public void fuehreAus()
    {
      do{
          if(m.istGedrueckt())
          {
           s.bewegeBis(m.hPosition(), m.vPosition());
           s.runter();
          }else if(t.wurdeGedrueckt()){
           s.setzeFarbe(10);  
          }else{
           s.hoch();
          }
      }while(!m.doppelKlick());
    }
}
