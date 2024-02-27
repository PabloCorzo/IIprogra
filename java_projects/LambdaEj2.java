import java.util.function.IntUnaryOperator;
import java.util.stream.*;

public class LambdaEj2{

    //1
    IntUnaryOperator sumOfN= x -> IntStream.rangeClosed(0,x).sum();

    //2
    // IntUnaryOperator product = x -> IntStream.rangeClosed(1, x);
    // int product = n -> IntStream.range(1, n)
    //             .reduce((n1,n2)-> n1 * n2);
    IntUnaryOperator product = n -> IntStream.rangeClosed(1, n).reduce((n1,n2) -> n1*n2).getAsInt();
    //3
    //4
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

    public static void main(String[] args) {
        System.out.println();
    }
}