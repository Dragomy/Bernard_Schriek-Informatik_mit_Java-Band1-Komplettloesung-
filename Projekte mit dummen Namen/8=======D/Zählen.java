
import sum.kern.*;
/**
 * @author 
 * @version 
 */
public class Zählen
{
    // Konstruktor
    public Zählen()
    {
        this.summe1(100);
        this.Aufgabe3("Ich habe deine Mutter gefickt","Mutter");
        this.Aufgabe3("Und deine Mutter hat es immer gewusst, aus dir wird nichts mehr -Sido","Du Hurenhsohn");
    }

    // Dienste
    public void summe1(int c)
    {
        int sum = 0;
        for(int i = 1; i<=c; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void stringy(String s, char z){
        int zeichen = 0;
        for(int x = 0; x >= s.length(); x++){
            if(s.charAt(x)==z){
                zeichen = zeichen +1;
            }
        }
        System.out.println("Der Buchstabe " +z+ " kommt " +zeichen+ " vor" );
    }

    public void Aufgabe3(String s1, String s2){
        int lLaengevons1=s1.length();
        int lLaengevons2=s2.length();
        int lRichtig = 0;

        for(int i=0; i<lLaengevons1 - lLaengevons2; i++ ){
            for(int j = 0; j<lLaengevons2; j++){
                if(s1.charAt(i+j) == s2.charAt(j)){
                    lRichtig++;
                }else{
                    lRichtig = 0;
                }
            }
            if(lRichtig == lLaengevons2){
                System.out.println("Ist enthalten");             
                return;
            }
        }
        System.out.println("Ist NICHT enthalten");   

    }

    public void Aufgabe4(String s1){

    }
}

    
    
    
    

