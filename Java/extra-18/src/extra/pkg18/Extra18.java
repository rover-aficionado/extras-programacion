package extra.pkg18;

/**
 *
 * @author rober
 */
public class Extra18 {

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

        if (estaInvertido(sudoku)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }

    public static boolean estaInvertido(char[][] sudoku) {
        char[][] sudokuInvertido = new char[sudoku.length][sudoku[0].length];

        // Invertir filas y columnas
        for (int i = sudoku.length - 1; i >= 0; i--) {
            for (int j = sudoku[i].length - 1; j >= 0; j--) {
                sudokuInvertido[sudoku.length - 1 - i][sudoku[i].length - 1 - j] = sudoku[i][j];
            }
        }

        // Comparar solo los espacios vacíos (caracter '-')
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i][j] == '-' && sudokuInvertido[i][j] != '-') {
                    return false;
                }
            }
        }

        return true;
    }
}
