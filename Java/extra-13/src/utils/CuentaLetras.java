package utils;

import java.util.List;

/**
 *
 * @author rober
 */
public class CuentaLetras {
    public int vocales(String texto){

        List<Character> vocales = List.of('a', 'e', 'i', 'o', 'u');
        char letras;
        int recuentoFinal=0;
        texto=texto.toLowerCase();
        
        for (int i = 0; i < texto.length(); i++) {
            letras = texto.charAt(i);
            if (vocales.contains(letras)){
                recuentoFinal++;
            }
        }
        
        return recuentoFinal;
    }
    
    public int consonantes(String texto){
        
        List<Character> consonantes = List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z');
        char letras;
        int recuentoFinal= 0;
        texto= texto.toLowerCase();
        
        for (int i = 0; i < texto.length(); i++) {
            letras = texto.charAt(i);
            
            if (consonantes.contains(letras)){
                recuentoFinal++;
                        
            }
        }
        
        return recuentoFinal;
    }
}
