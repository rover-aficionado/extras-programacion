/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author rober
 */
public class NumeroAmstrong {
    public boolean esAmstrong(int numero){
        // true: es un numero amstrong 
        // false: NO es un numero amstrong
        
        String numeroString = String.valueOf(numero);
        int longitud = numeroString.length();
        int resultado = 0;
        
        for (int i = 0; i < longitud; i++) {
            char caracter = numeroString.charAt(i);
            int valor = Character.getNumericValue(caracter);
            
            resultado += Math.pow(valor, longitud);
        }
        
        return numero==resultado;
    }
}
