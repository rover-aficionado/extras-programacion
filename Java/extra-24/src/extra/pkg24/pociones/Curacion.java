/*@author rober*/

package extra.pkg24.pociones;

import extra.pkg24.personajes.Personaje;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Curacion extends Pociones{
    int puntosDeVida;

    public Curacion(int puntosDeVida, int duracion) {
        super(duracion);
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public void accion(int duracion, Personaje personaje) {
        for (int i = 0; i < duracion; i++) {
            personaje.setSalud(personaje.getSalud()+5);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
        }
    }
    
    
    
}
