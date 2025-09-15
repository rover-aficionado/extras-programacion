/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra.pkg9;

import java.util.Scanner;
import utils.NumeroAmstrong;

/**
 *
 * @author rober
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroAmstrong numAms = new NumeroAmstrong();
        Scanner scn = new Scanner(System.in);
        int numero=0;
        
        System.out.println("dime un número");
        numero = Integer.parseInt(scn.nextLine());
        
        if (numAms.esAmstrong(numero)){
            System.out.println("es un numero amstrong");
        } else {
            System.out.println("no es un numero amstrong");
        }
        
    }
    
}
