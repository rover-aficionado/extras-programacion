
package extra.pkg32;

import java.util.*;

public class Extra32 {
	// averiguar el numero de dias que serán necesarios
	public static int numeroDias(int dinero) {
		int dineroAyer=1;
		int dineroAnteayer=1;
		int total=2;
		int dias=2;
		
		while(total<dinero) {
			int dineroHoy = 2*dineroAnteayer + dineroAyer; // el dinero de hoy es la suma de el dinero que que ganó ayer mas el duplicado del dinero de anteayer
			total += dineroHoy; // el nuevo total es el dinero que tiene hoy
			dineroAnteayer=dineroAyer; // el dinero de anteayer será el dinero que tiene ayer
			dineroAyer=dineroHoy; // el dinero de ayer será el que tiene hoy
			dias++; // ha pasado un nuevo día
		}
		
		return dias;
	}
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // pide el numero de dias y lo añade a una lista para poder procesarlos todos
        int repeticiones=Integer.parseInt(scn.next());
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < repeticiones; i++) {
			int numero = Integer.parseInt(scn.next());
			numeros.add(numero);
		}
        
        // lee y procesa la lista
        for(int numero : numeros) {
        	System.out.println(numeroDias(numero));
        }
    }   
}
