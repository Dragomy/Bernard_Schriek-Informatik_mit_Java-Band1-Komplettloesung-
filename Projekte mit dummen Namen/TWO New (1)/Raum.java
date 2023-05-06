import java.util.Scanner;
public abstract class Raum
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int raumO, raumW, raumN, raumS;
    protected boolean zEnde = false;
    boolean cconversation = false;

    public Raum()
    {

    }
    
    public boolean gib_cconversation(){
        return cconversation;
    }
    
    public abstract String gibBeschreibung();
    
    public void n_conversation(Scanner s){
        
    }
    
    public boolean gib_gibtcc(){
        return false;
    }
    
    public void setze_cconversation(boolean zustand){
        cconversation = zustand;
    }

    public int gibRaumN()
    {
        return raumN;
    }

    public int gibRaumS()
    {
        return raumS;
    }

    public int gibRaumW()
    {
        return raumW;
    }

    public int gibRaumO()
    {
        return raumO;
    }

    public boolean gibEnde()
    {
        return zEnde;
    }
}
