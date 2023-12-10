import java.util.Scanner;

public class Main {
    public static int oddIterations = 0;
    public static int nIterations = 0;
    public static int nBy2Iterations = 0;
    public static int sqrtNIterations = 0;
    public static int sqrtN2Iterations = 0;
//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter the number to be chceked : ");
            number = sc.nextInt();
        }while(!(number > 0));


        boolean result1 = isPrimeN(number);
        boolean result2 = isPrimeNBy2(number);
        boolean result3 = isPrimeSqrtN(number);
        boolean result4 = isPrimeOddOnly(number);
        boolean result5 = isPrimeOddOnly2(number);
        System.out.println("Is prime with 'N' iterations, Number of iterations : "+ nIterations +" ");
        interpret(result1,number);
        System.out.println("Is prime with 'N/2' iterations, Number of iterations : "+ nBy2Iterations +" ");
        interpret(result2,number);
        System.out.println("Is prime with 'SquareRoot(n)' iterations, Number of iterations : "+ sqrtNIterations +" ");
        interpret(result3,number);
        System.out.println("Is prime with 'SquareRoot(n) odd' iterations, Number of iterations : "+ sqrtN2Iterations +" ");
        interpret(result5,number);
        System.out.println("Is prime with 'Eliminating even numbers' iterations, Number of iterations : "+ oddIterations +" ");
        interpret(result4,number);
    }



    public static void interpret(boolean result,int number) {
        if (result){
            System.out.println("The number "+ number +" is Prime. \n");
        }
        else {
            System.out.println("The number "+ number +" is not Prime. \n");
        }
    }

    public static boolean isPrimeN(int number){
        boolean prime = false;
        if (number == 1){
            prime = false;
        }
        else if (number == 2){
            prime = true;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    prime = false;
                    nIterations++;
                    break;
                }
                else {
                    prime = true;
                }
                nIterations++;
            }
        }
        return prime;
    }
    public static boolean isPrimeNBy2(int number){
        boolean prime = false;
        if (number == 1){
            prime = false;
        }
        else if (number == 2){
            prime = true;
        }
        else {
            for (int i = 2; i <= Math.ceil(number/2d); i++) {
                if (number % i == 0){
                    prime = false;
                    nBy2Iterations++;
                    break;
                }
                else {
                    prime = true;
                }
                nBy2Iterations++;
            }
        }
        return prime;
    }
    public static boolean isPrimeSqrtN(int number){
        boolean prime = false;
        if (number == 1){
            prime = false;
        }
        else if (number == 2){
            prime = true;
        }
        else {
            for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
                if (number % i == 0){
                    prime = false;
                    sqrtNIterations++;
                    break;
                }
                else {
                    prime = true;
                }
                sqrtNIterations++;
            }
        }
        return prime;
    }
    public static boolean isPrimeOddOnly(int number){
        boolean prime = false;
        if (number == 1){
            prime = false;
            return prime;
        }
        else if (number == 2){
            prime = true;
            return prime;
        }
        if ( number % 2 == 0){
            prime = false;
            return prime;
        }

        else {
            if (number == 3){
                prime = true;
                oddIterations++;
                return prime;
            }
            else {
            for (int i =  3; i < number; i+=2) {
                if (number % i == 0){
                    prime = false;
                    oddIterations++;
                    break;
                }
                else {
                    prime = true;
                }
                oddIterations++;
            }
        }
        }
        return prime;
    }
    public static boolean isPrimeOddOnly2(int number){
        boolean prime = false;
        if (number == 1){
            prime = false;
            return prime;
        }
        else if (number == 2){
            prime = true;
            return prime;
        }
        if ( number % 2 == 0){
            prime = false;
            return prime;
        }

        else {
            if (number == 3){
                prime = true;
                sqrtN2Iterations++;
                return prime;
            }
            else {
            for (int i =  3; i <= Math.ceil(Math.sqrt(number)); i+=2) {
                if (number % i == 0){
                    prime = false;
                    sqrtN2Iterations++;
                    break;
                }
                else {
                    prime = true;
                }
                sqrtN2Iterations++;
            }
        }
        }
        return prime;
    }

}