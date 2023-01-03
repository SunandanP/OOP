public class Employee extends Person{

    private String employeeId, designation,panId;
    private int basicPay;


    Employee(String name, String address, int age, String employeeId, String designation, String panId, int basicPay) {
        super(name, address, age);
        this.basicPay = basicPay;
        this.employeeId = employeeId;
        this.designation = designation;
        this.panId = panId;
    }

    void calculate(){
        double hra = 0.3;
        double da = (float) 0.9, incentive = 5000, tax = 200, pf = 0.1, gross = 0, net = 0;
        hra *= basicPay;
        da *= basicPay;
        pf *= basicPay;
        gross += hra;
        gross += da;
        gross += incentive;
        net = gross - tax - pf;

        System.out.println("----------------------------------------");
        System.out.println("Additions : ");
        System.out.println("----------------------------------------");

        System.out.println("Basic Pay : "+basicPay);
        System.out.println("House Rent Allowance : "+hra);
        System.out.println("Dearness Allowance : "+da);
        System.out.println("Incentive : "+incentive);
        System.out.println("----------------------------------------");
        System.out.println("Gross Salary : "+gross);
        System.out.println("----------------------------------------");
        System.out.println("Deductions : ");
        System.out.println("----------------------------------------");

        System.out.println("Professional Tax : "+tax);
        System.out.println("Provident Fund : "+pf);
        System.out.println("----------------------------------------");
        System.out.println("Net Salary : "+net);
    }

    void display(){
        super.display();
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Designation : "+designation);
        System.out.println("PAN ID : "+panId);
        calculate();
    }


}
