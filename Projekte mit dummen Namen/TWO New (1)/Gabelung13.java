
public class Gabelung13 extends Raum
{
    
    public Gabelung13()
    {
        raumN = -1;
        raumS = -1;
        raumW = 4;
        raumO = -1;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return ""+
        "\nNeben dir ist eine Taverne (O). Sonst geh mal nach Norden (N) oder Süden (S)";
    }
    
}
