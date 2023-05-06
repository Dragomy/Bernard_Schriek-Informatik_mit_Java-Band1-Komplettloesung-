import sum.kern.*; import sum.werkzeuge.*;

public class Schiebeding2
{
    // double Position;
    Buntstift s;
    Maus m;
    public Schiebeding2()
    {
        s = new Buntstift();
        s.setzeFuellmuster(Muster.GEFUELLT);
        m = new Maus();
    }

    public double DingPosition() 
    {return s.hPosition();}

    public void zeichnen2() 
    {
        s.radiere();
        s.zeichneRechteck(150,30);
        s.normal();

        s.bewegeBis(m.hPosition() , 0);      
        s.zeichneRechteck(150,30);

        //Position = m.hPosition();
        //s.bewegeBis(Position , 920);

    }
}
