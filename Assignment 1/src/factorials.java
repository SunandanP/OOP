import java.util.Scanner;

public class factorials {
        public static void main(String[] args) {
            System.out.println("----------- Factorial of given Number ---------");
            System.out.println("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.println("----------- Basic factorial method ---------");
            System.out.println("The factorial of "+number+" is "+factorial(number)+"\n");
            System.out.println("----------- Recursive factorial method ---------");
            System.out.println("The factorial of "+number+" is "+recursiveFactorial(number)+"\n");

        }
        public static int factorial(int number){
            int factorial = 1;
            if (number == 0){
                return 1;
            }
            if (number > 0){
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                return factorial;
            }
            else {
                System.out.println("Invalid input!");
                return -1;
            }

        }
        public static int recursiveFactorial(int number){
            if (number == 0){
                return 1;
            }
            else if (number == 1){
                return 1;

            }
            else if (number > 1){
                return (number * recursiveFactorial(number-1));
            }
            return -1;
        }
    }