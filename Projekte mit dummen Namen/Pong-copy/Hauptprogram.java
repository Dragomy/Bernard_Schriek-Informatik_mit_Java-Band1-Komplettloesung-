
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Hauptprogram
{
    // Objekte
    Bildschirm derBildschirm;
    Buntstift s;
    Balken b;
    Maus m;
    Kugel k;
    int r = 0;
    P2 p2;
    Tastatur t;

    // Konstruktor
    public Hauptprogram()
    {
        derBildschirm = new Bildschirm(600,600);
        derBildschirm.setzeFarbe(Farbe.SCHWARZ);
        m = new Maus();
        s = new Buntstift();
        b = new Balken(derBildschirm, m);
        t = new Tastatur();
        p2 = new P2(derBildschirm,t);

        k = new Kugel(50,50,1,10,10,derBildschirm,b,p2);
        
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        do{
            s.bewegeBis(derBildschirm.breite()/2,0);
            s.setzeFarbe(Farbe.WEISS);
            s.dreheBis(-90);
            r = 0;
            for(int x = 0; x <= derBildschirm.hoehe(); x++){
                r = r+1;
                s.bewegeUm(1);
                if(r < 20){
                    s.runter();
                }else{
                    s.hoch();
                }
                if(r > 40){
                    r = 0;
                }
                
            }
            s.hoch();
            b.bewege();
            k.bewege();
            p2.bewege();
        }while(k.hPosition() > 2 && k.hPosition() < derBildschirm.breite()-2);
        
        derBildschirm.loescheAlles();
        s.bewegeBis(derBildschirm.breite()/2-140,derBildschirm.hoehe()/2 +20);
        s.setzeSchriftGroesse(50);
        if(k.hPosition() < 3){
            s.schreibeText("P1 Verloren");
        }else{
            s.schreibeText("P2 Verloren");
        }
        
    }
}