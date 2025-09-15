
package ejercicio.sudokuinvertido.utils;

/**
 *
 * @author rober
 */
public class ComprobacionYResultado {
   
    public static void resolución(char[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                // genera un número del uno al nueve
                for (int k = 0; k < 10; k++) {
                    if (hayEnFila(sudoku, i, j, k) && hayEnColumna(sudoku, j, k) && hayEnCuadrado(sudoku, i, k, k)) {
                        char resultado = (char) (k + '0');
                        sudoku[i][j] = resultado; // que cambie los espacios vacíos por el numero que cumpla la condición
                    }
                }
            }
        }
        
        // imprimir el sudoku
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]);
            }
            System.out.println("");
        }
        
    }
  
    public static boolean hayEnFila(char[][] sudoku, int fila, int columna, int numero){
        char numeroVerificar = (char) (numero + '0');
        
        for (int i = 0; i < sudoku.length; i++) {
            //verifica que el numero esté solo en la fila
            if (sudoku[fila][i]==numeroVerificar){
                return false;
            }    
        }
        
        return true; // si es true quiere decir que no hay un numero
    }
    
    public static boolean hayEnColumna(char[][] sudoku, int columna, int numero){
        char numeroVerificar = (char) (numero +'0');
        
        for (int i = 0; i < sudoku.length; i++) {
            // verifica que el numero esté solo en la columna
            if(sudoku[i][columna] == numeroVerificar){
                return false;
            }
        }
        
        return true; // si es true no hay numero
    }
    
    public static boolean hayEnCuadrado(char[][] sudoku, int fila, int columna, int numero){
        char numeroVerificar = (char) (numero + '0'); 
        
        // indico el lugar de inicio para verificar los números del cuadrante
        int inicioFila = (fila / 3)*3;
        int inicioColumna = (columna /3)*3;
        
        for (int i = inicioFila; i < inicioFila + 3; i++) {
            for (int j = inicioColumna; j < inicioColumna; j++) {
                // verifica que no exista el numero en el cuadrante
                if(sudoku[i][j]==numeroVerificar){
                    return false;
                }
            }
        }
        return true;
    }
        
        
}
