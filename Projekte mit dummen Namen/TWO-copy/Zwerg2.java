
public class Zwerg2 extends Raum
{
    
    public Zwerg2()
    {
        raumN = -1;
        raumS = -1;
        raumW = -1;
        raumO = 0;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return "Du bist am Zwerg angekommen"+
        "\nNeben dir ist eine CopyOfTaverne (O). Sonst geh mal nach Norden (N) oder Süden (S)";
    }
    
}
