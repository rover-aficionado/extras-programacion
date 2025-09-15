package extra.pkg22.utils;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fecha {
    public boolean cumpleaños(ArrayList<LocalDate> fechas){

        for(LocalDate fecha : fechas){
            if (fechas.contains(fecha)) {
                return true;
            }
        }

        return false;
    }
}
