import sum.kern.*;

public class Pulsierkugel extends Kugel
{
    double zRadiusMin=5, zRadiusMax=50;
    boolean zWachsend;
    
    public Pulsierkugel (double pH, double pV, double pRichtung, int pGroesse,
    double pSpeed, Bildschirm pBildschirm)
    {
        super( pH,  pV,  pRichtung,  pGroesse,  pSpeed, pBildschirm);      
        zWachsend=true;
    }

    public void bewege()
    {
        this.gibStift().radiere();
        super.zeichne();
        if (zWachsend)
        {
             this.setzeGroesse( this.gibGroesse()*1.01 );
             if( this.gibGroesse()> zRadiusMax )
             {zWachsend=false;}
        }       
        else
        {
         this.setzeGroesse( this.gibGroesse()*0.99 );
             if( this.gibGroesse()< zRadiusMin )
             {zWachsend=true;}
        }        
        super.bewege();    
    }
   
 
}
