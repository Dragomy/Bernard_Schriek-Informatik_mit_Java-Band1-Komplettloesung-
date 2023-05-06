import sum.kern.*; import sum.werkzeuge.*;

public class Schiebeding 
{
    // double Position;
    Buntstift s;
    Maus m;
    public Schiebeding()
    {
        s = new Buntstift();
        s.setzeFuellmuster(Muster.GEFUELLT);
        m = new Maus();
    }

    public double DingPosition() 
    {return s.hPosition();}

    public void zeichnen() 
    {
        s.radiere();
        s.zeichneRechteck(150,30);
        s.normal();

        s.bewegeBis(m.hPosition() , 920);      
        s.zeichneRechteck(150,30);

        //Position = m.hPosition();
        //s.bewegeBis(Position , 920);

    }
}
