import sum.kern.*;

public class Figurstift extends Buntstift
{

    public Figurstift()
    {
    }

    public void zeichneRing()
    {
        this.zeichneKreis(15);
        this.zeichneKreis(25);
    }

    public void zeichneQuadrat(double Seitenlaenge)
    {
        zeichneRechteck(Seitenlaenge, Seitenlaenge);
        this.schreibeText("Flaecheninhalt="+ Seitenlaenge* Seitenlaenge);
    }

    public void summeDerErstenNZahlen( int n )
    {
        int summe = 0;
        for(int i=1; i<=n ; i++ )
        {
            summe = i+summe ;
        }

        this.schreibeText("Die Summe lautet = " +summe);
    }

    public void summeZwischenAundB( int a, int b )
    {
        int summe = 0;
        for(int i=a; i<=b ; i++ )
        {
            summe = i+summe ;
        }
        
        this.schreibeText("Die Summe lautet = " +summe);
    }   

    public void FlaecheninhaltDreieck(double g, double h )
    {
        double A = g*h / 2;
        this.schreibeText("Flaecheninhalt = " + A); 
    }
    
    public void KreisInformationen(double r )
    {
        this.zeichneKreis(r);
        double A = 3.141*r*r;
        this.schreibeText("Flaecheninhalt =" + A);
        this.bewegeUm(10);
        double U = 2*3.141*r;
        this.schreibeText("Umfang =" + U);
    }
    
    public void RingInformationen(double r1 , double r2)
    {
        this.zeichneKreis(r1);
        this.zeichneKreis(r2);
        double A1 = 3.141*r1*r1;
        double A2 = 3.141*r2*r2;
        double A; 
        if (A1<A2) {A = A2-A1;}
        else {A=A1-A2;} 
        this.schreibeText("Flaecheninhalt ="+A);
    }
}