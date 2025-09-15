package extra.pkg24.juego;

import extra.pkg24.armas.Arco;
import extra.pkg24.armas.CetroMagico;
import extra.pkg24.armas.Espada;
import extra.pkg24.personajes.Arquero;
import extra.pkg24.personajes.Caballero;
import extra.pkg24.personajes.Mago;
import extra.pkg24.personajes.Personaje;

public class Juego {
	public void juego(Personaje personaje, Caballero cabellero, Arquero arquero, Mago mago) {
		
	}
	
	public void jugadores12(Arquero arquero, Caballero caballero, Espada espada, Arco arco) {
		while (arquero.getSalud()>0 && caballero.getSalud()>0) {
			System.out.println("turno del aruqero");
			arquero.atacar(caballero, arco);
			System.out.println("turno del caballero");
			caballero.atacar(arquero, espada);
		}
	}
	
	public void jugadores13(Arquero arquero, Mago mago, Arco arco, CetroMagico cetroMagico) {
		while(arquero.getSalud()>0 && mago.getSalud()>0) {
			System.out.println("turno del aruqero");
			arquero.atacar(mago, arco);
			System.out.println("turno del mago");
			mago.atacar(arquero, cetroMagico);
		}
			
	}
	
	public void jugadores23(Caballero caballero, Mago mago, Espada espada, CetroMagico cetroMagico) {
		while(caballero.getSalud()>0 && mago.getSalud()>0) {
			System.out.println("turno del caballero");
			caballero.atacar(mago, espada);
			System.out.println("turno del mago");
			mago.atacar(caballero, cetroMagico);
		}
	}
}



























