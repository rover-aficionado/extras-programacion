package extra.pkg7;

import java.util.Random;

/**
 *
 * @author rober
 */
public class Extra7 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long numero = System.nanoTime()%101;
            System.out.println(numero);
        }
    }
    
}
