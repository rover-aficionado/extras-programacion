package extra.pkg22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import extra.pkg22.utils.Fecha;


/**
 *
 * @author Alumno
 */
public class Extra22 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<LocalDate> fechas = new ArrayList<>();
        Fecha saberFecha = new Fecha();
        
        while(true) {
            System.out.println("dime una fecha. para terminar escribe 0");
            String fecha = scn.nextLine();

            if (fecha.equals("0")){
                break;
            } else {
                LocalDate fechaFinal = LocalDate.parse(fecha);
                fechas.add(fechaFinal);
            }
        }

        if (saberFecha.cumpleaños(fechas)) {
            System.err.println("coinciden en fechas de cumpleaños");
        } else {
            System.out.println("no coinciden en fechas");
        }
    }
    
}
