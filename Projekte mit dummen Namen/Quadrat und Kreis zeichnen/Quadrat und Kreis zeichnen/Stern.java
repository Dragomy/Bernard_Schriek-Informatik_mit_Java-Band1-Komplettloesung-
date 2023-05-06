import sum.kern.*;
public class Stern extends Figur
{
    int G = 1;
    public Stern(int pH, int pV, int pGroesse, int pFarbe)
    {
        super(pH, pV, pGroesse, pFarbe);
        G = pGroesse;
        this.zeichne();
    }

    public void zeichne()
    {
        // Aktionsteil
        s.runter();
        for(int i=0;i<8 ; i++)
        {
            s.bewegeUm(G);
            s.dreheUm(-144);
        }
    }

    protected boolean getroffen(int pH, int pV)
    {
        return (pH - s.hPosition())
        * (pH - s.hPosition())
        + (pV - s.vPosition())
        * (pV - s.vPosition()) <= zGroesse * zGroesse;
    }
}