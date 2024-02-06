import java.util.Random;

public class Dardosrandom{
    // circular target of radius 1 unit inside square of length 2 units 
    // throw random darts, register xy coordinates
    // darts inside circle to total darts ratio equals circle area to square area ratio
    // d/t = pi/4
    // can be simulated using only 1 4th of the circle
    // point is inside: x^2 + y^2 <= R 

    public static double piAproximate(){
        double x;
        double y;
        int total = 10000;
        int inside = 0;
        Random r = new Random();
        for(int i =0;i<total;i++){
            x = r.nextDouble() * 0.99;
            y = r.nextDouble() * 0.99;
            if(((Math.pow(x, 2))+(Math.pow(y, 2))) <= 1){
                // System.out.println("Printilin celebratorio");
                inside++;
            }
        }
        System.out.println("Printilin final: " + inside + " de " + total );
        System.out.println("Printilin matematico: " + 4*((double)inside/(double)total));

        return 4*((double)inside/(double)total);
    }

    public static void main(String[] args) {
        System.out.println(piAproximate());
    }
}