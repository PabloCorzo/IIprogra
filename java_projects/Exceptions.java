import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exceptions{
//Modifique el código del ejercicio 2 para que se eleve una exepción cuando haya una entrada no válida
//(por ejemplo, un número menor que 0 en la suma de los números naturales hasta n).

    //1
    static int sum(int n){
        if(n < 0) throw new IllegalArgumentException("Input invalido, imbecil.");
        return IntStream.rangeClosed(0, n).sum();
    }

    //2
    static int factorial(int n){
        if(n < 0) throw new IllegalArgumentException("Input invalido, imbecil.");
        return IntStream.rangeClosed(1, n)
        .reduce((x,y)-> x*y)
        .orElse(1); 
    }  

    //3
    static int power(int base, int exp){
        if(exp < 0 ) throw new IllegalArgumentException("Input invalido, imbecil.");
        return IntStream
        .rangeClosed(1,exp)
        .map(e -> base)
        .reduce((x,y) -> x*y)
        .orElse(1);
    }

    //4
    static int listSum(List<Integer> l){
        if(l.isEmpty()) throw new IllegalArgumentException("Input invalido, imbecil.");
        return l
        .stream()
        .mapToInt(Integer :: intValue)
        .sum();
    }

    //5
    static double average(List<Integer> l){
        if(l.isEmpty()) throw new IllegalArgumentException("Input invalido, imbecil.");
        return (double) listSum(l)/l.size();
    }

    //6
    static double deviation(List<Integer> l){
        if(l.isEmpty()) throw new IllegalArgumentException("Input invalido, imbecil.");
        double avg = average(l);
        return Math.sqrt(l
        .stream()
        .map(e -> Math.pow(e-avg, 2))
        .mapToDouble(e -> (double) e)
        .sum()
        /l.size());
    }

    //7
    static int evenSum(int n){
        if(n < 2) throw new IllegalArgumentException("Input invalido, imbecil.");
        return IntStream
        .rangeClosed(2, n)
        .filter(e -> e%2 == 0)
        .sum();
    }

    //8
    static int listEvenSum(List<Integer> l){
        if(l.isEmpty()) throw new IllegalArgumentException("Input invalido, imbecil.");
        return l
        .stream()
        .filter(e -> e%2 == 0)
        .mapToInt(Integer :: intValue)
        .sum();
    }

    //9
    static ArrayList<Integer> getEvenList(List<Integer> l){
    if(l.isEmpty()) throw new IllegalArgumentException("Input invalido, imbecil.");
    ArrayList<Integer> arr = new ArrayList<>();
    l.stream()
    .filter(e -> e%2 == 0)
    .forEach(arr::add);
    return arr;
    }

    //10
    static ArrayList<Integer> reverseEvenList(int n){
        if(n < 2) throw new IllegalArgumentException("Input invalido, imbecil.");
        ArrayList<Integer> arr = new ArrayList<>();
        IntStream.rangeClosed(2, n)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .filter(e -> e % 2 == 0)
        .forEach(e -> arr.add(e));
        return arr;
    }

    //11
    static int listProduct(List<Integer> l1, List<Integer> l2){
        if(l1.size() != l2.size()) throw new IllegalArgumentException("Input invalido, imbecil.");
        if(l1.isEmpty() || l2.isEmpty()) throw new IllegalArgumentException("Input invalido, imbecil.");
        return IntStream
        .range(0, l1.size())
        .map(e -> l1.get(e)*l2.get(e))
        .sum();
    }

    //12 
    static int fib(int n){
        if(n == 0) return 0;
        if(n < 0) throw new IllegalArgumentException("Input invalido, imbecil.");
        return Stream.iterate(new int[]{0,1}, e -> new int[]{e[1],e[0]+e[1]})
        .limit(n)
        .reduce((a,b) -> b)
        .orElse(new int[]{0,1})[1];
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> empty = List.of();
        // System.out.println(sum(0));
        // System.out.println(sum(10));
        // // System.out.println(sum(-10));
        // System.out.println(factorial(0));
        // System.out.println(factorial(6));
        // // System.out.println(factorial(-1));
        // System.out.println(power(2, 1));
        // System.out.println(power(2, 3));
        // System.out.println(power(2, -1));
        // System.out.println(listSum(list));
        // System.out.println(listSum(empty));
        // System.out.println(average(list));
        // System.out.println(average(empty));
        // System.out.println(deviation(list));
        // System.out.println(deviation(empty));
        // System.out.println(evenSum(8));
        // System.out.println(evenSum(-9));
        // System.out.println(listEvenSum(list));
        // System.out.println(listEvenSum(empty));
        // System.out.println(getEvenList(list));
        // System.out.println(getEvenList(empty));
    }
}