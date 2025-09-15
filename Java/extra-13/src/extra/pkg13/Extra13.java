package extra.pkg13;

import java.util.Scanner;
import utils.CuentaLetras;

/**
 *
 * @author rober
 */
public class Extra13 {
    public static void main(String[] args) {
        CuentaLetras cl = new CuentaLetras();
        Scanner scn = new Scanner(System.in);
        String texto;
        
        System.out.println("dime un texto:");
        texto=scn.nextLine();
        
        System.out.println(cl.vocales(texto));
        System.out.println(cl.consonantes(texto));
    }
    
}
