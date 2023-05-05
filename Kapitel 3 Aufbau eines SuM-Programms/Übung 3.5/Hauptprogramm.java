
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Hauptprogramm
{
    // Objekte
    Bildschirm b;
    Stift s;

    // Konstruktor
    public Hauptprogramm()
    {
        b = new Bildschirm(600,600);
        s = new Stift();
        this.fuehreAus();
    }

public void fuehreAus()
    {
        s.bewegeBis(100, 10);
        //Header
        s.schreibeText("Zeichnung gestalted von Willi Wusel");
        //Dreieck
        s.bewegeBis(10, 100);
        s.runter();
        s.bewegeUm(100);
        s.dreheUm(120);
        s.bewegeUm(100);
        s.dreheUm(120);
        s.bewegeUm(100);
        s.hoch();  
        
        //Rechteck
        s.bewegeBis(120, 11);
        s.runter();
        s.zeichneRechteck(100, 100);
        s.hoch();

        //Sechseck
        s.bewegeBis(280, 100);
        s.runter();
        s.dreheBis(0);
        s.bewegeUm(50);
        s.dreheBis(60);
        s.bewegeUm(50);
        s.dreheBis(120);
        s.bewegeUm(50);
        s.dreheBis(180);
        s.bewegeUm(50);
        s.dreheBis(240);
        s.bewegeUm(50);
        s.dreheBis(300);
        s.bewegeUm(50);
        s.hoch();
        
        //Paragramm
        s.bewegeBis(10, 200);
        s.runter();
        s.dreheBis(0);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.dreheUm(135);
        s.bewegeUm(50);
        s.hoch();
        
        //Stern
        s.bewegeBis(120, 200);
        s.runter();
        s.dreheBis(0);
        s.bewegeUm(100);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.hoch();
        
        //Kreis
        s.bewegeBis(300, 200);
        s.zeichneKreis(50);
        
        s.gibFrei();
        b.gibFrei();
    }
}