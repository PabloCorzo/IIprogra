
package maths;

import java.util.stream.IntStream;

/**
 * Esta clase analiza 2 strings de igual longitud para calcular la distancia entre ellas. Unico metodo es un int calculateDistance(String,String)
 */
public class Distance{

    //Convert two words of same length into arrays and check each index for unequal chars
    /**
     * 
     * @param s1 string 1
     * @param s2 string 2
     * @return valor entero de caracteres que difieren en el mismo indice de ambas palabras (-1 si no son de igual longitud)
     * 
     * 
     */
    public static int calculateDistance(String s1,String s2){
        int counter = 0;
        return counter;
    }
    // public static int calculateDistance(String s1, String s2){       
    //     // // convert both strings to char arrays
    //     // char[] st1 = s1.toCharArray();
    //     // char[] st2 = s2.toCharArray();

    //     // //creates a stream of indexes
    //     // return IntStream.range(0, s1.length())
    //     // //eliminates equal chars in equal indexes
    //     // .filter(e -> st1[e] != st2[e])
    //     // //counts remaining indexes (the ones that differ)
    //     // .map(e -> 1)
    //     // .sum();
    // }
}