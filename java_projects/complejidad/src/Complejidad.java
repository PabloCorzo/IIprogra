import java.util.Arrays;
import java.util.stream.IntStream;

public class Complejidad {
    //34
    //¿Que es un algoritmo? 
    //Secuencia ordenada de pasos o instrucciones para resolver un problema  

    //35
    //Algoritmos equivalentes en 35.C
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int iterativeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //36
    //f(n) es O(g(n)) si y solo si existe un número real positivo c y un número entero no negativo n0 tal que:
    //lim cuando n->infinito de f(n)/g(n) < infinito

    //37
    //es 0(1) ya que el numero de instrucciones es constante

    //38
    //el primer metodo siempre va a devolver el primer elemento por lo que la complejidad es 0(1)
    //el segundo elemento realiza una unica operacion tambien, por lo que tambien es 0(1)

    //39
    //los 2 metodos de java y C son de complejidad 0(n)

    //40
    public static int listSum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
    //es de complejidad 0(n),donde n es el tamaño del array

    //41
    public static int recursiveListSum(int[] array, int i, int sum){
        if(i < 0) return sum;
        sum += array[i] ;
        return recursiveListSum(array, --i, sum);
    }
    public static int recursiveListSum(int[] array){
        return recursiveListSum(array,array.length-1,0);
    }
    //la complejidad es la misma que antes, 0(n), n siendo el tamaño del array

    //42
    // 0(n*n) = 0(n^2)

    //43
    public static double sumaEltosMatriz(double matriz[][]){
        double suma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                suma+=matriz[i][j];
            }
        }
        return suma;
    }
    //es de complejidad 0(f*c), f = filas y c = columnas

    //44
    public static boolean search(int e, int[] array){
        for(int i : array){
            if(i == e) return true;
        }
        return false;
    }
    // en el mejor caso es 0(1), en el peor 0(n) y de promedio 0(n/2), que sigue siendo 0(n)

    //45
    public static boolean binarySearch(int[] array,int e){
        System.out.println((Arrays.toString(array)));
        if (array.length == 1 && array[0] == e) return true;
        if (array.length == 1 && array[0] != e){System.out.println("osakachan"); return false;}
        int midpoint = (array.length/2);
        System.out.println("///////////////////");
        System.out.println("Midpoint: "+ midpoint + ": " + array[midpoint]);
        System.out.println("///////////////////");
        if(array[midpoint] > e){
            return binarySearch(IntStream.range(array[0], array[midpoint]).toArray(), e);
        }
        if(array[midpoint]< e){
            return binarySearch(IntStream.rangeClosed(array[midpoint], array[array.length-1]).toArray(), e);
        }
        if(array[midpoint] == e) return true;
        System.out.println(midpoint);
        System.out.println(array[midpoint]);
        return false;
    }
    //en el peor de los casos es log n
    //la búsqueda binaria reduce el espacio de búsqueda a la mitad en cada iteración
    //el número de iteraciones necesarias para encontrar un elemento en el peor caso es logarítmico en función del tamaño del array original,
    //ya que logarítmico es la inversa de una función exponencial.

    //46
    //si se usa una recursiva con memoria, será 0(n) ya que cada llamada sera hecha una vez sin repetirse
    //si no se usa memoria, sera 0(2^n) ya que las llamadas se repetiran a un ritmo exponencial (1,2,4,8,16,32,64,......,2^n)

    //47
    //Tiene aspecto de 0, ya que con inputs grandes el tiempo crece a un ritmo similar al del input

    //48
    //Tiene aspceto de 0(n^2), ya que el ritmo al que crece el tiempo es exponencialmente mayor al ritmo de crecimiento de los inputs

    //49
    //Se refiere a la cota superior de el crecimiento de una funcion (T(n)) con respecto a otra (f(n) multiplicada por una constante k)
    
    //50
    //1. Encontrar k y n0 que muestren que la siguiente función, T : N → N,es de orden O(log2(n)).T (n) = 3 · log2(n) + 2.
    //k = 3; n0 = 2.
    //2. ¿Si T (n) ∈ O(log2(n)), entonces T (n) ∈ O(n)? Justifique la respuesta.
    //No porque aunque O(log2(n)) siempre esté debajo de 0(n) la notación se refiere a la cota superior cuando se tiende al infinito, 
    //que nunca sobrepasará un múltiplo de log2(n)
    //3. ¿Si T (n) ∈ O(log3(n)), entonces T (n) ∈ O(log2(n))? Justifique la respuesta
    //Si porque el crecimiento sería proporcional a una constante (k), lo cual cumple con la definición
    
    //51
    //1. f0(x) = 1 -> Constante, sin crecimiento
    //2. f1(x) = x -> Constante, igual a x (como una recta diagonal de 45%)
    //3. f2(x) = x^2 -> Exponencial, igual a el cuadrado del input(crecimiento cuadrático) 
    //4. f3(x) = log2(x) -> Inverso a la exponencial, crece mucho más lento, sobre todo para x mayores
    //5. f4(x) = 2^x. -> -> Exponencial, va creciendo en potenicas de 2(hiperbólico)
    
    //52
    public static int f(int n) {
        if (n == 0) return 1;
        else if (n < 0) return -1;
        else{
            int m = 1/f(n/2) + f(n/2);
            return sum(m);
        }
    }
    //es 0(2log(n),ya que se divide a la mitad el input de manera recursiva pero se va llamando de 2 en 2) 
    
    //53
    //Si. Si el arraylist está ordenado se puede usar una busqueda binaria para encontrar su lugar e introducirlo, que tiene complejidad O(log(n)).
    //Si no está ordenado,puede introducirse siempre en el mismo lugar(O(1)) o buscar su sitio (O(n))

    //54 ->10ns *n, n = 100
    //1. log(n) -> log(100) = 10 llamadas = 100 ns
    //2. n -> 100 llamadas =  1000 ns
    //3. nlog(n) -> 1000 llamadas = 10 000 ns
    //4. n^2 -> 10 000 llamadas =  100 000 ns
    //5. n^8 -> 10 000 000 000 000 000 llamadas = 100 000 000 000 000 000 ns
    //6. 10^n -> 10^100 llamadas = 10^101 ns
    //Realice los cálculos anteriores, pero ahora bajo los siguientes supuestos:
    //1. n = 100.000.
        //1. log(n) -> log(100 000) = 10 000 llamadas = 100 000ns
        //2. n -> 100 000 llamadas =  1 000 000ns
        //3. nlog(n) -> 10^5*10^4 llamadas = 10^10ns
        //4. n^2 -> 10^10 llamadas =  10^11ns
        //5. n^8 -> 10^390625 llamadas = 10^390626ns
        //6. 10^n -> 10^100 000 llamadas = 10^100 001ns
    //2. n = 100.000
        //1. log(n) -> log(100 000) = 10 000 llamadas = 10 000 ms = 10s
        //2. n -> 100 000 llamadas =  100s
        //3. nlog(n) -> 10^5*10^4 llamadas = 10^6s
        //4. n^2 -> 10^10 llamadas =  10^7
        //5. n^8 -> 10^390625 llamadas = 10^390622s
        //6. 10^n -> 10^100 000 llamadas = 10^999 997s 
        //y el tiempo de instrucción (o bloque de instrucciones) 1ms

    //55
    //El número de estados de juego es tan grande que supera los límites computacionales con grandes márgenes, por lo que no ha sido resuelto todavía.  

}