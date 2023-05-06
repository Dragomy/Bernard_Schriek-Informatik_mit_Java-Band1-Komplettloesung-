import sum.kern.*;
import sum.werkzeuge.*;

public class Kreis
{

    Buntstift s;
    boolean Aktiv;
    int zgroesse;
    Maus m;
    Rechner r;
    Tastatur t;

    public Kreis(Maus pm, int ph, int pv, int pgroesse, int pfarbe, Tastatur pt)
    {
        s = new Buntstift();
        s.bewegeBis(ph,pv);
        s.setzeFarbe(pfarbe);
        Aktiv = false;
        zgroesse = pgroesse;
        this.zeichne();
        m = pm;
        r = new Rechner();
        t = pt;

    }

    public void zeichne()
    {
        s.zeichneKreis(zgroesse);
    }

    public void loesche(){
        s.radiere();
        this.zeichne();
        s.normal();
    }

    public void gibFrei() { s.gibFrei(); }

    public boolean istAktiv() {return Aktiv; }

    public void aktiviere()
    {
        this. loesche();
        s.setzeLinienbreite(3);
        Aktiv = true;
        this.zeichne();
    }

    public void deaktiviere()
    {
        this.loesche();
        s.setzeLinienbreite(1);
        Aktiv = false;
        this.zeichne();
    }

    public boolean getroffen(int pH, int pV)
    {
        return (pH - s.hPosition()) * (pH - s.hPosition()) + (pV - s.vPosition()) * (pV - s.vPosition()) <= zgroesse * zgroesse;
    }

    public void bewegeUm(int pH, int pV)
    {
        this.loesche();
        s.bewegeBis(s.hPosition() + pH, s.vPosition() + pV);
        this.zeichne();
    }

    public void getroffen(){
        double d = r.wurzel(r.quadrat(s.hPosition() - m.hPosition()) + r.quadrat(s.vPosition() - m.vPosition()));

        if(d < zgroesse || d < -zgroesse){
            s.setzeLinienBreite(3);
            Aktiv = true;
        }else{
            Aktiv = false;
            s.radiere();
            this.zeichne();
            s.normal();
            s.setzeLinienBreite(1);
        }
    }


    public void bewege(){
        this.zeichne();
        if(t.wurdeGedrueckt() && Aktiv == true){
            if(t.zeichen() == Zeichen.PFEILRECHTS){
                s.dreheBis(0);
                this.loesche();
                s.bewegeUm(1); 
            }else if(t.zeichen() == Zeichen.PFEILLINKS){
                s.dreheBis(180);
                this.loesche();
                s.bewegeUm(1);
            }else if(t.zeichen() == Zeichen.PFEILUNTEN){
                s.dreheBis(-90);
                this.loesche();
                s.bewegeUm(1);
            }else if(t.zeichen() == Zeichen.PFEILOBEN){
                s.dreheBis(90);
                this.loesche();
                s.bewegeUm(1);
            }
            t.weiter();
        }
    }

}
