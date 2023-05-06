import sum.kern.*;

public abstract class Figur
{
    // Objekte
    Buntstift s;
    Tastatur t;
    int zGroesse;
    boolean zAktiv;
    // Konstruktor
    public Figur(int pH, int pV, int pGroesse, int pFarbe)
    {
        s = new Buntstift();
        s.bewegeBis(pH, pV);
        s.setzeFarbe(pFarbe);
        t = new Tastatur();
        
        zAktiv = false;
        zGroesse = pGroesse;
        this.zeichne();
    }

    // Dienste
    public boolean istAktiv()
    {
        return zAktiv;
    }

    public void gibFrei()
    {
        s.gibFrei();
    }

    public void groesser()
    {
        this.loesche();
        zGroesse = zGroesse + 1;
        this.zeichne();
    }

    public void kleiner()
    {
        if(zGroesse > 2)
        this.loesche();
        zGroesse = zGroesse - 1;
        this.zeichne();
    }

    
    protected abstract void zeichne();

    public void loesche()
    {
        s.radiere();
        this.zeichne();
        s.normal();
    }

    public void bewegeUm(int pH, int pV)
    {
        this.loesche();
        s.bewegeBis(s.hPosition() + pH, s.vPosition() + pV);
        this.zeichne();
    }

    public void aktiviere()
    {
        this.loesche();
        s.setzeLinienBreite(3);
        zAktiv = true;
        this.zeichne();
    }

    public void deaktiviere()
    {
        this.loesche();
        s.setzeLinienBreite(1);
        zAktiv = false;
        this.zeichne();
    }

    protected abstract boolean getroffen(int pH, int pV);
}