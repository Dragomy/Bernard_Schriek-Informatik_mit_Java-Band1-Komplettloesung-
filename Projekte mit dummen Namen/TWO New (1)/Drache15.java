
public class Drache15 extends Raum
{
    
    public Drache15()
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
