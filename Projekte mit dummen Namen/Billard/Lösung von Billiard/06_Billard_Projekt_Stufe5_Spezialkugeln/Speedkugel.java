import sum.kern.*;

public class Speedkugel extends Kugel
{  
    
    
    public Speedkugel (double pH, double pV, double pRichtung, int pGroesse,
    double pSpeed, Bildschirm pBildschirm)
    {
        super( pH,  pV,  pRichtung,  pGroesse,  pSpeed, pBildschirm);        
    }

    public void schneller()    
    { 
    if( this.gibGeschwindigkeit()<5)    
        this.setzeGeschwindigkeit( this.gibGeschwindigkeit()*1.001); 
    }
    
    public void bewege()
    { this.schneller();
      super.bewege(); }
}
