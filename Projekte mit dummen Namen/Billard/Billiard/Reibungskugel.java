import sum.kern.*;
public class Reibungskugel extends Kugel
{
    

    public Reibungskugel(double pH, double pV, double pGroesse, double pGeschwindigkeit, double pWinkel, Bildschirm pBildschirm)
    {
        super(pH, pV,  pGroesse,  pGeschwindigkeit,  pWinkel,  pBildschirm);
    }

   
    public void bewege()
    {
        if (zGeschwindigkeit >0.001)
        {zGeschwindigkeit = zGeschwindigkeit*0.99999;}
        else 
        {zGeschwindigkeit = 0;}
        super.bewege();
    }

}

