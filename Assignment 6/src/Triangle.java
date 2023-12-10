import java.util.Scanner;

public class Triangle extends Shape {
    static Scanner sc = new Scanner(System.in);
    @Override
    void computeArea() {
        System.out.println("Area : "+(x*y*0.5));
    }
    public Triangle(){
        System.out.println("Enter length of base : ");
        x = sc.nextDouble();
        System.out.println("Enter length of height : ");
        y = sc.nextDouble();
    }
}
