/*@author rober*/

package extra.pkg21.utils;


public class Kaprekar {
    public static boolean isKaprekar(int num) {
        int square = num * num; 
        String squareStr = String.valueOf(square);  
        
        // Divide la cadena en dos partes
        int length = squareStr.length();
        int right = 0;
        int left = 0;

        // obtiene la parte derecha
        if (length > 1) {
            right = Integer.parseInt(squareStr.substring(length / 2));
            left = Integer.parseInt(squareStr.substring(0, length / 2));
        } else {
            right = square; 
        }

        // Comprobar si la suma de las partes es igual al número original
        return (left + right == num);
    }
}
