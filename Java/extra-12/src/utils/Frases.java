package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rober
 */
public class Frases {
    public String letrasCompartidas(String txt1, String txt2){
        StringBuilder resultado = new StringBuilder();
        Set<Character> caracteres = new HashSet<>();
        
        for (char c : txt1.toCharArray()) {
            caracteres.add(c);
        }

        for (char c : txt2.toCharArray()) {
            if (caracteres.contains(c)) {
                resultado.append(c);
            }
        }

        return resultado.toString();
        
    }
    
    public String letrasNoCompartidas(String txt1, String txt2){
        StringBuilder resultado = new StringBuilder();
        Set<Character> caracteres = new HashSet<>();
        
        for (char c : txt1.toCharArray()) {
            caracteres.add(c);
        }

        for (char c : txt2.toCharArray()) {
            if (!caracteres.contains(c)) {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
}
