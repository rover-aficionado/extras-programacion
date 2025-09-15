package extra.pkg15;

import java.util.Scanner;
import utils.Traductor;

/**
 *
 * @author rober
 */
public class Extra15 {
        
    public static void main(String[] args) {
       Traductor traductor = new Traductor();
       Scanner scn = new Scanner(System.in);
       String numero;
       
        System.out.println("dime un numero en numeros romanos");
        numero=scn.nextLine();
        
        System.out.println(traductor.deRomanosAArabes(numero.toUpperCase()));
       
    }
    
}
