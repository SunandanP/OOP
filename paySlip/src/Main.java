import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, address, employeeId, designation, panId;
        int age, basicPay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Address :");
        address = sc.next();
        System.out.println("Enter Age :");
        age = sc.nextInt();
        System.out.println("Enter Employee ID :");
        employeeId = sc.next();
        System.out.println("Enter Designation :");
        designation = sc.next();
        System.out.println("Enter PAN ID :");
        panId = sc.next();
        System.out.println("Enter Basic Pay :");
        basicPay = sc.nextInt();

        Employee e = new Employee(name, address, age, employeeId, designation, panId, basicPay);
        e.display();

    }


}