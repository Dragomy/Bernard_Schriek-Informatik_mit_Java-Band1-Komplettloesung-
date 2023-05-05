import sum.kern.*;
public class Freihand1
{
    Bildschirm b;
    Stift s;
    Maus m;
    public Freihand1()
    {
        b = new Bildschirm(500,500);
        s = new Stift();
        m = new Maus();
        this.fuehreAus();
    }
    public void fuehreAus()
    {
      s.runter();
      do{
        s.bewegeBis(m.hPosition(), m.vPosition());
      }while(!m.istGedrueckt());
    }
}
