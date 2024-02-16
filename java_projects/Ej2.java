import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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

    public static ArrayList<Integer> evenCollector(int[] array){
        ArrayList arrayl = new ArrayList<>();
        return evenCollector(array,0,arrayl);
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

    
    static int[] array = {1,2,3,4,5,6,7,8,9,10};
    static double[] array2 = {1.1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenCollector(array)));
    }
}
