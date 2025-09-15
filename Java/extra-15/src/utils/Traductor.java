package utils;

/**
 *
 * @author rober
 */
public class Traductor {
    public int deRomanosAArabes(String numero){
        
        int resultado=0;
        int numeroAnterior = 0;
        
        for (int i = numero.length() - 1; i >= 0; i--) {
            int numeroDeResultado = Diccionario.diccionario(numero.charAt(i));
            
           if (numeroDeResultado < numeroAnterior) {
                resultado -= numeroDeResultado; 
            } else {
                resultado += numeroDeResultado; 
            }
            
            numeroAnterior=numeroDeResultado;
        }
        
        return resultado;
    }
}
