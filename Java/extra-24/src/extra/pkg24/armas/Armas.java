/*@author rober*/

package extra.pkg24.armas;


public abstract class Armas {
    String nombre;
    int daño;
    int probabilidadCritico;

    public Armas(String nombre, int daño, int probabilidadCritico) {
        this.nombre = nombre;
        this.daño = daño;
        this.probabilidadCritico = probabilidadCritico;
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    public int getProbabilidadCritico() {
        return probabilidadCritico;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
        
    public abstract boolean usar(int probabilidadCritico);
}
