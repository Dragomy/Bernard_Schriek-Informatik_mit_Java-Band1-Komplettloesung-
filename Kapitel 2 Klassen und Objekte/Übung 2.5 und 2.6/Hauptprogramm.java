import sum.kern.*;
public class Hauptprogramm
{
    Bildschirm b;
    Stift s;
    public Hauptprogramm()
    {
        b = new Bildschirm(600,600);
        s = new Stift();
        this.fuehreAus();
    }
    
        public void fuehreAus()
    {
        //Hier beginnt übung 2.6
        
        //Dreieck
        s.bewegeBis(100, 100);
        s.runter();
        s.bewegeUm(100);
        s.dreheUm(120);
        s.bewegeUm(100);
        s.dreheUm(120);
        s.bewegeUm(100);
        s.hoch();  
        
        //Übung 2.7 
        
        //Rechteck
        s.bewegeBis(200, 200);
        s.runter();
        s.zeichneRechteck(200, 200);
        s.dreheBis(315);
        s.bewegeUm(280);
        s.bewegeUm(-280);
        s.dreheBis(0);
        s.bewegeUm(200);
        s.dreheBis(225);
        s.bewegeUm(280);
        s.hoch();

    }
}

