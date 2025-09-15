package extra.pkg10;

import java.util.Scanner;
import utils.Traductor;

/**
 *
 * @author rober
 */
public class Extra10 {

    public static void main(String[] args) {
        Traductor traductor = new Traductor();
        Scanner scn = new Scanner(System.in);
        System.out.println("dime una frase");
        String frase = scn.nextLine();
        System.out.println(traductor.morse(frase));
        
    }
    
}
