import java.util.Scanner;

public class Greet {
    static Scanner scanner =new Scanner(System.in);
    public static void greet(String name){
        System.out.println("Hello, "+name);
    }

    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        String name = scanner.next();
        greet(name);
    }
}
