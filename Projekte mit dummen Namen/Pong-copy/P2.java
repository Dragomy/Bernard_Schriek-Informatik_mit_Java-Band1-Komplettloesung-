import sum.kern.*;
/**
 * Beschreiben Sie hier die Klasse Balken.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class P2
{
    Buntstift s;
    Bildschirm kenntBildschirm;
    Tastatur kenntTastatur;

    public P2(Bildschirm pBildschirm, Tastatur pTastatur){
        s = new Buntstift();
        kenntBildschirm = pBildschirm;
        s.bewegeBis(kenntBildschirm.breite()-40,50);
        kenntTastatur = pTastatur;
    }

    public void bewege(){
        this.loesche();
        if(kenntTastatur.wurdeGedrueckt()){
            if(kenntTastatur.zeichen() == 'w'){
                s.bewegeBis(kenntBildschirm.breite() - 40, s.vPosition()-10);
            }
            if(kenntTastatur.zeichen() == 's'){
                s.bewegeBis(kenntBildschirm.breite() - 40, s.vPosition()+10);
                System.out.println("runter");
            }
            kenntTastatur.weiter();
        }
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
