package extra.pkg14.utils;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Numero {
    public boolean magico(int numero){        
                
        while (true) {
            
            String numeroStr = String.valueOf(numero);
            if (numero<10 && numero != 1){
                return false;
            } else {
            
                int suma=0;
                for (char c : numeroStr.toCharArray()) {
                    int digito = Character.getNumericValue(c);
                    suma += digito;
                }
                
                numero = suma;
            
            if (numero == 1){
                return true;
            }
        }
            
            
        }
        
        
        
    }
}
