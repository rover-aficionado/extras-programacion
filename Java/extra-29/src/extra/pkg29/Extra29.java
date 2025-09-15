package extra.pkg29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rober
 * retos de programación 100: la palabra de 100 puntos
 * sumar los valores de cada letra. la mejor palabra es la que la suma de los valores de las letras es 100
 */
public class Extra29 {
    
    // traducotor de letras a números
    public static int traductorletranumero(char letra){
        // crea u HashMap con todas las letras del alfabeto español
        Map<Character, Integer> valorLetras = new HashMap<Character, Integer>();
        String letras = "abcdefghijklmnñopqrstuvwxyz";
        for (int i = 0; i < letras.length(); i++) {
            valorLetras.put(letras.charAt(i), i+1);
        }
        
        // devuelve el valor de la letra según sus valores
        return valorLetras.get(letra);
        
        
    }
    // suma de los valores de las letras
    public static int palabraNumero(String palabra){
        int resultado = 0;
        
        // divide el String en letras y llama al traductor
        char[] letras = palabra.toCharArray();
        for(char letra : letras){
            resultado+=traductorletranumero(letra);
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        
        // muestra los resultado de los valores de las palabras y gestiona los posibles errores:
        try {
            if(palabraNumero(input) > 100){
                System.out.println("perdisre");
                System.out.println(palabraNumero(input));
            } else if(palabraNumero(input)==100){
                System.out.println("ganaste");
                System.out.println(palabraNumero(input));
            } else {
                System.out.println("quedaste por debajo");
                System.out.println(palabraNumero(input));
            }
        } catch (NullPointerException e) {
            System.out.println("error de tipado: se ha introducido un tipo de dato que no se esperaba. Se esperaba String");
        } catch (Exception a){
            System.out.println("error no identificado, código de excepción");
            System.out.println(a);
        }
        
    }
    
}
