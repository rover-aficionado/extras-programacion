package extra5;

import java.util.Scanner;
import utils.Cifrado;

/**
 *
 * @author rober
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Cifrado cifrado = new Cifrado();
        String frase=null;
        int numeroCodigo;
        
        System.out.println("dime una frase: ");
        frase = scn.nextLine();
        System.out.println("dime un número");
        numeroCodigo=Integer.parseInt(scn.nextLine());
        
        System.out.println(cifrado.cesar(frase, numeroCodigo));
        
        
    }
    
}
