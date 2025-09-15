package extra.pkg26;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rober
 */
public class Extra26 {
	
	public static int invertir(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10; 
            invertido = invertido * 10 + digito; 
            numero /= 10; 
        }
        return invertido;
    }
	
	public static boolean esRevresible(int numero) {
	
		int numeroInvertido = invertir(numero);
        int suma = numero + numeroInvertido;
        
        while (suma > 0) {
            int digito = suma % 10;
            if (digito % 2 == 0) {
                return false;
            }
            suma /= 10;
        }
        return true;
  
	}
	
	public static void contarNumerosReversibles(int n) {

		 int inicio = (int) Math.pow(10, n - 1);  
	     int fin = (int) Math.pow(10, n) - 1;
	     int contador = 0;
	     
	     for(int i = inicio ; i < fin ; i++) {
	    	 if(esRevresible(i)) {
	    		 contador++;
	    	 }
	     }
	     
	     System.out.println(contador);
	     
	}

    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	ArrayList<Integer> numeros = new ArrayList<Integer>();
    	int numero;
    	
    	do {
    		numero=Integer.parseInt(scn.next());
    		if (numero!=0) {
    			numeros.add(numero);
    		}
    	}while(numero != 0);
    	
    	for(int digitos : numeros) {
    		contarNumerosReversibles(digitos);
    	}
    	
    	scn.close();
    }
    
}
