/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra.pkg4.utils;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class CuentaPalabras {
    public void palabra(String palabra){
        ArrayList<Object> listFrase = new ArrayList();
        int recuento=0;
        
        palabra.trim();
        
        for (int i=0; i<palabra.length(); i++){
            listFrase.add(palabra.charAt(i));
        }
        
        for (int x=0; x<=listFrase.size();x++){
            if(listFrase.get(x).equals(" ")){
                recuento +=1;
            }
        }
        
        System.out.println("hay "+recuento+" palabras");
    }
}
