import sum.kern.*;

public class Kugel
{
    Stift s;
    Bildschirm kenntBildschirm;
    Maus m;
    public Kugel()
    {
        s = new Stift();
        m = new Maus();
        s.bewegeBis(100,100);
    }

    
    
    public void gibFrei()
    {
        s.gibFrei();
    }

    public void zeichne()
    {
        s.zeichneKreis(10);
    }

    public void bewege()
    {
        this.loesche();
        s.bewegeUm(0.01);
        this.zeichne();
        if(this.gibHPosition() >= 400-20-2)
            {
                this.dreheUm();
            }
        if(this.gibHPosition() <= 3)
            {
                this.dreheUm();
            }
    }
    
    public void loesche()
    {
        s.radiere();
        this.zeichne();
        s.normal();
    }
    
    public void dreheUm()
    {
        s.dreheUm(180);
    }
    
    public double gibHPosition()
    {
        return s.hPosition();
    }
    
    public double gibVPosition()
    {
        return s.vPosition();
    }
    
}
