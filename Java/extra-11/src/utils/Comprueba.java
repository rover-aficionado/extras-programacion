package utils;


import java.util.List;

/**
 *
 * @author rober
 */
public class Comprueba {
    public boolean simbolos(String texto){
        char caracter;
        int abiertos=0;
        int cerrados=0;
        
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            
            switch (caracter) {
                case '(':
                    abiertos++;
                    break;
                case '[':
                    abiertos++;
                    break;
                case '{':
                    abiertos++;
                    break;
                case ')':
                    cerrados++;
                    break;
                case ']':
                    cerrados++;
                    break;
                case '}':
                    cerrados++;
                    break;
                default:
                    continue;
            }
            
        }
        
        if(abiertos == cerrados){
            return true;
        }
        return false;
        
    }
}
