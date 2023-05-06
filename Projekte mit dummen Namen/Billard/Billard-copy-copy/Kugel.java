import sum.kern.*;

public class Kugel
{
    Stift s;
    Bildschirm kenntBildschirm;
    Maus m;
    public double zGroesse;
    public double zSpeed;
    
    public Kugel(double pV,double pH,double pG,double pS)
    {
        s = new Stift();
        m = new Maus();
        s.bewegeBis(pV,pH);
        zGroesse = pG;
        zSpeed = pS;
    }

    
    public void gibFrei()
    {
        s.gibFrei();
    }

    public void zeichne()
    {
        s.zeichneKreis(zGroesse);
    }
    
    public void bewege()
    {
        this.loesche();
        s.bewegeUm(zSpeed);
        this.zeichne();
        if(this.gibHPosition() >= 400-zGroesse-2)
        {
            this.dreheUm();
        }
        if(this.gibHPosition() <= 0+zGroesse+2)
        {
            this.dreheUm();
        }
        if(this.gibVPosition() >= 300-zGroesse-2)
        {
            this.dreheUm();
        }
        if(this.gibVPosition() <= 0+zGroesse+2)
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

    public double gibGroesse()
    {
        return zGroesse;
    }

    public void setzeGroesse(double pGroesse)
    {
        zGroesse = pGroesse;
    } 

    public double gibGeschwindigkeit()
    {
        return zSpeed;
    }     

    public void setzeGeschwindigkeit(double pSpeed)
    {
        zSpeed = pSpeed;
    }

    
    
}
