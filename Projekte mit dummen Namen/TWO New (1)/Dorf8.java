
public class Dorf8 extends Raum
{
    
    public Dorf8()
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
