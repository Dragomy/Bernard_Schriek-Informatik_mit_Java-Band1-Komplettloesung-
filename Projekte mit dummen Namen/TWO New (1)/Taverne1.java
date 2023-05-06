import java.util.Scanner;
import java.io.*;
public class Taverne1 extends Raum
{
    String eingabe;
    public Taverne1()
    {
        raumN = 0;
        raumS = 0;
        raumW = 0;
        raumO = 0;
        zEnde = false;
        cconversation = true;
    }

    public String gibBeschreibung()
    {
        return "Du bist an der Taverne angekommen!"+
        "\nDort sitzen einige Leute. Was willst du machen?"+ "\ngebe etwas ein um fortzufahren";
    }

    public void n_conversation(Scanner s){
        
        do{
            System.out.println("\nDie Taverne ist voll. Es sitzen einige Männer an den Tischen. Was willst du machen?"+
                "\n 1) Mit dem Mann mit den braunen Schuhen und Schwarzen Mantel reden"+
                "\n 2) Mit der Bedienung reden"+
                "\n 3) Mit dem Mann mit den Braunen Hut, Braunen Umhang und schwarzen Stiefeln reden"+
                "\n 4) Abbrechen");
            eingabe = s.nextLine();
            if(eingabe.equals("1")){
                System.out.println("Du gehst zu dem Mann hin und sprichtst ihn an."+
                    "\nNa wer bist du denn? Hier so weit von zuhause weg. Hast du deine Mama verloren? Na los! Verschwinde..."+
                    "\n\n");

            }else if(eingabe.equals("2")){
                System.out.println("Oh Hallo! Na wer bist du denn? Dich habe ich hier noch nie gesehen! Willst du dich nicht hinsetzen?"+
                    "\nHast du lusst auf ein Bier? \n\n"+
                    "1) Ja gerne!"+
                    "\n 2) Was ist das hier für ein Ort?"+
                    "\n 3) Abrechen");

                eingabe = s.nextLine();
                do{
                    eingabe = s.nextLine();
                    if(eingabe.equals("1")){
                        System.out.println("Moment man. Bist du überhaupt schon 16? Dann gibt es doch kein Bier!");
                    }else if(eingabe.equals("2")){
                        System.out.println("Das ist eine kleine Stadt am Rande von Land Hiorita. Hier kommen regelmäßig Fremde auf der Durchreise her."+
                            "\nDadurch, dass das hier die letzte Taverne vor dem Gebierge ist, sind wir immer gut Besucht.");
                    }else if(eingabe.equals("3")){
                        break;
                    }
                    eingabe = "l";
                }while(true);
            }else if(eingabe.equals("3")){
                System.out.println("Guten Tag junger Herr! Dich habe ich ja hier noch nie gesehen! Setz dich ruhig."+
                    "\nBist du auch auf der Durchreise? Ich bin auf dem Weg nach Schuntero. Das liegt in Süden hinter den Bergen."+
                    "\nIch habe gehört, dass es dort viele Höhlen gibt, welche teilweise ihren Eingang direkt auf dem Gehweg haben."+
                    "\nDu solltest lieber vorsichtig sein, wenn du durch daas Gebirge gehst.");
            }else if(eingabe.equals("4")){
                break;
            }

        }while(true);
        System.out.println("gehe in eine beliebige Richtung um fortzufahren");
    }
    
    
    public boolean gib_gibtcc(){
        return true;
    }

}
