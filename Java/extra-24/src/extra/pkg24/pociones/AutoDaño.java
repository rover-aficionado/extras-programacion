/*@author rober*/

package extra.pkg24.pociones;

import extra.pkg24.personajes.Personaje;


public class AutoDaño extends Pociones{

    public AutoDaño(int duracion) {
        super(duracion);
    }
    
    @Override
    public void accion(int duracion, Personaje personaje) {
        for (int i = 0; i < duracion; i++) {
            personaje.setSalud(personaje.getSalud()-5);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
        }
    }
}
