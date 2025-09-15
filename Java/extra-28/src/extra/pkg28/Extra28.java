/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra.pkg28;

import java.util.*;

/**
 *
 * @author Rober
 * acepta el reto 509
 */
public class Extra28 {
	
	// método para el procesado
	public static void cargaMinima(int [][] tablero) {
            // variables que almacenarán el rsultado del absoluto de cada valor de Array y de todos los números sin procesar el valor absoluto
            // TODO no puede nunca bajar del dos
            int resultado =2;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if(tablero[i][j]==0){
                        continue;
                    } else if(tablero[i][j]<0){
                        resultado+= Math.abs(tablero[i][j]);

                    } else {
                        resultado-=tablero[i][j];
                    
                    }
                    
                    // aseguro que el resultado no sea menor que dos,
                    if(resultado<2) {
                    	resultado = 2;
                    }
                }
            }
            
            System.out.println(resultado);
	}

    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
         
    	int contador=0;
        // Crear Array e introducir datos en él      
    	do {
            int columna = Integer.parseInt(scn.next());
            int fila = Integer.parseInt(scn.next());           
            int[][] tablero = new int[fila][columna];
            
            // Introducción de los datos
            for (int j = 0; j < fila; j++) {
                for (int j2 = 0; j2 < columna; j2++) {
                    tablero[j][j2] = Integer.parseInt(scn.next());
                }
            }
            contador ++;
            // Llamar al método de prueba
            cargaMinima(tablero);
    	} while (contador<4);
    }
    
}
