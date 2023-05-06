import sum.kern.*;
import sum.werkzeuge.*;
/**
 * Beschreiben Sie hier die Klasse Capital_BRAAAAA_in_ROT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Capital_BRAAAAA_in_ROT
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    Rechner r;
    Buntstift s;
    Bildschirm b;
    public Capital_BRAAAAA_in_ROT(Bildschirm pb)
    {
        s = new Buntstift();
        r = new Rechner();
        
        b=pb;

        s.bewegeBis(r.ganzeZufallsZahl(1,b.breite()),r.ganzeZufallsZahl(1,b.hoehe()));
        s.runter();
        s.setzeFarbe(Farbe.ROT);
        s.zeichneKreis(5);
    }

    public void bewege(){
        s.bewegeUm(2);
        if(this.amlinkenrand()) {
            s.dreheBis(0);
        }else if(this.amrechtenrand()) {
            s.dreheBis(180);
        }else if(this.amunterenrand()){
            s.dreheBis(90);
        }else if(this.amoberenrand()){
            s.dreheBis(-90);
        }else{
            s.dreheUm(r.ganzeZufallsZahl(-90,90));
        }
    }

    public double hPosition(){
        return s.hPosition();
    }

    public double vPosition(){
        return s.vPosition();
    }

    private boolean amlinkenrand(){
        return s.hPosition() < 1;
    }

    private boolean amrechtenrand(){
        return s.hPosition() > b.breite();
    }

    private boolean amoberenrand(){
        return s.vPosition() < 1;
    }

    private boolean amunterenrand(){
        return s.vPosition() > b.hoehe();
    }
}
