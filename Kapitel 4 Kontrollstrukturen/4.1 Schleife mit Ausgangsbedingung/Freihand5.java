import sum.kern.*;
public class Freihand5
{
    Bildschirm b;
    Stift s;
    Maus m;
    Tastatur t;
    public Freihand5()
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
          if(m.istGedrueckt())
          {
           s.bewegeBis(m.hPosition(), m.vPosition());
           s.runter();
          }else if(t.wurdeGedrueckt()){
           s.radiere();   
          }else{
           s.hoch();
          }
      }while(!m.doppelKlick());
    }
}
