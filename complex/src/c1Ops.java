import java.util.Scanner;

public class c1Ops {
    public static void main(String[] args) {
        Complex1 num = new Complex1();

        Scanner scanner = new Scanner(System.in);
        int input = -1;
        String operation = "None";
        num.start();
        while (input != 0){
            System.out.println("\n1. Set Data\n");
            System.out.println("2. Add\n");
            System.out.println("3. Subtract\n");
            System.out.println("4. Multiply\n");
            System.out.println("5. Divide\n");
            System.out.println("6. Swap\n");
            System.out.println("0. Exit\n");
            input = scanner.nextInt();
            System.out.println("\n------------------------------------");
            switch (input){
                case 0:
                    break;
                case 1:
                    num.getdata();
                    operation = "Set Data";
                    num.display(operation);
                    break;
                case 2:
                    num.add();
                    operation = "Add";
                    num.display(operation);
                    break;
                case 3:
                    num.sub();
                    operation = "Subtract";
                    num.display(operation);
                    break;
                case 4:
                    num.multiply();
                    operation = "Multiply";
                    num.display(operation);
                    break;
                case 5:
                    num.divide();
                    operation = "Divide";
                    num.display(operation);
                    break;
                case 6:
                    num.swap();
                    operation = "Swap";
                    num.display(operation);
                default:
                    System.out.println("Invalid input!");
            }
        }


    }
}