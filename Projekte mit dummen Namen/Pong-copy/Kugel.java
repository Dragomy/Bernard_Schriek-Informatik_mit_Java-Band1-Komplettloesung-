import sum.kern.*;
import sum.werkzeuge.*;
public class Kugel
{

    Buntstift s;
    Bildschirm kenntBildschirm;
    double zgroesse, zspeed, zwinkel, zZahl;
    Balken kenntBalken;
    P2 kenntP2;
    Rechner r;

    public Kugel(double pH, double pV, double pS, double pG, double pWinkel, Bildschirm pBildschirm, Balken pBalken,P2 pP2)
    {
        s = new Buntstift();
        kenntP2 = pP2;
        s.dreheBis(pWinkel);
        r = new Rechner();
        zgroesse = pG;
        zspeed = pS;
        kenntBildschirm = pBildschirm;
        s.bewegeBis(pH,pV);
        kenntBalken = pBalken;
    }

    public void gibFrei()
    {
        s.gibFrei();
    }

    public void zeichnen()
    {
        s.setzeFuellMuster(Muster.GEFUELLT);
        s.setzeFarbe(Farbe.WEISS);
        s.zeichneKreis(zgroesse);
    }

    public boolean amLinkenRand(){
        return s.hPosition() <= kenntBalken.gibStifth() + zgroesse + 10 && s.vPosition() > kenntBalken.gibStiftv() && s.vPosition() < kenntBalken.gibStiftv()+60;
    }

    public boolean amRechtenRan(){
        return s.vPosition() >= kenntP2.gibStiftv() && kenntP2.gibStiftv() + 60 > s.vPosition() && kenntP2.gibStifth() < s.hPosition() && kenntP2.gibStifth() + 60 >= s.hPosition();
    }

    public boolean unten(){
        return s.vPosition() <= 0+zgroesse+2;
    }

    public boolean oben(){
        return s.vPosition() >= kenntBildschirm.hoehe()-zgroesse-2;
    }

    public void bewege()
    {
        if (zspeed > 0)
        {this.loesche();
            s.bewegeUm(zspeed);
        }

        if( this.amRechtenRan()|| this.amLinkenRand())
        {
            s.dreheBis(s.winkel() - r.ganzeZufallsZahl(0,270));
        }
        else if(this.oben() || this.unten()){
            s.dreheBis(360 - s.winkel());
        }
        zspeed=zspeed * 1.0001;
        this.zeichnen();

    }

    public void bewegeBis(double x, double y)
    {
        s.bewegeBis(x,y);
    }

    public void loesche()
    {
        s.radiere();
        this.zeichnen();

        s.normal();
    }

    public void random()
    {
        s.dreheBis(r.zufallsZahl());
    }

    public double hPosition()
    {
        return s.hPosition();
    }

    public double vPosition()
    {
        return s.vPosition();
    }

    public void groesse(double groesse)
    {
        zgroesse = groesse;
    }

    public double gibGroesse()
    {
        return zgroesse;
    }

    public void speed(double speed){
        zspeed = speed / 10;
    }

    public double gibSpeed()
    {
        return zspeed;
    }
}
