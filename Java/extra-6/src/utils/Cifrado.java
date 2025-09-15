package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rober
 */
public class Cifrado {
    public String cesar(String frase, int numeroCodigo){
        StringBuilder resultado = new StringBuilder();
//        ArrayList listaFrase = new ArrayList();
        List<String> alfabeto = List.of(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", 
            "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        );
        
//        listaFrase.add(frase.split(""));
        
        for (int i = 0; i < frase.length(); i++) {
            char x = frase.charAt(i);
            
            if(!alfabeto.contains(frase.valueOf(x))){
                resultado.append(x);
            } else {
                int posiciónLetraFrase=alfabeto.indexOf(frase.valueOf(x));
                int letraCifrada = (posiciónLetraFrase+numeroCodigo)%alfabeto.size();
            
                resultado.append(alfabeto.get(letraCifrada));
            }
            
            
        }
        
        return resultado.toString();
    }
        
    
}
