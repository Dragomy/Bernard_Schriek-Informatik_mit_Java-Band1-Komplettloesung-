
public class Start0 extends Raum
{
    
    public Start0()
    {
        raumN = 3;
        raumS = -1;
        raumW = 5;
        raumO = 6;
        zEnde = false;
    }

    public String gibBeschreibung()
    {
        return "Du bist den Weg entlang gegangen und in eine Höhle gefallen"+
        "\nDu kannst nicht zurück gehen und vor dir liegt ein Weg mit drei Gabelungen"+
        "\nWillst du nach Osten, Westen oder Süden gehen?";
    }
    
}
