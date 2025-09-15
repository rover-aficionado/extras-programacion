package extra.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        System.out.println(palindromo());
                
    }
    
    public static boolean palindromo(){
        Scanner scn = new Scanner(System.in);
        ArrayList<String> palindromo = new ArrayList();        
        
        String palabra;
        String[] letra;

        System.out.print("dime una palabra: ");
        palabra = (String) scn.next();
        
        letra = palabra.split("");        
        
        for (String letras : letra){
            palindromo.add(letras);
        }
        
        if (palindromo.equals(palindromo.reversed())){
            return true;
        } else {
            return false;
        } 
    }
}
