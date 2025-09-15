package extra.pkg24.personajes;

import extra.pkg24.armas.Armas;
import extra.pkg24.utils.Aleatorio;

public class Mago extends Personaje{
	

	public Mago(String nombre, int defensa, int salud, boolean estaVivo, boolean poderDivino) {
		super(nombre, defensa, salud, estaVivo);
        }

	@Override
	public void atacar(Personaje objetivo, Armas arma) {
		Aleatorio aleatorio = new Aleatorio();
		
		if(arma.usar(arma.getProbabilidadCritico())){ //golpe crítico
			System.out.println(super.getNombre() + "ejerce un impácto crítico");
            objetivo.setSalud(objetivo.getSalud()-(arma.getDaño()+10));
            
		} else if(arma.usar(arma.getProbabilidadCritico()) && aleatorio.numeroAleatorio() > 90) { // golpe con poder divino
			System.out.println(super.getNombre()+"utiliza poder divino para ejercer su golpe");
			objetivo.setSalud(objetivo.getSalud()-(arma.getDaño()+15));
			
		} else { // golpe normal
			objetivo.setSalud(objetivo.getSalud()-arma.getDaño());
		}	
	}	
}
