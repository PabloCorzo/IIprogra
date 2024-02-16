package maths;

import java.util.Random;

public class Maths{
    // circular target of radius 1 unit inside square of length 2 units 
    // throw random darts, register xy coordinates
    // darts inside circle to total darts ratio equals circle area to square area ratio
    // d/t = pi/4
    // can be simulated using only 1 4th of the circle
    // point is inside: x^2 + y^2 <= R 
    static int i = 0;
    static Random r = new Random();
    static int insideI = 0;

    /*
     * Metodo de aproximacion de pi
     * @param int iteraciones iteraciones hechas
     * @return double aproximacion de pi
     */
    public static double piAproximateIterative(int iterations){
        double x;
        double y;
        for(int i =0;i<iterations;i++){
            x = r.nextDouble() * 1;
            y = r.nextDouble() * 1;
            if(((Math.pow(x, 2))+(Math.pow(y, 2))) <= 1){
                // System.out.println("Printilin celebratorio");
                insideI++;
            }
        }
        System.out.println("Printilin final: " + insideI + " de " + iterations );
        System.out.println("Printilin matematico: " + 4*((double)insideI/(double)iterations));

        return 4*((double)insideI/(double)iterations);
    }

    // RECURSIVE

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

    /*
     * Metodo main
     * @param args sin uso
     */
    public static void main(String[] args) {
        System.out.println(piAproximateIterative(10000));
        // System.out.println(piAproximateRecursive(1000));
    }
}