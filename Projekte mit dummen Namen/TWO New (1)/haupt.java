import java.util.*;
public class haupt
{
    Scanner s;
    Raum[] r = new Raum[7];
    Raum currentroom;
    int croom;
    String zEingabe;

    public haupt()
    {
        s = new Scanner(System.in);
        r[0] = new Start0();
        r[1] = new Taverne1();
        r[2] = new Zwerg2();
        r[3] = new weg3();
        r[4] = new Bergauf4();
        r[5] = new Höhle5();
        r[6] = new bergauf6();
        currentroom = r[0];
        croom = 0;
        this.spielen();

    }

    public void spielen(){
        do{
            System.out.println(r[croom].gibBeschreibung());
            zEingabe = s.nextLine();
            if(zEingabe.equals("N") || zEingabe.equals("n") && currentroom.gibRaumN() > -1 ){
                croom = currentroom.gibRaumN();
                currentroom = r[croom];
            }
            if(zEingabe.equals("O") || zEingabe.equals("o") && currentroom.gibRaumN() > -1 ){
                croom = currentroom.gibRaumO();
                currentroom = r[croom];
            }
            if(zEingabe.equals("S") || zEingabe.equals("s") && currentroom.gibRaumN() > -1 ){
                croom = currentroom.gibRaumS();
                currentroom = r[croom];
            }
            if(zEingabe.equals("W") || zEingabe.equals("w") && currentroom.gibRaumN() > -1 ){
                croom = currentroom.gibRaumW();
                currentroom = r[croom];
            }
            
            if(r[croom].gib_cconversation()){
                r[croom].n_conversation(s);
            }
        }while(true);
    }

}
