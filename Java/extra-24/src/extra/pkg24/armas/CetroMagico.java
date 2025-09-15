/*@author rober*/

package extra.pkg24.armas;

import extra.pkg24.utils.Aleatorio;


public class CetroMagico extends Armas {
    int cantidadHechizos;

    public CetroMagico(int cantidadHechizos, String nombre, int daño, int probabilidadCritico) {
        super(nombre, daño, probabilidadCritico);
        this.cantidadHechizos = cantidadHechizos;
    }

    @Override
    public boolean usar(int probabilidadCritico) {
        Aleatorio aleatorio = new Aleatorio();
        
        if(aleatorio.numeroAleatorio()>=probabilidadCritico){
            return true;
        } 
        
        return false;
    }

    

    
    
    
    
}
