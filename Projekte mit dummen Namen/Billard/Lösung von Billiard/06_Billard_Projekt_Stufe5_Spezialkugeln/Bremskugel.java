import sum.kern.*;

public class Bremskugel extends Kugel
{  
    
    
    public Bremskugel(double pH, double pV, double pRichtung, int pGroesse,
    double pSpeed, Bildschirm pBildschirm)
    {
        super( pH,  pV,  pRichtung,  pGroesse,  pSpeed, pBildschirm);        
    }

    public void bremse()    
    { this.setzeGeschwindigkeit( this.gibGeschwindigkeit()-0.999); }
    
    public void bewege()
    { this.bremse();
      super.bewege(); }
}
