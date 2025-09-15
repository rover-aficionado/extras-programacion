package extra.pkg5.moneda;

import java.util.Random;

/**
 *
 * @author rober
 */
public class Justa {
    public static boolean justa(){
        Random rdn = new Random();
        int resultado = rdn.nextInt(10)+1;
        
        if(resultado<=5){
            return true;
        } 
        return false;
        
        
        
    }
}
