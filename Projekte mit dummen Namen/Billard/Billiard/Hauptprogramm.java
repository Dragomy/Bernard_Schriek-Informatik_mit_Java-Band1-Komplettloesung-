
import sum.kern.*;

public class Hauptprogramm
{
    // Objekte
    Bildschirm derBildschirm;
    Kugel k1, k2, k3;
    Reibungskugel rk1;
    Kleinekugel kk1;
    Speedykugel sk1;
    Farbkugel fk1;
    Riesenkugel Rk1;
    Pulsierkugel pk1;
    // Konstruktor
    public Hauptprogramm()
    {
        derBildschirm = new Bildschirm(600,600);
        k1 = new Kugel(100, 100, 5, 0.01, 10, derBildschirm);
        k2 = new Kugel(100, 100, 20, 0.1, 20, derBildschirm);
        k3 = new Kugel(100, 100, 30, 1, 120, derBildschirm);
        pk1 = new Pulsierkugel(100, 100, 19, 0.1, 40, derBildschirm);
        kk1 = new Kleinekugel(100, 100, 50, 0.002, 50, derBildschirm);
        rk1 = new Reibungskugel(100, 100, 10, 1, 60, derBildschirm);
        sk1 = new Speedykugel(100, 100, 20, 0.1, 75, derBildschirm);
        fk1 = new Farbkugel(100, 100, 15, 0.1, 85, derBildschirm, 1);
        Rk1 = new Riesenkugel(100, 100, 1, 0.01, 90, derBildschirm);
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        do{
            k1.bewege();
            k2.bewege();
            k3.bewege();
            pk1.bewege();
            kk1.bewege();
            rk1.bewege();
            sk1.bewege();
            fk1.bewege();
            Rk1.bewege();
        }while(true);
    }
}