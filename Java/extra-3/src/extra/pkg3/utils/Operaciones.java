
package extra.pkg3.utils;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Operaciones {
    public void operaciones(){
        Random rdn = new Random();
        int numero1;
        int numero2; 
        int min;
        int max;
        int contador=0;
        int resultado;
        int total;
        List<String> operaciones =List.of("-","*","/","+");
        String operacion;
        Scanner scn = new Scanner(System.in);
        
        for(int i=0; i<20; i++){
            for (int x=0; i<5;x++){
                numero1 = rdn.nextInt(9);
                numero2 = rdn.nextInt(9);
                operacion = operaciones.get(rdn.nextInt(operaciones.size()));
                System.out.println(numero1 + operacion + numero2);
                System.out.print("dime el resultado:");
                resultado =Integer.parseInt(scn.next());
                
            
                switch (operacion) {
                    case "+":
                        total = numero1+numero2;
                    case "-":
                        total = numero1-numero2;
                    case "*":
                        total = numero1*numero2;
                    case "/":
                        total = numero1/numero2;
                    default:
                        throw new AssertionError();
                }
                
            }
            for (int x=6; x<10;i++){
                min=10;
                max=99;
                numero1 = rdn.nextInt((max - min)+1);
                numero2 = rdn.nextInt(9);
                operacion = operaciones.get(rdn.nextInt(operaciones.size()));
                System.out.println(numero1 + operacion + numero2);
                System.out.print("dime el resultado:");
                resultado =Integer.parseInt(scn.next());
            
                switch (operacion) {
                    case "+":
                        System.out.println(numero1+numero2);
                    case "-":
                        System.out.println(numero1-numero2);
                    case "*":
                        System.out.println(numero1*numero2);
                    case "/":
                        System.out.println(numero1/numero2);
                    default:
                        throw new AssertionError();
                }
            }
            for (int y=11; y<15; y++){
                min=10;
                max=99;
                numero1 = rdn.nextInt((max - min)+1);
                numero2 = rdn.nextInt((max - min)+1);
                operacion = operaciones.get(rdn.nextInt(operaciones.size()));
                System.out.println(numero1 + operacion + numero2);
                System.out.print("dime el resultado:");
                resultado =Integer.parseInt(scn.next());
            
                switch (operacion) {
                    case "+":
                        System.out.println(numero1+numero2);
                    case "-":
                        System.out.println(numero1-numero2);
                    case "*":
                        System.out.println(numero1*numero2);
                    case "/":
                        System.out.println(numero1/numero2);
                    default:
                        throw new AssertionError();
                }
            }
            
            for (int z=16; z<20; z++){
                min=10;
                max=99;
                numero1 = rdn.nextInt((max - min)+1);
                numero2 = rdn.nextInt((max - min)+1);
                operacion = operaciones.get(rdn.nextInt(operaciones.size()));
                System.out.println(numero1 + operacion + numero2);
                System.out.print("dime el resultado:");
                resultado =Integer.parseInt(scn.next());
            
                switch (operacion) {
                    case "+":
                        System.out.println(numero1+numero2);
                    case "-":
                        System.out.println(numero1-numero2);
                    case "*":
                        System.out.println(numero1*numero2);
                    case "/":
                        System.out.println(numero1/numero2);
                    default:
                        throw new AssertionError();
                }
            }
                
        }        
      
    }
}
