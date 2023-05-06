import sum.kern.*;

public class Kugel
{
    Stift s;
    Bildschirm kenntBildschirm;

    // Attribute
    double zGroesse;
    double zGeschwindigkeit;

    // Konstruktor
    public Kugel(double pH, double pV, double pRichtung, double pGroesse,
    double pSpeed, Bildschirm pBildschirm)
    {  
        s = new Stift(); 
        s.bewegeBis(pH, pV);
        s.dreheUm(pRichtung);
        kenntBildschirm = pBildschirm;
        zGroesse = pGroesse;
        zGeschwindigkeit = pSpeed;
    }

    public Stift gibStift()
    {
        return s;    
    }

    //public void setzeStartposition( double pH, double pV)
    //{ s.bewegeBis(pH, pV); }

    public double gibGroesse() { return zGroesse; }

    public double gibGeschwindigkeit() { return zGeschwindigkeit; }

    public void setzeGroesse(double pGroesse) { zGroesse = pGroesse; }

    public void setzeGeschwindigkeit(double pGeschwindigkeit)
    { zGeschwindigkeit = pGeschwindigkeit; }

    public void dreheUm180()
    { s.dreheUm(180); }

    public double gibHPosition()
    { return s.hPosition(); }

    public double gibVPosition()
    { return s.vPosition(); }    

    public void zeichne() { s.zeichneKreis(zGroesse); }

    public void bewege() 
    {  
        s.radiere(); // Starte den Radiermodus
        this.zeichne(); //Zeichne mit dem Ratzefummel den Kreis
        if( this.amLinkenRand() || this.amRechtenRand() ) //Abprallen am Rand
        { s.dreheBis(180-s.winkel()); }
        if( this.amUnterenRand() || this.amOberenRand() ) //Abprallen am Rand
        { s.dreheBis(360-s.winkel()); }

        s.bewegeUm(zGeschwindigkeit); //Bewegung im Radiermodus
        s.normal(); // Normalmodus
        this.zeichne();  // Kreis wird wieder gezeichnet.
    }

    public void loesche()
    {
        s.radiere(); // Starte den Radiermodus
        this.zeichne(); //Zeichne mit dem Ratzefummel den Kreis
        s.normal();
    }

    public boolean amLinkenRand()
    { return s.hPosition()<0+zGroesse+2; }

    public boolean amRechtenRand()
    { return s.hPosition()>kenntBildschirm.breite()-zGroesse-2; }   

    public boolean amOberenRand()
    { return s.vPosition()<0+zGroesse+2; }

    public boolean amUnterenRand()
    { return s.vPosition()>kenntBildschirm.hoehe()-zGroesse-2; }   

    public void gibFrei() { s.gibFrei(); }
}
