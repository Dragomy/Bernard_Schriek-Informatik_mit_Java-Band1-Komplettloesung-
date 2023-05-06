
public class Start0 extends Raum
{
    
    public Start0()
    {
        raumN = 2;
        raumS = 3;
        raumW = -1;
        raumO = 1;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return "Du bist plötzlich in einer ungewohnten Umgebung aufgewacht. Du siehst eine Taverne neben dir in Östlicher Richtung"+
        "\nNördlich und Südlich von dir ist ein Weg.";
    }
    
}
