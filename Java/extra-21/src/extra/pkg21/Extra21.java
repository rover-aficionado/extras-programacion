package extra.pkg21;

import extra.pkg21.utils.Kaprekar;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Extra21 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Kaprekar numero = new Kaprekar();
        
        System.out.println("dime un numero");
        int numeroVerificar = Integer.parseInt(scn.nextLine());
        
        if(numero.isKaprekar(numeroVerificar)){
            System.out.println("es un numero de kaprekar");
        } else {
            System.out.println("no es un numero de kaprekar");
        }
    }
    
}
