
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Dreieck
{
    // Objekte
    Bildschirm derBildschirm;
    Stift meinStift;

    // Konstruktor
    public Dreieck()
    {
        derBildschirm = new Bildschirm(600,600);
        meinStift = new Stift();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        meinStift.bewegeBis(300, 300);
        meinStift.runter();
        meinStift.bewegeUm(50);
        meinStift.dreheUm(120);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(120);
        meinStift.bewegeUm(50);
        meinStift.hoch();
        // Aufraeumen
        meinStift.gibFrei();
    }
}