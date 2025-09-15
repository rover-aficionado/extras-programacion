package extra.pkg5;

import extra.pkg5.moneda.Justa;
import extra.pkg5.moneda.Trucada;

/**
 *
 * @author rober
 */
public class Extra5 {

    public static void main(String[] args) {
        Justa justa = new Justa();
        Trucada trucada = new Trucada();
        
        if(justa.justa()){
            System.out.println("cara");
        } else {
            System.out.println("cruz");
        }
        
         if(trucada.trucada()){
            System.out.println("cara");
        } else {
            System.out.println("cruz");
        }
    }
    
}
