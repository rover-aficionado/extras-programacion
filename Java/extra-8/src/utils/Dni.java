/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.List;

/**
 *
 * @author rober
 */
public class Dni {
    public char letra(int nif){
    
        List<Character> letras = List.of(
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
            'C', 'K', 'E'
        );
        
        return letras.get(nif%23);        
    }
}
