import sum.kern.*;

public class Quadrat extends Figur

{
    int zGroesseH = 0;
    int zGroesseV = 0;
    public Quadrat(int pH, int pV, int pGroesse, int pFarbe)
    {
        super(pH, pV, pGroesse, pFarbe);
        zGroesseH = zGroesse;
        zGroesseV = zGroesse;
        this.zeichne();
    }

    protected void zeichne()
    {
        s.zeichneRechteck(zGroesseH,zGroesseV);
    }


    protected boolean getroffen(int pH, int pV)
    {
        return (pH < s.hPosition() + zGroesseH && 
            pH > s.hPosition() && 
            pV < s.vPosition() + zGroesseV && 
            pV > s.vPosition());

    }

}
