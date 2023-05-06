import sum.kern.*;
import sum.werkzeuge.*;
public class Wolf_1
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    Rechner r;
    Buntstift s;
    Bildschirm b;
    Capital_BRAAAAA_in_ROT c;
    public Wolf_1(Bildschirm pb, Capital_BRAAAAA_in_ROT pc)
    {
        s = new Buntstift();
        r = new Rechner();
        b=pb;
        c = pc;
        s.setzeFarbe(Farbe.WEISS);

        s.bewegeBis(r.ganzeZufallsZahl(1,b.breite()),r.ganzeZufallsZahl(1,b.hoehe()));
        s.runter();
    }

    public void bewege(){

        double d1 = r.wurzel(r.quadrat(c.hPosition() - s.hPosition()) + r.quadrat(c.vPosition() - s.vPosition()));
        s.bewegeUm(0.1);
        double d2 = r.wurzel(r.quadrat(c.hPosition() - s.hPosition()) + r.quadrat(c.vPosition() - s.vPosition()));

        s.dreheUm(r.ganzeZufallsZahl(-10,10));
        s.bewegeUm(0.01);
        if(this.amlinkenrand()) {
            s.dreheBis(0);
        }else if(this.amrechtenrand()) {
            s.dreheBis(180);
        }else if(this.amunterenrand()){
            s.dreheBis(90);
        }else if(this.amoberenrand()){
            s.dreheBis(-90);
        }else if(d1<d2){
            s.dreheUm(90);
        }
    }
    
    public double Distanz(){
        return r.wurzel(r.quadrat(c.hPosition() - s.hPosition()) + r.quadrat(c.vPosition() - s.vPosition()));
    }

    private boolean amlinkenrand(){
        return s.hPosition() < 1;
    }

    public double hPosition(){
        return s.hPosition();
    }

    public double vPosition(){
        return s.vPosition();
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
