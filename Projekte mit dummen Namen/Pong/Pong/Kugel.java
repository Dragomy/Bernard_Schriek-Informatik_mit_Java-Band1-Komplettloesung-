import sum.kern.*; import sum.werkzeuge.*;

public class Kugel 
{
    //Attribute
    double zGroesse;
    double zGeschwindigkeit;
    int zScore;

    //Bezugsobjekte
    Bildschirm kenntBildschirm;
    Schiebeding kenntSchiebeding;
    Schiebeding2 kenntSchiebeding2;
    Buntstift s;
    Buntstift scoreStift;
    Rechner r;
    Schiebeding SD;
    Schiebeding2 SD2;

    public Kugel(double pH, double pV, double pGroesse, double pGeschwindigkeit, double pWinkel, 
                Bildschirm pBildschirm, Schiebeding pSchiebeding, Schiebeding2 pSchiebeding2)
    {
        kenntBildschirm = pBildschirm;
        kenntSchiebeding = pSchiebeding;
        kenntSchiebeding2 = pSchiebeding2;
        s = new Buntstift();
        scoreStift = new Buntstift();        
        r = new Rechner();
        s.dreheBis(pWinkel);
        s.bewegeBis(pH,pV);
        zGroesse = pGroesse;
        zGeschwindigkeit = pGeschwindigkeit;
        zScore = 0;
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
        //this.Score();
        s.radiere();
        this.zeichne();
        s.bewegeUm(zGeschwindigkeit);
        s.normal();
        this.zeichne();
        if(this.amLinkenRand() || this.amRechtenRand())
        { s.dreheBis(180 - s.winkel());}
        else if (this.SchiebedingPosition2() || this.SchiebedingPosition()) 
        {s.dreheBis(360 - s.winkel());}
    }

    public boolean Score()
    {
        scoreStift.bewegeBis(100, 150);
        if ( s.hPosition() >= kenntSchiebeding.DingPosition() && s.hPosition() <= kenntSchiebeding.DingPosition()+149)
            {
                zScore++;
                scoreStift.schreibeText("Score="+zScore);
                return true;
            }
        else 
        { return false;}
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

    public boolean SchiebedingPosition()
    {   
        if ( s.vPosition() >= 920-zGroesse-2)
        { 
            if ( s.hPosition() >= kenntSchiebeding.DingPosition() && s.hPosition() <= kenntSchiebeding.DingPosition()+149)
            { 
                return true;}
            else 
            {
                return false;}
        }
        else 
        { 
            return false;}
    }
    
    public boolean SchiebedingPosition2()
    {   
        if ( s.vPosition() <= 30+zGroesse+2)
        { 
            if ( s.hPosition() >= kenntSchiebeding2.DingPosition() && s.hPosition() <= kenntSchiebeding2.DingPosition()+149)
            { 
                return true;}
            else 
            {
                return false;}
        }
        else 
        { 
            return false;}
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
}