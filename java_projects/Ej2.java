import java.util.ArrayList;
import java.util.Arrays;


public class Ej2{

    //recursive methods
    
    //1
    public static int sum(int n,int sum, int counter){
        //adds sum and advances iterator
        sum += counter;
        counter++;
        if(counter == n+1){
            return sum;
        }
        else{
            return sum(n,sum,counter);
        }
    }
    public static int sum(int n){
        return sum(n, 0, 0);
    }

    //2
    public static int fact(int n,int sum, int counter){
        if(n == 0){return 1;}
        //adds sum and advances iterator
        counter++;
        sum *= counter;       
        if(counter == n){
            return sum;
        }
        else{
            return fact(n,sum, counter);
        }
    }
    public static int fact(int n){
        return fact(n, 1, 0);
    }

    //3
    public static int power(int base,int power,int sum,int counter){
        //multiplies sum by number and increases counter
        sum *= base;
        counter++;
        if(counter == power){
            return sum;
        }
        else{
            return power(base, power,sum,counter);
        }
    }
    public static int power(int base, int power){
        return power(base, power, 1, 0);
    }

    //4
    public static int sumOfElements(int[] array, int sum, int i){
        int n = array.length;
        sum += array[i];
        i++;

        if(i == n){
            return sum;
        }
        
        else{
            return sumOfElements(array,sum,i);
        }
    }
    public static int sumOfElements(int[] array){
        return sumOfElements(array, 0 ,0);
    }

    public static double sumOfElements(double[] array, double sum, int i){
        if(i == array.length){
            return sum;
        }
        else{
            return sumOfElements(array, sum + array[i], ++i);
        }
    }

    public static double sumOfElements(double[] array){
        return sumOfElements(array,0,0);
    }

    //5
    public static double average(int[] array,int sum,int i){
        int n = array.length;
        sum  += array[i];
        i++;

        if(i == n){
            return sum/n;
        }
        else{
            return average(array,sum,i);
        }
    }
    public static double average(int[] array){
        return average(array, 0, 0);
    }

    //6
    // recursively converting each array item subtracting avg and squaring it
    // sum it up, divide by total, sqrt of that is answer
    public static double deviation(double[] array,int iterations,double average){
        array[iterations] = Math.pow(array[iterations] - average,2);
        if(iterations == 0){
            return Math.sqrt(sumOfElements(array)/array.length);
        }
        else{
            return deviation(array, iterations - 1,average);
        }
    }

    public static double deviation(int[] array){
        return deviation(Arrays.stream(array).mapToDouble(i -> i).toArray(), array.length,average(array));
    }

    public static double deviation(double[] array){
        return deviation(array, array.length - 1, (sumOfElements(array))/(array.length));
    }

    //7
    public static int evenSum(int n, int sum){
        if(n%2 != 0){
            return evenSum(n-1,sum);
        }
        else{
            if(n<2){
                return sum;
            }
            else{
                return evenSum(n-2, sum+n);
            }

        }
    }

    public static int evenSum(int n){
        return evenSum(n, 0);
    }


    //8
    public static int arrayEvenSum(int[] array, int sum, int i){
        if (i == 0){
            return sum;
        }
        else{
            i--;
            if(array[i]%2 == 0){
            return arrayEvenSum(array, sum + array[i], i);
            }
            else{
            return arrayEvenSum(array, sum, i);
            }
        }
    }

    public static int arrayEvenSum(int[] array){
        return arrayEvenSum(array, 0, array.length);
    }

    //9
    public static ArrayList<Integer> evenCollector(int[] array,int i, ArrayList<Integer> result){
        if(i == array.length){
            return result;
        }
        else{
            if(array[i]%2 == 0){
                result.add(array[i]);
            }
            return evenCollector(array, ++i, result);
        }
    }
    
    //10
    public static ArrayList<Integer> evenList(int n, ArrayList<Integer> array){
        if(n == 0){
            return array;
        }
        else{
            if(n%2 == 0){
                array.add(n);
                return evenList(n-2,array);
            }
            else{
                return evenList(n-1,array);
            }
        }
    }

    public static ArrayList<Integer> evenList(int n){
        return evenList(n, new ArrayList<Integer>());
    }

    //11
    public static int product(int[] array1,int[] array2, int sum, int i){
        if(i == array.length){
            return sum;
        }
        else{
            sum += array[i] * array2[i];
            return product(array1, array2, sum, ++i);
        }
    }

    public static int product(int[] array, int[] array2){
        return product(array, array2, 0, 0);
    }

    //12
    public static int fibonacci(int n, int i, int j){
        if(n == 0){
            return j + i;
        }
        else{
            j += i;
            i = j - i;
            return fibonacci(--n, i, j);
        }
    }

    public static int fibonacci(int n){
        return fibonacci(n,1,0);
    }

    //13 and 14
    public static void fibonacci1213(){
        double twelve = (double)fibonacci(12);
        double thirteen = (double)fibonacci(13);
        System.out.println("(1+raiz(5))/2 = " + (1+Math.sqrt(5))/2);
        System.out.println("Razon entre elementos 12 y 13 de fibonacci: " +thirteen/twelve);
        System.out.println("La razon entre 2 elementos consecutivos de la secuencia de fibonacci se acerca cada vez mas a la razon aurea ");
    }
    
    static int[] array = {1,2,3,4,5,6,7,8,9,10};
    static double[] array2 = {1.1,2,3,4,5,6,7,8,9,10};

    //EJERCICIO 4
    static double integralEXCuadrado(double limInf, double limSup, double h){
        if(limInf >= limSup){
            return 0;
        }
        else{
            limInf += h;
            double x = Math.pow(Math.exp(1), Math.pow(limInf, 2));
            return x + integralEXCuadrado(limInf, limSup, h);
        }
    }

    //EJERCICIO 6
    public static int sumaCodigos(String str){
        if(str.isEmpty()){
            return 0;
        }
        else{
            int x = (int)str.charAt(0);
            return x + sumaCodigos(str.substring(1));
        }
    }
    

    //EJERCICIO 7

    public static String cifrarCadena(String str, int desplazamiento){
        
        if(str.isEmpty()){
            return "";
        }
        else{
            if(letters.get(letters.indexOf(str.charAt(0)+"")).equalsIgnoreCase(" ")){
                return " " + cifrarCadena(str, desplazamiento);
            }   
            else if(letters.indexOf(str.charAt(0)+"") == -1){
                return str.charAt(0) + cifrarCadena(str.substring(1),desplazamiento);
            }
            else{
                int newindex = letters.indexOf(str.charAt(0)+"") + desplazamiento;
                if(newindex >= letters.size()){
                    newindex -= letters.size();
                }    
                return letters.get(newindex) + cifrarCadena(str.substring(1), desplazamiento);
            }    
        }
    }
    public static String conCodigoPar(String str){
        if(str.isEmpty()){
            return "";
        }
        else{
            if(str.charAt(0)%2 == 0){
                return str.charAt(0) + conCodigoPar(str.substring(1));
            }
            else{
                return conCodigoPar(str.substring(1));
            }
        }
    }
    
    static ArrayList<String> letters = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", 
    "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    
    public static void main(String[] args) {
        // System.out.println(evenList(14));
        // System.out.println(product(array, array));
        System.out.println(fibonacci(5));
        fibonacci1213();
        System.out.println(conCodigoPar("Llego mañana"));
    }
}
