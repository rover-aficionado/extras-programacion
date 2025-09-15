package utils;

import java.util.HashMap;

/**
 *
 * @author rober
 */
public class Diccionario {
    public static int diccionario(char letra){
    
        HashMap<Character, Integer> romanToArabic = new HashMap<>();

        romanToArabic.put('I', 1);
        romanToArabic.put('V', 5);
        romanToArabic.put('X', 10);
        romanToArabic.put('L', 50);
        romanToArabic.put('C', 100);
        romanToArabic.put('D', 500);
        romanToArabic.put('M', 1000);
        
        return romanToArabic.get(letra);
    
    }
}
