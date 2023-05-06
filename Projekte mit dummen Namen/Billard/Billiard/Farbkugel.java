import sum.kern.*;
public class Farbkugel extends Kugel
{
    int zFarbe;
    Buntstift b;

    public Farbkugel(double pH, double pV, double pGroesse, double pGeschwindigkeit, double pWinkel, Bildschirm pBildschirm, int pFarbe)
    {
        super(pH, pV,  pGroesse,  pGeschwindigkeit,  pWinkel,  pBildschirm);
        zFarbe = pFarbe;
        s.setzeFuellmuster(Muster.GEFUELLT);
        s.setzeFarbe(zFarbe );
    }
   
    public void bewege()
    {
        
        super.bewege();
    }

}