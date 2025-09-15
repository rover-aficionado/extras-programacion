package utils;

import java.util.LinkedHashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author rober
 */
public class Traductor {
    public String morse(String frase){
       String resultado="";
       frase = frase.trim();
                    
        for (int i = 0; i<frase.length(); i++) {
            char letra=frase.charAt(i);
            String texto=diccionario(letra);
            resultado+=texto;            
        }            
        return resultado;
    }
    
    public String diccionario(char letra){
        LinkedHashMap<Character, String> morseDiccionario = new LinkedHashMap<>();
        
        morseDiccionario.put(' ', "/");
        morseDiccionario.put('a', ".-");
        morseDiccionario.put('b', "-...");
        morseDiccionario.put('c', "-.-.");
        morseDiccionario.put('d', "-..");
        morseDiccionario.put('e', ".");
        morseDiccionario.put('f', "..-.");
        morseDiccionario.put('g', "--.");
        morseDiccionario.put('h', "....");
        morseDiccionario.put('i', "..");
        morseDiccionario.put('j', ".---");
        morseDiccionario.put('k', "-.-");
        morseDiccionario.put('l', ".-..");
        morseDiccionario.put('m', "--");
        morseDiccionario.put('n', "-.");
        morseDiccionario.put('ñ', "--.--");
        morseDiccionario.put('o', "---");
        morseDiccionario.put('p', ".--.");
        morseDiccionario.put('q', "--.-");
        morseDiccionario.put('r', ".-.");
        morseDiccionario.put('s', "...");
        morseDiccionario.put('t', "-");
        morseDiccionario.put('u', "..-");
        morseDiccionario.put('v', "...-");
        morseDiccionario.put('w', ".--");
        morseDiccionario.put('x', "-..-");
        morseDiccionario.put('y', "-.--");
        morseDiccionario.put('z', "--..");

        // Números
        morseDiccionario.put('0', "-----");
        morseDiccionario.put('1', ".----");
        morseDiccionario.put('2', "..---");
        morseDiccionario.put('3', "...--");
        morseDiccionario.put('4', "....-");
        morseDiccionario.put('5', ".....");
        morseDiccionario.put('6', "-....");
        morseDiccionario.put('7', "--...");
        morseDiccionario.put('8', "---..");
        morseDiccionario.put('9', "----.");
        
        return morseDiccionario.get(letra);
    }
}
