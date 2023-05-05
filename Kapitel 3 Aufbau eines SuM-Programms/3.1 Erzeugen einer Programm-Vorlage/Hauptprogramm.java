import sum.kern.*;
public class Hauptprogramm
{
    Bildschirm b;
    Stift s;
    public Hauptprogramm()
    {
        b = new Bildschirm(600,600);
        s = new Stift();
        this.fuehreAus();
    }
    public void fuehreAus()
    {
        s.bewegeBis(100, 100);
        s.schreibeText("Hallo Welt");
        
        s.gibFrei();
        b.gibFrei();
    }
}
