package maths;

import java.util.Random;

public class RecursiveDarts {


    static Random r = new Random();
    /*
     * Metodo recursivo de aproximacion de pi
     * @return double aproximacion de pi
     * @param int iteraciones iteraciones hechas
     */
    public static double piAproximateRecursive(int iterations, int inside, int thrown){
        if(thrown == iterations){
            return 4*((double)inside/(double)iterations);
        } 
        else{
            thrown++;
            // System.out.println(i);
            double x = r.nextDouble() * 1;
            double y = r.nextDouble() * 1;
            if(((Math.pow(x, 2))+(Math.pow(y, 2))) <= 1){
                inside++;
            }
            return piAproximateRecursive(iterations,inside,thrown);
        }
    }

    // RECURSIVE
    // WHEN CALLED WITH ITERATIONS AS ONLY PARAM, IT STARTS AS NEW
    
    /*
     * Metodo recursivo de aproximacion de pi
     * @return double aproximacion de pi
     * @param int iteraciones iteraciones hechas
     */
    public static double piAproximateRecursive(int iterations){
        return piAproximateRecursive(iterations, 0,0);
    }
}