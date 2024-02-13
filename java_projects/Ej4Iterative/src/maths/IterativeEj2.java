package maths;

public class IterativeEj2 {

    //1
    public static int sum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i ++){
            sum += i;
        }
        return sum;
    }

    //2
    public static int fact(int n){
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }

    //3
    public static int power(int base, int power){
        int sum = 1;
        for(int i = 0; i < power; i ++){
            sum *= base;
        }
        return sum;
    }

    
    //4
    public static int sumOfElements(int[] array){
        int sum = 0;
        for(int i : array){
            sum += array[i-1];
        }
        return sum;
    }
    
    //4
    public static double sumOfElements(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    
    //5
    public static double average(int[] array){
        return sumOfElements(array)/array.length;
    }
    
    //6
    public static double deviation(int[] array){
        double sum = 0;
        System.out.println((double)55/10);
        double mean = (double)sumOfElements(array)/array.length;
        double[] squareddiffs = new double[array.length];
        for(int i = 0; i < array.length; i++){
            squareddiffs[i] = Math.pow(array[i]-mean, 2);
        }
        sum = sumOfElements(squareddiffs);
        return Math.sqrt(sum/array.length);
    }
    
    //7
    public static int evenSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    //8
    public static int evenArraySum(int[] array){
        int sum = 0;
        for(int i : array){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    //9
    public static String evenCollector(int[] array){
        int evencount = 0;
        for(int i : array){
            if(i%2 == 0){
                evencount++;
            }
        }
        int[] evens = new int[evencount];
        int x = 0;
        String s = "{";
        for(int i : array){
            if(i%2 == 0){
                evens[x] = i;
                s += i + ",";
                x++;
                
            }
        }
        s += "}";
        return s;
    }
    
    //10
    public static String evenList(int n){
        String s = "{";
        for(int i = n ; i >= 2; i--){
            if(i%2 == 0){
                s += i + ",";
            }
        }
        return s;
    }
    
    //11
    public static int product(int[] a1,int[] a2){
        int sum = 0;
        for(int i = 0; i < a1.length; i++){
            sum += a1[i] * a2[i];
        }
        
        return sum;
    }
    static int[] arr = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        //1
        System.out.println(sum(10));
        //2
        System.out.println(fact(6));    
        //3
        System.out.println(power(2, 10));
        //4
        System.out.println(sumOfElements(arr));
        //5
        System.out.println(average(arr));
        //6
        System.out.println(deviation(arr));
        //7
        System.out.println(evenSum(6));
        //8
        System.out.println(evenArraySum(arr));
        //9
        System.out.println(evenCollector(arr));
        //10
        System.out.println(evenList(8));
        //11
        System.out.println(product(arr, arr));
    }

}
 