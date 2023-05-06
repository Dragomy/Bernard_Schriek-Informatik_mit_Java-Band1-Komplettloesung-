import sum.kern.*;
import sum.werkzeuge.*;
public class Hauptprogramm
{
    // Objekte
    Bildschirm derBildschirm;
    Kugel[] FelderMitKugel;
    Boesekugel Killer ;
    Rechner r;
    Pulsierkugel pk;
    Bremskugel br1;
    Speedkugel sk;
    Maus m;

    // Konstruktor
    public Hauptprogramm()
    {
        derBildschirm = new Bildschirm(600,600);
        FelderMitKugel = new Kugel[50000];
        Killer = new Boesekugel(100,100,10,10,0.1,derBildschirm);

        r = new Rechner();
        double x , y , richtung;
        FelderMitKugel[0] = new Pulsierkugel( 200.1 , 158.9 , -120 ,2, 0.1,derBildschirm);
        FelderMitKugel[1] = new Bremskugel( 150.1 , 254.9 , -150 ,5, 5, derBildschirm);
        FelderMitKugel[2] = new Speedkugel( 150.1 , 254.9 , -150 ,11, 0.1, derBildschirm);

        for(int i=3 ; i<FelderMitKugel.length ; i++ )
        {
            x = r.ganzeZufallsZahl(30, derBildschirm.breite()-30);
            y = r.ganzeZufallsZahl(30, derBildschirm.hoehe()-30);
            richtung = r.ganzeZufallsZahl(0, 360);
            FelderMitKugel[i] = new Kugel( x , y , richtung, 10, 2,derBildschirm);
        }
        /*k1 = new Kugel( 100.3 , 150.0 ,30 , 10, 0.2,derBildschirm);
        k2 = new Kugel( 200.1 , 258.9 , 70 ,40, 0.05,derBildschirm);
        k3 = new Kugel( 100.1 , 358.9 , -120 ,30, 0.1,derBildschirm);*/

        m = new Maus();

        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        //k1.setzeStartposition(100.0, 100.0);
        //k2.setzeStartposition(200.5, 200.5);
        do{
            for(int i=0 ; i<FelderMitKugel.length ; i++ )
            {
                if(FelderMitKugel[i] != null)
                    FelderMitKugel[i].bewege();
            }
            Killer.bewege();

            
            for(int i = 0 ; i < FelderMitKugel.length; i++){
                double x_killer = Killer.gibHPosition();
                double y_killer = Killer.gibVPosition();
                if(FelderMitKugel[i] != null){
                    double x_Kugel = FelderMitKugel[i].gibHPosition();
                    double y_Kugel = FelderMitKugel[i].gibVPosition();

                    double d = r.wurzel((x_killer - x_Kugel) * (x_killer - x_Kugel) + (y_killer - y_Kugel) * (y_killer - y_Kugel));

                    if(d < FelderMitKugel[i].gibGroesse() + Killer.gibGroesse()){
                        FelderMitKugel[i].loesche();
                        Killer.setzeGroesse(Killer.gibGroesse()+0.001);
                        
                        Killer.zeichne();
                        FelderMitKugel[i] = null;
                    }
                }
            }

            
            
            /*br1.bewege();
            pk.bewege();
            sk.bewege();*/
        }while(true);

    }
}