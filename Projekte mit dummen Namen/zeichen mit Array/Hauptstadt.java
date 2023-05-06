
import sum.kern.*;
import java.util.*;
/**
 * @author 
 * @version 
 */
public class Hauptstadt
{
    // Objekte
    Bildschirm derBildschirm;
    Maus m;
    Kreis k[];
    Tastatur t;

    // Konstruktor
    public Hauptstadt()
    {
        derBildschirm = new Bildschirm(600,600);
        m = new Maus();
        t = new Tastatur();
        k = new Kreis[10];

        for(int i = 0; i<k.length;i++){
            k[i] = new Kreis(m, 100+i*20, 100 + i*20, 10, 3, t);
        }

        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        do
        { 

            if(m.istGedrueckt())
            {
                for(int i = 0; i<k.length;i++){
                    if(k[i]. getroffen(m.hPosition(),m.vPosition()))
                        k[i].aktiviere();
                    else
                        k[i].deaktiviere();
                }
            }
            
            for(int i = 0; i<k.length;i++){
                k[i].zeichne();
            }

            if(t.wurdeGedrueckt())
            {
                for(int i = 0; i<k.length;i++){
                    if(k[i].istAktiv() )
                    { 
                        switch(t.zeichen())
                        {
                            case Zeichen.PFEILLINKS: k[i].bewegeUm(-5, 0); break; 
                            case Zeichen.PFEILRECHTS: k[i].bewegeUm(5, 0); break; 
                            case Zeichen.PFEILOBEN: k[i].bewegeUm(0, -5); break; 
                            case Zeichen.PFEILUNTEN: k[i]. bewegeUm(0, 5); break;
                        }
                    } 
                }
                t.weiter();
            }

        }while(true);
    }
}