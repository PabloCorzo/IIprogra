package app;

import maths.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("El numero Pi es " + Maths.piAproximateIterative(Integer.parseInt(args[0])));
    }
}