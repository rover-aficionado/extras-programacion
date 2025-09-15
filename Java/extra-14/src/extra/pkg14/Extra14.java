package extra.pkg14;

import extra.pkg14.utils.Numero;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Extra14 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       Numero numero = new Numero();
       
        System.out.println("dime un numero");
        int numeromagico = Integer.parseInt(scn.nextLine());
        
        if (numero.magico(numeromagico)) {
            System.out.println("es un numero mágico");
        } else {
            System.out.println("no es un numero mágico");
        }
        
    }
    
}
