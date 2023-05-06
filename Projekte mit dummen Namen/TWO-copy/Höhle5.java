
public class Höhle5 extends Raum
{
    
    public Höhle5()
    {
        raumN = -1;
        raumS = -1;
        raumW = 0;
        raumO = -1;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return "Du bist an der Taverne angekommen!"+
        "\nNeben dir ist eine Taverne (O). Sonst geh mal nach Norden (N) oder Süden (S)";
    }
    
}
