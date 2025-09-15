package extra.pkg8;

import java.util.Scanner;
import utils.Dni;

/**
 *
 * @author rober
 */
public class Extra8 {

    public static void main(String[] args) {
        Dni dni = new Dni();
        Scanner scn = new Scanner(System.in);
        int nif;
        
        System.out.println("dime el nif: ");
        nif=Integer.parseInt(scn.nextLine());
        
        System.out.println(dni.letra(nif));
    }
    
}
