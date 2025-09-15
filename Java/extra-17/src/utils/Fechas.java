package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author rober
 */
public class Fechas {
    public int dias (String fecha){
        
        int resultado = 0;
        // cambio el patron del la fecha par que primero tenga los días y luego los años
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //paso el String a LocalDate para poder calcular los días
        LocalDate fechafinal = LocalDate.parse(fecha, patron);
        
        //calculo la diferencia      
        resultado = (int) Math.abs(ChronoUnit.DAYS.between(fechafinal, LocalDate.now()));
        
        return resultado;       
        
    }
}
