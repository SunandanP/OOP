import java.util.Scanner;

public class Rectangle extends Shape {
    static Scanner sc = new Scanner(System.in);
    @Override
    void computeArea() {
        System.out.println("Area : "+(x*y));
    }
    public Rectangle(){
        System.out.println("Enter length : ");
        x = sc.nextDouble();
        System.out.println("Enter breadth : ");
        y = sc.nextDouble();
    }
}
