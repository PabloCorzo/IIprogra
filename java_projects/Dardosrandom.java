import java.util.Random;

public class Dardosrandom{
    // circular target of radius 1 unit inside square of length 2 units 
    // throw random darts, register xy coordinates
    // darts inside circle to total darts ratio equals circle area to square area ratio
    // d/t = pi/4
    // can be simulated using only 1 4th of the circle
    // point is inside: x^2 + y^2 <= R 
    static int i = 0;
    static double val;
    static Random r = new Random();
    static int total = 10000;
    static int counter = 0;
    static int inside = 0;

    public static void setTest(int iterations){
        counter = 0;
        inside = 0;
        total = iterations;
    }

    public static double piAproximateIterative(){
        double x;
        double y;
        for(int i =0;i<total;i++){
            x = r.nextDouble() * 1;
            y = r.nextDouble() * 1;
            if(((Math.pow(x, 2))+(Math.pow(y, 2))) <= 1){
                // System.out.println("Printilin celebratorio");
                inside++;
            }
        }
        System.out.println("Printilin final: " + inside + " de " + total );
        System.out.println("Printilin matematico: " + 4*((double)inside/(double)total));

        return 4*((double)inside/(double)total);
    }

    public static double piAproximateRecursive(int iterations){
        if(i >= iterations){
            return 4*((double)inside/(double)iterations);
        } 
        else{
            i++;
            System.out.println(i);
            double x = r.nextDouble() * 1;
            double y = r.nextDouble() * 1;
            if(((Math.pow(x, 2))+(Math.pow(y, 2))) <= 1){
                inside++;
            }
            return piAproximateRecursive(iterations);
        }
    }

    public static void main(String[] args) {
        // System.out.println(piAproximateIterative());
        System.out.println(piAproximateRecursive(100));
    }
}