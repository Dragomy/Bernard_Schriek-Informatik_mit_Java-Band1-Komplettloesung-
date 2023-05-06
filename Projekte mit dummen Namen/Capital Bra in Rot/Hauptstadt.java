
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Hauptstadt
{
    // Objekte
    Bildschirm derBildschirm;
    Wolf_1 Rudel[];
    Capital_BRAAAAA_in_ROT c;

    // Konstruktor
    public Hauptstadt()
    {
        derBildschirm = new Bildschirm(600,600);
        c = new Capital_BRAAAAA_in_ROT(derBildschirm);
        derBildschirm.setzeFarbe(Farbe.DUNKELGRAU);

        Rudel = new Wolf_1[30];
        for(int i = 1; i<Rudel.length; i++){
            Rudel[i] = new Wolf_1(derBildschirm,c);
        }
        this.fuehreAus();
    }
    
    public boolean d(){
        for(int i = 1; i<Rudel.length; i++){
            if(Rudel[i].Distanz() < 3){
                return true;
            }
        }
        return false;
    }

    // Dienste
    public void fuehreAus()
    {
        do{
            for(int i = 1; i<Rudel.length; i++){
                Rudel[i].bewege();
            }
            c.bewege();
        }while(!this.d());
    }
}