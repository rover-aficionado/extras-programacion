/*@author rober*/

package extra.pkg24.armas;

import extra.pkg24.utils.Aleatorio;


public class Arco extends Armas{
       
    public Arco(int probabilidadCritico, String nombre, int daño) {
        super(nombre, daño, probabilidadCritico);
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
