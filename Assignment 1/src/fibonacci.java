import java.util.Scanner;

public class fibonacci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which term fibonacci series should be calculated : ");
        int num = sc.nextInt();
        System.out.println("------------------ Fibonacci non recursive ---------------------------");
        fibonacciSeries(num);
        System.out.println("\n------------------ Fibonacci recursive -------------------------------");
        fibonacci_Series_Generator(num);

    }
    public static void fibonacciSeries(int nTerms){
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i <= nTerms; i++) {
            System.out.print(" "+a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static int recursiveFibonacci(int nTerms){
        if ( nTerms > 0 ) {
            if (nTerms == 1) {
                return 0;
            } else if (nTerms == 2) {
                return 1;
            }
            return (recursiveFibonacci(nTerms-1) + recursiveFibonacci(nTerms-2));
        }else return -1;
    }
    public static void fibonacci_Series_Generator(int num){
        for (int i = 1; i <= num; i++) {
            System.out.print(" "+recursiveFibonacci(i));
        }
    }

}
