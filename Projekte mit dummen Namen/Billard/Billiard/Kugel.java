import sum.kern.*; import sum.werkzeuge.*;
public class Kugel
{
    //Attribute
    double zGroesse;
    double zGeschwindigkeit;

    //Bezugsobjekte
    Bildschirm kenntBildschirm;
    Buntstift s;
    Rechner r;

    public Kugel(double pH, double pV, double pGroesse, double pGeschwindigkeit, double pWinkel, Bildschirm pBildschirm)
    {
        kenntBildschirm = pBildschirm;
        s = new Buntstift();
        r = new Rechner();
        s.dreheBis(pWinkel);
        s.bewegeBis(pH,pV);
        zGroesse = pGroesse;
        zGeschwindigkeit = pGeschwindigkeit;
    }

    public void dreheUm()
    {
        s.dreheUm(180);
    }

    public double gibHPostion()
    {
        return s.hPosition();
    }

    public double gibVPostion()
    {
        return s.vPosition();
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
        s.radiere();
        this.zeichne();
        s.bewegeUm(zGeschwindigkeit);
        s.normal();
        this.zeichne();

        if(this.amLinkenRand() || this.amRechtenRand())
        { s.dreheBis(180 - s.winkel());}
        else if (this.amOberenRand() || this.amUnterenRand()) 
        {s.dreheBis(360 - s.winkel());}
    }

    public boolean amLinkenRand()
    {
        //return s.hPosition() <= 0+zGroesse+2;
        if ( s.hPosition() <= 0+zGroesse+2)
        { return true;}
        else 
        { return false;}
    }

    public boolean amRechtenRand()
    {
        //return s.hPosition() >= 400-zGroesse-2;
        if ( s.hPosition() >= kenntBildschirm.breite()-zGroesse-2)
        { return true;}
        else 
        { return false;}
    }

    public boolean amOberenRand()
    {
        //return s.vPosition() <= 0+zGroesse+2;
        if ( s.vPosition() <= 0+zGroesse+2)
        { return true;}
        else 
        { return false;}
    }

    public boolean amUnterenRand()
    {
        //return s.vPosition() >= 300-zGroesse-2;
        if ( s.vPosition() >= kenntBildschirm.hoehe()-zGroesse-2)
        { return true;}
        else 
        { return false;}
    }

    public void setzeGroesse(double pGroesse)
    {
        zGroesse = pGroesse;
    }

    public double gibGroesse()
    {
        return zGroesse;
    }

    public void setzeGeschwindigkeit(double pGeschwindigkeit)
    {
        zGeschwindigkeit = pGeschwindigkeit;
    }

    public double gibGeschwindigkeit()
    {
        return zGeschwindigkeit;
    }
    
    public Stift gibStift()
    {
     return s;    
    }
}

