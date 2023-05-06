
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Alles
{
    // Objekte
    Bildschirm derBildschirm;
    Stift s;

    // Konstruktor
    public Alles()
    {
        derBildschirm = new Bildschirm(600,600);
        s = new Stift();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
         s.bewegeBis(100, 100);
        s.runter();
        for(int i=0; i<8 ;i++ )
        {
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(45);
        
    }
    //Pentagramm
    s.hoch();
    s.bewegeBis(100, 200);
        s.runter();
        for(int i=0;i<8 ; i++)
        {
            s.bewegeUm(200);
            s.dreheUm(-144);
        }
        //Fuenfeck
    s.hoch();
    s.bewgeBis(200, 100);
    s.runter();
        for(int i=0; i<8 ;i++ )
        {
        s.bewegeUm(50);
        s.dreheUm(72);
    }
}