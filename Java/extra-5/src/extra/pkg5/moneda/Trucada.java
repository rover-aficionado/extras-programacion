package extra.pkg5.moneda;

import java.util.Random;

/**
 *
 * @author rober
 */
public class Trucada {
    public static boolean trucada(){
        Random rdn = new Random();
        int resultado = rdn.nextInt(10)+1;
        
        if(resultado<=7){
            return true;
        } 
        return false;
        
        
        
    }
}
