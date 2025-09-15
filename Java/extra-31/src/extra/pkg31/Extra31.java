package extra.pkg31;

import java.util.Scanner;

/**
 *
 * @author rober
 * retos de programación 70 análisis de un texto
 */
public class Extra31 {
    
    // contar palabras
    public static int contarPalabras(String[] texto){
        return texto.length;
    }
    
    // logitud media
    public static int longitudMedia(String[] texto){
        int longitudTotal=0;
        
        // lee el texto y suma las lonjitudes de cada una de las palabras
        for(String palabra : texto){
            longitudTotal+=palabra.length();
        }
        
        //devuelve la media de la longitud de las palabras
        return longitudTotal/texto.length;
    }
    
    
    // numero de oraciones
    public static int contarFrase(String texto){
        String[] frases = texto.split(".");
        return frases.length+1;
    }
    
    // palabra más larga
    public static void palabrasMasLarga(String[] texto){
        String palabraLarga=null; 
        int LongitudPalabra=Integer.MIN_VALUE;
        
        // lee el array del texto 
        for(String palabra : texto){
            // comprueba la longitud de las palabras
            if(palabra.length()>LongitudPalabra){
                palabraLarga=palabra;
                LongitudPalabra=palabra.length();
            }
        }
        
        System.out.println("la palabra mas larga es: "+palabraLarga+" y su longitud es: "+LongitudPalabra);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("pon un texto");
        String texto = scn.nextLine();
        
        // divide el texto en String 
        texto.replace(".", " ");
        String[] textos = texto.split(" ");
        
        // llamadas a los métodos 
        System.out.println("recuento de palabras: "+contarPalabras(textos));
        System.out.println("longitud media: "+longitudMedia(textos));
        System.out.println("recuento de frases: "+contarFrase(texto));
        palabrasMasLarga(textos);
    }
    
}
