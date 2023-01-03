import java.util.Scanner;



public class c2Ops {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        float real,img;
        String operation = "None";

        Complex2 c1 = new Complex2(0,0);

        Complex2 c2 = new Complex2(0,0);

        Complex2 result = new Complex2(0,0);

        int input = -1;
        while (input != 0){
            System.out.println("\n------------------------------------");
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
                    System.out.println("Enter First complex number : ");
                    System.out.print("Real : ");
                    real = scanner.nextFloat();
                    System.out.print("Imaginary : ");
                    img = scanner.nextFloat();
                    c1.setData(real,img);


                    System.out.println("Enter Second complex number : ");
                    System.out.print("Real : ");
                    real = scanner.nextFloat();
                    System.out.print("Imaginary : ");
                    img = scanner.nextFloat();
                    c2.setData(real,img);
                    operation = "Set Data";
                    c1.display();
                    c2.display();
                    result.display();
                    System.out.println("Most recent operation : "+operation);
                    break;
                case 2:
                    result = c1.add(c2);
                    operation = "Add";
                    c1.display();
                    c2.display();
                    result.display();
                    System.out.println("Most recent operation : "+operation);
                    break;
                case 3:
                    result = c1.sub(c2);
                    operation = "Subtract";
                    c1.display();
                    c2.display();
                    result.display();
                    System.out.println("Most recent operation : "+operation);
                    break;
                case 4:
                    result = c1.multiply(c2);
                    operation = "Multiply";
                    c1.display();
                    c2.display();
                    result.display();
                    System.out.println("Most recent operation : "+operation);
                    break;
                case 5:
                    result = c1.divide(c2);
                    operation = "Divide";
                    c1.display();
                    c2.display();
                    result.display();
                    System.out.println("Most recent operation : "+operation);
                    break;
                case 6:
                    c1.swap(c2);
                    operation = "Swap";
                    c1.display();
                    c2.display();
                    result.display();
                    System.out.println("Most recent operation : "+operation);
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
