
package extra.pkg27;

import java.util.*;

/**
 *
 * @author rober
 * acepta el reto 404: El Teléfono de Meucci
 */
public class Extra27 {
    /*
        hacer un diccionario que traduzca números individuales a números romanos haciendo que el 0 sea X en lugar de 10
        usando hashmap para hacer que sea un diccionario de números
    */
    
    // TODO método de hashMap para que reciba un int y devuelva su equivalente en números romanos
	public static int traductor(String numero) {
		HashMap<String, Integer> arabesARomanos = new HashMap<>();
        arabesARomanos.put("X", 0);
        arabesARomanos.put("I", 1);
        arabesARomanos.put("II", 2);
        arabesARomanos.put("III", 3);
        arabesARomanos.put("IV", 4);
        arabesARomanos.put("V", 5);
        arabesARomanos.put("VI", 6);
        arabesARomanos.put("VII", 7);
        arabesARomanos.put("VIII", 8);
        arabesARomanos.put("IX", 9);
        
        return arabesARomanos.getOrDefault(numero, -1);
	}
	
	public static void deArabesARomanos(ArrayList<String> numeros) {
		for(String numero : numeros) {
			System.out.println(traductor(numero));
		}
	}
	
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<String>();
        
        String input;
        do {
        	input=scn.next();
        	if(input.equals("0")) {
        		numeros.add(input);
        	}
        }while(!input.equals("0"));
        
        deArabesARomanos(numeros);
    }
    
}































