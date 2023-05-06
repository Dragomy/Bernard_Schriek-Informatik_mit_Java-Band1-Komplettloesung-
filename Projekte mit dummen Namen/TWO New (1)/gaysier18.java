
public class gaysier18 extends Raum
{
    
    public gaysier18()
    {
        raumN = -1;
        raumS = -1;
        raumW = 0;
        raumO = -1;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return "Du bist den Weg nach Westen gelaufen und bist in eine Höhle gefallen,"+
        "\ndu bist abgerutscht und der Eingang der Höhle liegt drei Meter über dir."+
        "\nDer einzige Ausweg den du siehst ist einen der drei Wege vor dir zu nehmen."+
        "\nWillst du richtung Norden (N), Westen (W) oder Süden (S)?";
    }
    
}
