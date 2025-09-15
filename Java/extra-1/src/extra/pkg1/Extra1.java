package extra.pkg1;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        
        System.out.println("false -- NO PRIMO");
        System.out.println("true -- PRIMO");
        int numero = 45;
        //System.out.println(esPrimo(numero));
        numerosAl100();
    }
    
    // false -- no es primo 
    // true -- es primo
    public static boolean esPrimo (int numero){
        
        if (numero==1|| numero==2 || numero==3 ){
           return true;
        } else if (numero%2==0 || numero%3==0) {
            return false;
        }
        
        for (int i = 5; i<=Math.sqrt(numero); i+=6){
            if (numero%i==0){
                return false;
            }
        }
        return true;
    }

    public static void numerosAl100 (){
        for(int i=0; i<=100; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }
    
}





































