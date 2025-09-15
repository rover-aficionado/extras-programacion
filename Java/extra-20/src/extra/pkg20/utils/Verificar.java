package extra.pkg20.utils;

/**
 *
 * @author rober
 */
public class Verificar {
    public boolean estaCorrecto(int[][] sudoku){
        
        // lee el array sudoku
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int k = 0; k <= 9; k++) {
                    // verifica que no existan numeros repetidos en fila, columna y cuadro
                    if(hayEnColumna(sudoku, i, k) && hayEnFila(sudoku, j, k) && hayEnCuadro(sudoku, i, j, k)&& isEmpty(sudoku,k)){
                        return false; // devuelve false si está mal hecho
                    }
                }
            }
            
        }
        
        return true; // devuelve true si está bien hecho
        
    }
    
    public boolean hayEnFila(int[][] sudoku, int fila, int numero){
        // si hay numeros repetidos en la fila será true 
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[fila][i] == numero) {
                return true; // si el numero se repite devuelve true
            }
        }
        
        return false; // si el numero no se repite devuelve false
    }
    
    public boolean hayEnColumna(int[][] sudoku, int columna, int numero){
        // si hay numeros repetido en la columna devuelve true
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][columna]== numero) {
                return true; // si el numero está en la fila devuelve true
            }
        }
        
        return false; // si el numero no está en la columna devuelve false
    }
    
    public boolean hayEnCuadro(int[][] sudoku, int fila, int columna, int numero){
        // inicia el lugar en el que se van a ver si los numeros se repiten en el cuadro
        int inicioFila = (fila / 3)*3;
        int inicioColumna = (columna /3)*3;
        
        for (int i = inicioFila; i < inicioFila + 3; i++) {
            for (int j = inicioColumna; j < inicioColumna; j++) {
                // verifica que no exista el numero en el cuadrante
                if(sudoku[i][j]==numero){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isEmpty (int[][] sudoku, int numero){
        // lee el sudoku
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int k = 0; k < 9; k++) {
                    // verifica que no exista un espacio vacío
                    if (sudoku[i][j] == '-') {
                        return true;
                    }
                }
            }
        }
        return true;
    }
}

