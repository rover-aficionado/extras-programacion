package estra.pkg22;

import estra.pkg22.Utils.Reloj;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Estra22 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        Reloj rlj = new Reloj();
        
        System.out.println("dime un numero: ");
        int numeroMáximo= Integer.parseInt(scn.nextLine());
        
        //rlj.cronometro(numeroMáximo);
        rlj.cuentaAtras(numeroMáximo);
        
    }
    
}
