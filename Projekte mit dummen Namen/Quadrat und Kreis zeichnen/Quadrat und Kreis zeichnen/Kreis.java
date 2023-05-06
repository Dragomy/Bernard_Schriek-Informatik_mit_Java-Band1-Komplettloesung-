import sum.kern.*;

public class Kreis extends Figur
{
    public Kreis(int pH, int pV, int pGroesse, int pFarbe)
    {
        super(pH, pV, pGroesse, pFarbe);
    }

    protected void zeichne()
    {
        s.zeichneKreis(zGroesse);
    }

    protected boolean getroffen(int pH, int pV)
    {
        return (pH - s.hPosition())
        * (pH - s.hPosition())
        + (pV - s.vPosition())
        * (pV - s.vPosition()) <= zGroesse * zGroesse;
    }

}
