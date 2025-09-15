/*@author rober*/

package extra.pkg24.personajes;

import extra.pkg24.armas.Armas;


public class Arquero extends Personaje{
    int cantidadFlechas = 5;

    public Arquero(String nombre, int defensa, int salud, boolean estaVivo) {
        super(nombre, defensa, salud, estaVivo);
    }

    @Override
    public void atacar(Personaje objetivo, Armas arma) {
        System.out.println(nombre+" ataca");
        
        //comprueba si el golpe es crítico o no y reduce las flechas que tiene
        if(arma.usar(arma.getProbabilidadCritico())){
            System.out.println(super.getNombre() + "ejerce un impácto crítico");
            objetivo.setSalud(objetivo.getSalud()-(arma.getDaño()+10));
            
        } else { // aplica un golpe normal
            System.out.println(super.getNombre()+"ejerce un impacto normal");
            objetivo.setSalud(objetivo.getSalud()-arma.getDaño());
        }
        
        cantidadFlechas=cantidadFlechas-1;
        
        // comprueba la vida restante del personaje
        if (objetivo.getSalud() <= 0 || cantidadFlechas==0){
            System.out.println("objetivo eliminado!");
        }
    }
}
