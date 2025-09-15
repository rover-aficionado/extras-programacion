/*@author rober*/

package extra.pkg24.personajes;

import extra.pkg24.armas.Armas;
import extra.pkg24.armas.Espada;
import extra.pkg24.utils.Aleatorio;


public class Caballero extends Personaje {
    int armaduraExtra;

    public Caballero(int armaduraExtra, String nombre, int defensa, int salud, boolean estaVivo) {
        super(nombre, defensa, salud, estaVivo);
        this.armaduraExtra = armaduraExtra;
    }

    // método para cambiar el daño según si es crítico o no
    @Override
    public void atacar(Personaje objetivo, Armas arma) {
        
        System.out.println(nombre+" ataca");
        
        //comprueba si el golpe es crítico o no
        if(arma.usar(arma.getProbabilidadCritico())){
            System.out.println(super.getNombre() + "ejerce un impácto crítico");
            objetivo.setSalud(objetivo.getSalud()-(arma.getDaño()+10));
            
        } else {
            System.out.println(super.getNombre()+"ejerce un impacto normal");
            objetivo.setSalud(objetivo.getSalud()-arma.getDaño());
        } 
        // comprueba la vida restante del personaje
        if (objetivo.getSalud() <= 0){
                System.out.println("objetivo eliminado!");
        }
    }

	public int getArmaduraExtra() {
		return armaduraExtra;
	}

	public void setArmaduraExtra(int armaduraExtra) {
		this.armaduraExtra = armaduraExtra;
	}
    
    
}



















