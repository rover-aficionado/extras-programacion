/*@author rober*/

package extra.pkg24.armas;

import extra.pkg24.utils.Aleatorio;


public class Espada extends Armas{
    boolean esCritico;

    public Espada(boolean esCritico, String nombre, int daño, int probabilidadCritico) {
        super(nombre, daño, probabilidadCritico);
        this.esCritico = esCritico;
    }
    
    

    @Override
    public boolean usar(int probabilidadCritico) {
        Aleatorio aleatorio = new Aleatorio();
        
        if(aleatorio.numeroAleatorio()>=probabilidadCritico){
            return true;
        } 
        
        return false;
    }

    public boolean isEsCritico() {
        return esCritico;
    }

    public void setEsCritico(boolean esCritico) {
        this.esCritico = esCritico;
    }

    public int getProbabilidadCritico() {
        return probabilidadCritico;
    }

    public void setProbabilidadCritico(int probabilidadCritico) {
        this.probabilidadCritico = probabilidadCritico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    
    
    
}
