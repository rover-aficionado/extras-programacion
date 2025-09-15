
package extra.pkg11;

import java.util.Scanner;
import utils.Comprueba;

/**
 *
 * @author rober
 */
public class Extra11 {

    public static void main(String[] args) {
        Comprueba comprueba = new Comprueba();
        Scanner scn = new Scanner(System.in);
        String texto;
        
        System.out.println("dime un texto");
        texto = scn.nextLine();
        
        if(comprueba.simbolos(texto)){
            System.out.println("todos los símbolos perfectamente cerrados");
        } else {
            System.out.println("faltan símbolos");
        }
    }
    
}
