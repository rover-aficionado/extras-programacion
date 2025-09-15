/*@author rober*/

package extra.pkg24.juego;

import extra.pkg24.utils.Figuras;
import java.util.Scanner;


public class AparicionPersonajes {
    public static void aparición(Figuras figura){
        Scanner scn = new Scanner(System.in);
        Figuras figuras = new Figuras();
        
        int seleccion1;
        int seleccion2; 
        
        // menú de selección de personaje
        do {
            figura.mago();
            figura.arquero();
            figura.caballero();
        
            System.out.println("selecciona un jugador:");
            seleccion1 = Integer.parseInt(scn.nextLine());
            System.out.println("selecciona otro jugador:");
            seleccion2 = Integer.parseInt(scn.nextLine());
            
            opcion1(figuras);
            opcion2(figuras);
                              
        } while (true);   
    }
    
    public static int opcion1(Figuras figuras) {
    	Scanner scn = new Scanner(System.in);
    	int seleccion1=0;
    	
    	while (seleccion1 >= 4);
    
    		// selección de personajes
    		switch (seleccion1) {
        		case 1:
        			figuras.arquero();
        			return 1;
        		case 2:
        			figuras.caballero();
        			return 2;
        		case 3: 
        			figuras.mago();
        			return 3;
        		default:
        			System.out.println("error al seleccionar personaje");
    	}
    	
    	return 1;
    }
    
    public static int opcion2(Figuras figuras) {
    	Scanner scn = new Scanner(System.in);
    	int seleccion2=0;
    	switch (seleccion2) {
		case 1:
			figuras.arquero();
			return 1;
		case 2:
			figuras.caballero();
			return 2;
		case 3: 
			figuras.mago();
			return 3;
		default:
			System.out.println("error al seleccionar personaje");    	
		}
    	
    	return 1;
    }
}























