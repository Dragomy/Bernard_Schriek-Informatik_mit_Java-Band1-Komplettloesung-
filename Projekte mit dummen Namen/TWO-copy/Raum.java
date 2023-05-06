public abstract class Raum
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int raumO, raumW, raumN, raumS;
    protected boolean zEnde = false;

    public Raum()
    {

    }
    
    public abstract String gibBeschreibung();

    public int gibRaumN()
    {
        return raumN;
    }

    public int gibRaumS()
    {
        return raumS;
    }

    public int gibRaumW()
    {
        return raumW;
    }

    public int gibRaumO()
    {
        return raumO;
    }

    public boolean gibEnde()
    {
        return zEnde;
    }
}
