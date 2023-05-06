
public class weg3 extends Raum
{
    
    public weg3()
    {
        raumN = 0;
        raumS = 4;
        raumW = -1;
        raumO = -1;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return "Du bist auf einem Weg voller Blumen. Neben dir ist Wasser "+
        "\nIm Norden sehst du einen Berg und du entscheideest dich dort hin zu gehen.";
    }
    
}
