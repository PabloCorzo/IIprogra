package app;

import maths.Maths;

public class Main{

    /*
     * metodo main
     * @param args numero de iteraciones
     */
    public static void main(String[] args) {
        // System.out.println("El numero Pi es " + Maths.piAproximateIterative((long)Integer.parseInt(args[0])));
        System.out.println("El numero Pi es " + Maths.piAproximateIterative(Integer.parseInt(args[0])));
    }
}