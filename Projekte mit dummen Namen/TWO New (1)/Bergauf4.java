
public class Bergauf4 extends Raum
{
    
    public Bergauf4()
    {
        raumN = 3;
        raumS = -1;
        raumW = 5;
        raumO = 6;
        zEnde = false;
        
        Höhle5 d;
    }

    public String gibBeschreibung()
    {
        return "Du bist am Berg angekommen ung gehst den Trampelpfad hinauf,"+
        "\nwelcher über den Berg führt. Nun stehst du an einer Weggabelung,"+
        "\nwelche nach Osten (O) und nach Westen (W) führt. Wo gehst du entlang?";
    }
    
}
