import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class LambdaEj2{

    //1
    static int sumOfN(int x)
    {
        return IntStream.rangeClosed(0,x).sum();
    }

    //2
    static int factorial(int n)
    {
        return IntStream.rangeClosed(1, n).reduce((n1,n2) -> n1*n2).orElse(1);
    }

    //3
    static int power(int base, int power)
    {
        return IntStream.rangeClosed(1, power)
        .map(e -> base)
        .reduce((e,d) -> e*d)
        .orElse(1);
    }

    
    //4
    static int sumOfList(List<Integer> list)
    {
        return list
        .stream()
        .mapToInt(Integer :: intValue)
        .sum();
    }


    //5
    static double avg(List<Integer> list)
    {
        return list
        .stream()
        .mapToInt(Integer :: intValue).
        average()
        .orElse(0);
    }
    static double avgDouble(List<Double> list)
    {
        return list
        .stream()
        .mapToInt(Double :: intValue)
        .average()
        .orElse(0);
    }

    //6
    static double deviation(List<Integer> list)
    {
        double x = avg(list);
        double average = avgDouble(list
        .stream()
        .mapToDouble(Integer :: doubleValue)
        .map(e -> Math.pow(e - x, 2))
        .boxed()
        .collect(Collectors.toList()));
        return Math.sqrt(average);
        // return 0;
    }

    //7
    static int evenSum(int n)
    {
        int sum = IntStream
        .rangeClosed(1, n)
        .filter(e -> e%2 == 0)
        .sum();
        return sum;
    }

    //8
    static int evenSumofList(List<Integer> list)
    {
        int sum = list
        .stream()
        .filter(e -> e%2 == 0)
        .mapToInt(Integer :: intValue)
        .sum();
        return sum;
    }

    //9
    static ArrayList<Integer> getEvenList(List<Integer> list)
    {
     ArrayList<Integer> arr = new ArrayList<>();
     list.stream()
     .filter(e -> e%2 == 0)
     .forEach(arr::add);
     return arr;
    }

    //10
    static ArrayList<Integer> getEvens(int n)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        IntStream.rangeClosed(2, n)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .filter(e -> e % 2 == 0)
        .forEach(e -> arr.add(e));
        return arr;
    }

    //11
    static int listProduct(List<Integer> l1, List<Integer> l2)
    {
        if(l1.size() != l2.size()) return -1;
        return IntStream
                .range(0,l1.size())
                .mapToObj(e -> l1.get(e) * l2.get(e))
                .mapToInt(Integer :: intValue)
                .sum();
    }


    //12
    //REDO
    static int fibonacci(int n)
    {
        if(n == 0) return 0;
        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
        .limit(n)
        .reduce((a, b) -> b)
        .orElse(new int[]{0,1})[1];
    }

    static List<Integer> list2 = List.of(1,2,3,4,5, 6, 7, 8, 9,10);

    public static void main(String[] args) {
        System.out.println(sumOfN(10));
        System.out.println(factorial(6));
        System.out.println(power(2, 3));
        System.out.println(power(5, 2));
        System.out.println(power(2, 5));
        System.out.println(avg(list2));
        System.out.println(deviation(list2));
        System.out.println(evenSum(10));
        System.out.println(evenSumofList(list2));
        System.out.println(getEvenList(list2));
        System.out.println(getEvens(16));
        System.out.println(listProduct(list2,list2));
        System.out.println("0: " + fibonacci(0));
        System.out.println("1: " + fibonacci(1));
        System.out.println("2: " + fibonacci(2));
        System.out.println("3: " + fibonacci(3));
        System.out.println("4: " + fibonacci(4));
        System.out.println("5: " + fibonacci(5));
    }
}