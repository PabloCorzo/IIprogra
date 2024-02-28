import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class LambdaEj2{

    //1

    // static IntUnaryOperator sumOfN = x -> IntStream.rangeClosed(0,x).sum();

    //2
    // static IntUnaryOperator product = n -> IntStream.rangeClosed(1, n).reduce((n1,n2) -> n1*n2).orElse(1);

    //3
    // static IntBinaryOperator power = (b,p) -> (int)Math.pow(b, p);
    
    //4
    static int sumOfList(List<Integer> list)
    {
        return list.stream().mapToInt(Integer :: intValue).sum();
    }


    //5


    //6


    //7


    //8
    //9
    //10
    //11
    //12
    //13
    //14

    static List<Integer> list2 = List.of(1,2,3,4,5, 6, 7, 8, 9,10);

    public static void main(String[] args) {
        // System.out.println(sumOfN.applyAsInt(10));
        // System.out.println(product.applyAsInt(6));
        // System.out.println(product.applyAsInt(0));
        // System.out.println(power.applyAsInt(2, 3));
        System.out.println(sumOfList(list2));
    }
}