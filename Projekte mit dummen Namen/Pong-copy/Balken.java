import sum.kern.*;
/**
 * Beschreiben Sie hier die Klasse Balken.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Balken
{
    Buntstift s;
    Bildschirm kenntBildschirm;
    Maus kenntMaus;
    
    
    public Balken(Bildschirm pBildschirm, Maus pMaus){
        s = new Buntstift();
        kenntBildschirm = pBildschirm;
        s.bewegeBis(0+30,50);
        kenntMaus = pMaus;
    }
    
    
    public void bewege(){
        this.loesche();
        s.bewegeBis(30,kenntMaus.vPosition());
        this.zeichne();
    }
    
    public void loesche(){
        s.radiere();
        this.zeichne();
        s.normal();
    }
    
    public void zeichne(){
        s.setzeFuellMuster(Muster.GEFUELLT);
        s.setzeFarbe(Farbe.WEISS);
        s.zeichneRechteck(10,60);
    }
    
    public double gibStifth(){
        return s.hPosition();
    }
    
    
    public double gibStiftv(){
        return s.vPosition();
    }
    
    
    
}
