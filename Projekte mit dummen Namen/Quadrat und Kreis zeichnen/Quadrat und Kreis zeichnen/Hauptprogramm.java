import sum.kern.*;

public class Hauptprogramm
{
    // Objekte
    Bildschirm b;
    Maus m;
    Tastatur t;
    Figur[] F;
    Figur AktiveFigur;
    Quadrat q1;
    Stern s_;

    // Konstruktor
    public Hauptprogramm()
    {
        b = new Bildschirm(600,600);
        m = new Maus();
        t = new Tastatur();
        F = new Figur[5];
        F[0] = new Kreis(100,100,10,Farbe.ROT);
        F[1] = new Kreis(200,100,15,Farbe.BLAU);
        F[2] = new Kreis(300,100,20,Farbe.GRUEN);
        F[3] = new Quadrat(400,100, 30, Farbe.BLAU);
        F[4] = new Stern(150,100,100,Farbe.BLAU);
        AktiveFigur = F[1];
        AktiveFigur.aktiviere();
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        do
        {
            // 1.Kugel
            if(m.istGedrueckt())
            {
                if (AktiveFigur != null)
                {
                    AktiveFigur.deaktiviere();
                    AktiveFigur = null;
                }

                for(int i = 0; i < F.length; i++){
                    if(F[i].getroffen(m.hPosition(),m.vPosition()))
                        AktiveFigur = F[i];

                }
                if(AktiveFigur !=null)
                    AktiveFigur.aktiviere();
            }

            if(t.wurdeGedrueckt())
            {
                if(AktiveFigur!=null && AktiveFigur.istAktiv())
                {
                    switch(t.zeichen())
                    {
                        case Zeichen.PFEILLINKS: AktiveFigur.bewegeUm(-5,0); break;
                        case Zeichen.PFEILRECHTS: AktiveFigur.bewegeUm(5,0); break;
                        case Zeichen.PFEILOBEN: AktiveFigur.bewegeUm(0,-5); break;
                        case Zeichen.PFEILUNTEN: AktiveFigur.bewegeUm(0,5); break;
                        case Zeichen.EINGABE: AktiveFigur.groesser(); break;
                        case '-': AktiveFigur.kleiner(); break;
                    }

                }
                t.weiter();

            }

        }while(true);
    }

}