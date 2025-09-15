/*@author rober*/

package estra.pkg22.Utils;


public class Reloj {
    public void cronometro (int tiempoMaximo) throws InterruptedException{
        for (int i = 1; i < tiempoMaximo; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("el tiempo ha terminado");
    }
    
    public void cuentaAtras (int tiempoMaximo) throws InterruptedException{
        for (int i = tiempoMaximo; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("el tiempo ha terminado");
        
    }
}
