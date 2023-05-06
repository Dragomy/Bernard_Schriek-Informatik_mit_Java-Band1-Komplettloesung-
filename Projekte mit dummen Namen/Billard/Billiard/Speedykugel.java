
import sum.kern.*;
public class Speedykugel extends Kugel
{
    

    public Speedykugel(double pH, double pV, double pGroesse, double pGeschwindigkeit, double pWinkel, Bildschirm pBildschirm)
    {
        super(pH, pV,  pGroesse,  pGeschwindigkeit,  pWinkel,  pBildschirm);
    }

   
    public void bewege()
    {
        if (zGeschwindigkeit <10)
        {zGeschwindigkeit = zGeschwindigkeit*0.99999;}
        else 
        {zGeschwindigkeit = 0;}
        super.bewege();
    }

}