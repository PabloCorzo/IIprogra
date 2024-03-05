package maths;

import java.util.stream.IntStream;
import java.util.Random;

public class Darts {

    static Random r = new Random();

    public static double piAproximate(int iterations){
    return 4*(IntStream
    .rangeClosed(1, iterations)
    .mapToDouble(e -> (double) e)
    .map(e -> Math.pow(r.nextDouble()*1, 2) + Math.pow(r.nextDouble()*1, 2))
    .filter(e -> e <= 1)
    .map(e -> 1)
    .sum()/iterations);
    }    

}