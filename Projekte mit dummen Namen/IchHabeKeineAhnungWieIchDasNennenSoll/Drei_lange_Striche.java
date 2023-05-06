
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Drei_lange_Striche
{
    // Objekte
    Bildschirm derBildschirm;
    Stift s;

    // Konstruktor
    public Drei_lange_Striche()
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
}}