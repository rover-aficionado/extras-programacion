/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package extra.pkg34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rober, created at @date at @time
 */
public class Extra34 {

    public static int TiempoEmpleado(HashMap<Integer, ArrayList<Integer>> numeros){
        int resultado= 0;
        
        for (Map.Entry<Integer, ArrayList<Integer>> numero : numeros.entrySet()) {
            Integer tiempoEmpleado = numero.getKey();
            ArrayList<Integer> cantidadDefiniciones = numero.getValue();
            
            for(Integer definicion : cantidadDefiniciones) {
                int multiplicacion = tiempoEmpleado*definicion;
                resultado += multiplicacion;
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input del tiempo y la cantidad de definiciones
        HashMap<Integer,ArrayList<Integer>> numeros = new HashMap<>();
        
        // ArrayList para la cantidad de definiciones
        ArrayList<Integer> definiciones = new ArrayList<Integer>();
        
        while (true) {
            int tiempoEmpleado = Integer.parseInt(sc.next());
            
            if (tiempoEmpleado != 0){
                while(true) {
                    int cantidadDefiniciones = Integer.parseInt(sc.next());
                    if (cantidadDefiniciones != 0){
                        definiciones.add(cantidadDefiniciones);
                    } else {
                        break;
                    }
                }
                numeros.put(tiempoEmpleado, definiciones);
            } else {
                break;
            }
        }
        
        // ejecución de la operación para saber el tiempo empleado
        try {
            for (int mumero : numeros.keySet()) {
                System.out.println(TiempoEmpleado(numeros));
            }
        } catch (Exception e) {
            System.out.println("error al ejecutar la operacion");
            System.out.println(e);
        }
    }
}
