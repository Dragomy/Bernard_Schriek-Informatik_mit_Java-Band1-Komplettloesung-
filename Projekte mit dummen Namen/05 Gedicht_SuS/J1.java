import sum.werkzeuge.*;
public class J1
{
    String[] G;
    Rechner r;
    public J1()        
    {
        //Loesung:
        this.einlesen();
        r = new Rechner();
        int position = r.ganzeZufallsZahl(0, G.length/2);
        int schritte;
        int aBW;
        int wordsleft;
        
        do{
           aBW = G[position].length();
           wordsleft = G.length - G[position].length();
           if(position + G[position].length() < G.length){
           position = position + G[position].length();
        }else{break;}
        }while(G[aBW].length() < wordsleft);
        
        System.out.println(G[position]);
    }

    /* Zusatz Aufgaben:
     * 1. Schreibe eine Methode, die das längste Wort bestimmt.
     * 2. Schreibe eine Methode, die das kürzeste Wort bestimmt.
     * 3. Schreibe eine Methode, die überprüft, ob alle 43 Endwörter gleich sind.
     */

    public void printLaengstesWort()
    {
     for(;;)
     {
     
     }
    }
    
    
    public void einlesen()
    {
        G = new String[90];
        G[0] = "Es";
        G[1] = "gingen";
        G[2] = "zwei";
        G[3] = "Parallelen";
        G[4] = "ins";
        G[5] = "Endlose";
        G[6] = "hinaus";
        G[7] = "zwei";
        G[8] = "kerzengerade";
        G[9] = "Seelen";
        G[10] = "und";
        G[11] = "aus";
        G[12] = "solidem";
        G[13] = "Haus";
        G[14] = "Sie";
        G[15] = "wollten";
        G[16] = "sich";
        G[17] = "nicht";
        G[18] = "schneiden";
        G[19] = "bis";
        G[20] = "an";
        G[21] = "ihr";
        G[22] = "seliges";
        G[23] = "Grab";
        G[24] = "Das";
        G[25] = "war";
        G[26] = "nun";
        G[27] = "einmal";
        G[28] = "der";
        G[29] = "beiden";
        G[30] = "geheimer";
        G[31] = "Stolz";
        G[32] = "und";
        G[33] = "Stab";
        G[34] = "Doch";
        G[35] = "als";
        G[36] = "sie";
        G[37] = "zehn";
        G[38] = "Lichtjahre";
        G[39] = "gewandert";
        G[40] = "neben";
        G[41] = "sich";
        G[42] = "hin";
        G[43] = "da";
        G[44] = "wards";
        G[45] = "dem";
        G[46] = "einsamen";
        G[47] = "Paare";
        G[48] = "nicht";
        G[49] = "irdisch";
        G[50] = "mehr";
        G[51] = "zu";
        G[52] = "Sinn";
        G[53] = "Warn";
        G[54] = "sie";
        G[55] = "noch";
        G[56] = "Parallelen";
        G[57] = "Sie";
        G[58] = "wußtens";
        G[59] = "selber";
        G[60] = "nicht";
        G[61] = "sie";
        G[62] = "flossen";
        G[63] = "nur";
        G[64] = "wie";
        G[65] = "zwei";
        G[66] = "Seelen";
        G[67] = "zusammen";
        G[68] = "durch";
        G[69] = "ewiges";
        G[70] = "Licht";
        G[71] = "Das";
        G[72] = "ewige";
        G[73] = "Licht";
        G[74] = "durchdrang";
        G[75] = "sie";
        G[76] = "da";
        G[77] = "wurden";
        G[78] = "sie";
        G[79] = "ein";
        G[80] = "in";
        G[81] = "ihm";
        G[82] = "die";
        G[83] = "Ewigkeit";
        G[84] = "verschlang";
        G[85] = "sie";
        G[86] = "als";
        G[87] = "wie";
        G[88] = "zwei";
        G[89] = "Seraphim";
    }
}
