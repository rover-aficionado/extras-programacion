/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package extra.pkg33;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rober, created at @date at @time
 * Acepta el reto 439
 */
public class Extra33 {

    public static String resultado(String valor1, String valor2){ // devuelve el resultado del cálculo
        String resultado = "";
        String texto = "VDT=";
        
        // extrae los números
        int n1 = Integer.parseInt(valor1.substring(2));
        int n2 = Integer.parseInt(valor2.substring(2));
        
        int valorResultante=0;
        
        // verifica el valor, si es la velocidad, la distancia o el tiempo
        /*usando la fórmula v=d/t donde:
        v=valocidad
        d=distancia
        t=tiempo
        la operación se despeja y se verifica usando el código siguiente*/
        
        if (valor1.charAt(0)=='D' && valor2.charAt(0)=='T'){
            valorResultante = n1/n2;
            resultado = "V="+String.valueOf(valorResultante);
        } else if (valor1.charAt(0)=='T' && valor2.charAt(0)=='V'){
            valorResultante = n1*n2;
            resultado = "D="+String.valueOf(valorResultante);
        } else if (valor1.charAt(0)=='D' && valor2.charAt(0)=='V'){
            valorResultante = n1*n2;
            resultado = "T="+String.valueOf(valorResultante);
        } else if (valor1.charAt(0)=='V' && valor2.charAt(0) == 'T'){
            valorResultante=n2*n1;
            resultado="D="+String.valueOf(valorResultante);
        } else if (valor1.charAt(0) == 'V' && valor2.charAt(0) == 'D'){
            valorResultante = n2/n1;
            resultado= "T="+String.valueOf(valorResultante);
        }
        
        return resultado;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<String>();
        
        // inserción de datos
        // verificar el número de iteraciones que se van a dar con los cálculos.
        int repeticiones = Integer.parseInt(scn.next());
        
        // bucle para la inserción de los datos
        for (int i = 0; i < repeticiones; i++) {
            String valor1, valor2;
            
            valor1 = scn.next();
            valor2 = scn.next();
            
            numeros.add(valor1 + "$" + valor2);
            
        }
        
        // impresión de los resultados
        for (String numero : numeros) {
            String[] valores = numero.split("\\$");
            System.out.println(resultado(valores[0], valores[1]));
        }
    }
}
