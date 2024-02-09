public class Ej2{

    //recursive methods
    
    //sum from 0 to n
    //iterator
    // static int i = 0;
    //sum
    // static int x = 0;
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

    public static int fact(int n,int sum, int counter){
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

    public static double deviation(int[] array){
        return 6.9;
    }
    static int[] array = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(fact(6));
        System.out.println(power(2, 3));
        System.out.println(sumOfElements(array));
        System.out.println(average(array));
        System.out.println();
    }
}