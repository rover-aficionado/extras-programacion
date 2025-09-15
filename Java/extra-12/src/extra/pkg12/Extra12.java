package extra.pkg12;

import utils.Frases;

/**
 *
 * @author rober
 */
public class Extra12 {

    public static void main(String[] args) {
        Frases frases = new Frases();
        String txt1 = "hola que tal";
        String txt2 = "estamos bien";
        
        System.out.println(frases.letrasCompartidas(txt1, txt2));
        System.out.println(frases.letrasNoCompartidas(txt1, txt2));
    }
    
}
