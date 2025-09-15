package extra.pkg30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rober
 * acepta el reto 305: teniendo una lista de las ciudades que han sido tomadas por el enemigo saber si los efectivos aliados pueden tener éxito
 * con que los asliados sean mayor que los enemigos es suficiente
 * input de ejemo
 * 
 * 4 -> el cuatro marca la cantidad de ciudades que hay
 * 40 20 80 30
 * 25 50 35 40
 */
public class Extra30 {

	// calcula la cantidad de ciudades que se pueden recuperar
	public static int CantidadCiudades(ArrayList<Integer> soldadosEnemigos, ArrayList<Integer> SoldadosAliados) {
		int resultado=0;
		
		// lee los array
		for (int i = 0; i < soldadosEnemigos.size(); i++) {
			// verifica que la ciudad tenga menos soldados enemigos que aliados
			if(soldadosEnemigos.get(i)<SoldadosAliados.get(i)) {
				resultado++; 
			}
		}
		
		return resultado;
	}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        ArrayList<Integer> soldadosEnemigos = new ArrayList<Integer>();
        ArrayList<Integer> soldadosAliados = new ArrayList<Integer>();
        
        int cantidadCiudades = Integer.parseInt(scn.next());
        
        // añade las ciudades en los respectivos ArrayList
        for (int i = 0; i < cantidadCiudades; i++) {
			int cantidadSoldados = Integer.parseInt(scn.next());
			soldadosEnemigos.add(cantidadSoldados);
		}
        
        for (int i = 0; i < cantidadCiudades; i++) {
			int cantidadSoldados = Integer.parseInt(scn.next());
			soldadosAliados.add(cantidadSoldados);
		}
        
        // llama al método
        System.out.println(CantidadCiudades(soldadosEnemigos, soldadosAliados));
    }
    
}

































