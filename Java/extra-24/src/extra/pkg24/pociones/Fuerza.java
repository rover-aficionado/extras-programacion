/*@author rober*/

package extra.pkg24.pociones;

import extra.pkg24.armas.Armas;
import extra.pkg24.personajes.Personaje;


public class Fuerza extends Pociones{
    int fuerza;

    public Fuerza(int fuerza, int duracion) {
        super(duracion);
        this.fuerza = fuerza;
    }

    
    @Override
    public void accion(int duración, Personaje personaje) {
        // no es necesario que haga nada
    }
    
   // método para aportar un daño extra en las armas
    public void dañoExtra(Armas arma){
        arma.setDaño(arma.getDaño() + 5);
    }
    
}
