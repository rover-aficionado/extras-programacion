package extra.pkg24;

import extra.pkg24.armas.Arco;
import extra.pkg24.armas.CetroMagico;
import extra.pkg24.armas.Espada;
import extra.pkg24.juego.AparicionPersonajes;
import extra.pkg24.personajes.Arquero;
import extra.pkg24.personajes.Caballero;
import extra.pkg24.personajes.Mago;
import extra.pkg24.pociones.AutoDaño;
import extra.pkg24.pociones.Curacion;
import extra.pkg24.pociones.Fuerza;
import extra.pkg24.utils.Figuras;

/**
 *
 * @author rober
 */
public class Extra24 {

    public static void main(String[] args) {
        
        // personajes
        Arquero arquero = new Arquero("Arquero", 100, 100, true);
        Caballero caballero = new Caballero(0, "cabellero", 100, 100, true);
        Mago mago = new Mago("mago", 100, 100, true, true);
        AparicionPersonajes ap = new AparicionPersonajes(); // instancia de las aparición de las figuras en la terminal
        
        //armas
        Arco arco = new Arco(40, "arco", 7);
        Espada espada = new Espada(true, "espada", 5, 30);
        CetroMagico cetroMagico = new CetroMagico(5, "cetro", 10, 35);
        
        // pociones
        AutoDaño autoDaño = new AutoDaño(3);
        Curacion curacion = new Curacion(5, 3);
        Fuerza fuerza = new Fuerza(3, 3);
        
        //figuras que se imprimen en pantalla
        Figuras figuras = new Figuras();
        
        ap.aparición(figuras);
        
    }
    
}
