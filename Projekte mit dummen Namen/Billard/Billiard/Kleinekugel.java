
import sum.kern.*;
public class Kleinekugel extends Kugel
{
    

    public Kleinekugel(double pH, double pV, double pGroesse, double pGeschwindigkeit, double pWinkel, Bildschirm pBildschirm)
    {
        super(pH, pV,  pGroesse,  pGeschwindigkeit,  pWinkel,  pBildschirm);
    }

   
    public void bewege()
    {
        if (zGroesse >0.001)
        {zGroesse = zGroesse*0.99999;}
        else 
        {zGroesse = 0;}
        super.bewege();
    }

}