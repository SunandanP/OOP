import java.util.Scanner;

public class Sum {
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return sum(n-1)+(n);
        }
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
}
