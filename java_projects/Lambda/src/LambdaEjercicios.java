import java.util.List;
import java.util.function.*;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class LambdaEjercicios{
    /*
    *
    * Ejercicio 12.
    * Explique qué es una expresión lambda.
    * Una expresión lambda es una función de uso único, sin nombre.
    * Sirve para hacer programación funcional con funciones que no van a ser reutilizadas
    *
    * Ejercicio 13.
    * El propósito del presente ejercicio es mostrar un uso básico de funciones lambda con listas.
    * Para ello se pide resolver el ejercicio 4 de tal forma que sea aplicable a diferentes
    * funciones reales de variable real.
    * La cabecera el método ha de ser la que se muestra a continuación:
    * public static double integral(double a, double b, double h,Function<Double, Double> funcion)
    */

    public static double integral(double a, double b, double h, Function<Double,Double> function)
    {
        //a and b are lower and upper limit respectively
        //h is the step, function is <param,  result> types
        //GENERATE A LIST OF LENGTH DIFFERENCE/STEP (DIFFERENCE = UPPER - LOWER LIMIT)
        //MAP EACH ELEMENT TO ITS VALUE AND SUM
        double sum = 0;
        for (double  i = 0; i < b; i += h)
        {
            sum += function.apply(i);
        }
        return sum;
    }

    /*
    *
    * Ejercicio 14.
    * Resuelva los siguientes apartados:
    * 1. Genere un stream de números mediante el método estático of de la clase IntStream.
    * 2. Genere un stream de números mediante el método estático range de la clase IntStream.
    * 3. Genere un stream de números mediante el método estático iterate de la clase IntStream.
    * 4. Genere un stream de números aleatorios utilizando el método doubles de la clase Random.
    */

    public static void ej14(int x){
        IntStream a = IntStream.of(x);
        IntStream b = IntStream.range(0,x);
        IntStream c = IntStream.iterate(x, e -> x);
        Random r = new Random();
        DoubleStream d = r.doubles();
    }

    /*
    * Ejercicio 15.
    * Resuelva los apartados del 1 al 12 del ejercicio 2, ambos inclusive, mediante expresiones lambda y streams.
    * !!!!RESUELTO EN LAMBDAEJ2.JAVA!!!!!
    *
    *
    * Ejercicio 16.
    * Resuelva el ejercicio 13 utilizando, no sólo expresiones lambda sino también streams.
    * */
    public static double integralWithStreams(double a, double b, double h, Function<Double,Double> function)
    {
        return DoubleStream
                .of(a,b)
                .boxed()
                .

    }
}