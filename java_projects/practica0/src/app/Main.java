package app;
import maths.*;

/**
 * Esta clase ejecuta el codigo para calcular distancias entre 2 strings de igual longitud
 */
public class Main {


    /**
     * Primer string
     */
    static String s1 = "abc";
    /**
     * Segundo string
     */
    static String s2 = "acc";
    
    /**
     * metodo main
     * @param args no usar  
     *
     */
    public static void main(String[] args) {

        System.out.println(Distance.calculateDistance(s1, s2));
    }
}