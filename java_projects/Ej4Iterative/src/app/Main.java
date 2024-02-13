package app;

import maths.*;

public class Main{

    static int[] arr = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        //1
        System.out.println(IterativeEj2.sum(10));
        //2
        System.out.println(IterativeEj2.fact(6));    
        //3
        System.out.println(IterativeEj2.power(2, 10));
        //4
        System.out.println(IterativeEj2.sumOfElements(arr));
        //5
        System.out.println(IterativeEj2.average(arr));
        //6
        System.out.println(IterativeEj2.deviation(arr));
        //7
        System.out.println(IterativeEj2.evenSum(6));
        //8
        System.out.println(IterativeEj2.evenArraySum(arr));
        //9
        System.out.println(IterativeEj2.evenCollector(arr));
        //10
        System.out.println(IterativeEj2.evenList(8));
        //11
        System.out.println(IterativeEj2.product(arr, arr));
    }
}