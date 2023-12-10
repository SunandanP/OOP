import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(": Area Calculator :");
        Shape shape;
        int input = -1;
        while (input != 0){
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            input = scanner.nextInt();
            switch (input){
                case 0:
                    break;
                case 1:
                    shape = new Circle();
                    shape.computeArea();
                    break;
                case 2 :
                    shape = new Triangle();
                    shape.computeArea();
                    break;
                case 3:
                    shape = new Rectangle();
                    shape.computeArea();
                    break;
            }

        }
    }
}
