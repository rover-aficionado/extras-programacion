package extra.pkg18.pkg2;

/**
 *
 * @author rober
 */
public class Extra182 {

    public static void main(String[] args) {
        char[] sudoku = {
        '-', '-', '-', '5', '-', '9', '2', '-', '7',
        '6', '7', '-', '3', '-', '-', '-', '-', '4',
        '-', '-', '-', '-', '-', '2', '-', '-', '-',
        '-', '4', '9', '2', '-', '-', '-', '-', '8',
        '-', '-', '-', '-', '-', '-', '-', '-', '-',
        '2', '3', '-', '-', '-', '4', '1', '6', '-',
        '-', '-', '-', '1', '-', '-', '-', '-', '-',
        '5', '-', '-', '-', '8', '-', '9', '1', '-',
        '8', '-', '4', '9', '-', '7', '-', '-', '-'
        };
        
        if(salida(sudoku)){
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }

    }
    
    public static boolean salida(char [] sudoku){
        
        char[] sudokuInvertido = new char[sudoku.length];
        
       for (int i = sudoku.length - 1, j = 0; i >= 0; i--, j++) {
            sudokuInvertido[j] = sudoku[i];
        }

        
        for (int i = 0; i < sudoku.length/2; i++) {
            if (sudoku[i] == '-' && sudokuInvertido[i] != '-') {
                return false;
            }
        }
        
        
        return true;
    }
}
