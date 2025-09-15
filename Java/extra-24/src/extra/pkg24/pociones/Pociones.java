/*@author rober*/

package extra.pkg24.pociones;

import extra.pkg24.personajes.Personaje;


public abstract class Pociones {
    int duracion; 

    public Pociones(int duracion) {
        this.duracion = duracion;
    }
    
    public abstract void accion(int duracion, Personaje personaje);
}
