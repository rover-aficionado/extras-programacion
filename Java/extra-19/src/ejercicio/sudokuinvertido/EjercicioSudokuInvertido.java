package ejercicio.sudokuinvertido;

import ejercicio.sudokuinvertido.utils.ComprobacionYResultado;

public class EjercicioSudokuInvertido {
    
    ComprobacionYResultado cyr = new ComprobacionYResultado();

    public static void main(String[] args) {
         char[][] sudoku = {
            {'-', '-', '-', '5', '-', '9', '2', '-', '7'},
            {'6', '7', '-', '3', '-', '-', '-', '-', '4'},
            {'-', '-', '-', '-', '-', '2', '-', '-', '-'},
            {'-', '4', '9', '2', '-', '-', '-', '-', '8'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'2', '3', '-', '-', '-', '4', '1', '6', '-'},
            {'-', '-', '-', '1', '-', '-', '-', '-', '-'},
            {'5', '-', '-', '-', '8', '-', '9', '1', '-'},
            {'8', '-', '4', '9', '-', '7', '-', '-', '-'}
        };

        ComprobacionYResultado.resolución(sudoku);
        
    }

    
}
