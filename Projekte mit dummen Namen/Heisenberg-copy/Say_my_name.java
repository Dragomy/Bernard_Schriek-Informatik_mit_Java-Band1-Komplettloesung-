
import java.util.*;

public class Say_my_name
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Scanner Scanner;

    String zEingabe;
    String zEingabe2;
    double z1;
    double z2;
    /**
     * Konstruktor für Objekte der Klasse Say_my_name
     */
    public Say_my_name()
    {
        Scanner = new Scanner(System.in);

        do{
            System.out.println("SAY MY NAME");
            zEingabe = Scanner.nextLine();
            if(zEingabe.equals("Heisenberg")){
                System.out.print("You're god dame right");
                break;
            }else{
                System.out.print("I SAID SAY ");
            }
        }while(true);
        
        System.out.print(". Here is the calc:");
        System.out.print("");
        System.out.print("Welcome to the clac. Plese give me a number");
        z1 = Scanner.nextDouble();
        System.out.print("Thank you! Please give me another numer. ┌∩┐(◣_◢)┌∩┐");
        z2 = Scanner.nextDouble();
        System.out.print("So what do you want to do with those? (+, /, -, *)");
        zEingabe2 = Scanner.next();
        if(zEingabe2.equals("+")){
            System.out.print( "You're numer is: "+ (z1+z2));
        }else if(zEingabe2.equals("-")){
            System.out.print( "You're numer is: "+ (z1-z2));
        }else if(zEingabe2.equals("*")){
            System.out.print( "You're numer is: "+ (z1*z2));
        }else if(zEingabe2.equals("/")){
            System.out.print( "You're numer is: " + (z1/z2));
        }
        System.out.print(" So fuck you");
        
        
    }
}
