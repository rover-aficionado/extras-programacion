/*@author rober*/

package extra.pkg24.utils;

import java.util.Random;


public class Aleatorio {
    public int numeroAleatorio(){
        Random rdn = new Random();
        int resultado=rdn.nextInt(100)+1;
        return resultado;
    }
}
