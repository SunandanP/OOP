import java.util.Scanner;

public class primePair{
    public static int Iterations = 0;
    public static void main(String [] args){
        int upperBound;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where the pairs should be displayed : ");
        upperBound = sc.nextInt();
        int counter = 1;
        if (upperBound >1){
            System.out.print("2,3    ");
            for (int i = 1; i <= upperBound ; i++) {
                if (isPrime(i) && isPrime(i+2)){
                    System.out.print(i+","+(i+2)+"    ");
                    counter++;
                    if (counter % 5 ==0){
                        System.out.println("\n");
                    }
                }

            }
            System.out.println("\n\nIterations performed : "+Iterations);

        }
        else {
            System.out.println("No pairs found!");
        }

    }
    public static boolean isPrime(int number){
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
                Iterations++;
                return prime;
            }
            else {
                for (int i =  3; i <= Math.ceil(Math.sqrt(number)); i+=2) {
                    if (number % i == 0){
                        prime = false;
                        Iterations++;
                        break;
                    }
                    else {
                        prime = true;
                    }
                    Iterations++;
                }
            }
        }
        return prime;
    }
}