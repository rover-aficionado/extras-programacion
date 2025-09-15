package extra.pkg17;

import java.util.Scanner;
import utils.Fechas;

/**
 *
 * @author rober
 */
public class Extra17 {
    
    public static void main(String[] args) {
        Fechas fechas = new Fechas();
        Scanner scn = new Scanner(System.in);
        String fecha;
        
        System.out.println("dime una fecha (dd/MM/yyyy)");
        fecha = scn.nextLine();
        
        System.out.println(fechas.dias(fecha)+" dias de diferencia.");
        
    }
    
}
