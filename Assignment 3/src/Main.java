import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Bag[] bags = new Bag[30];
        int input = -1;
        while (input != 0){
            input = runApp(bags);
        }
    }

    public static int runApp(Bag[] bags){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("================ MENU ===============");
        System.out.println("\n1. Add\n");
        System.out.println("2. Display\n");
        System.out.println("3. Delete\n");

        input = sc.nextInt();
        switch (input){
            case 0:
                break;
            case 1:
                int input2;
                System.out.println("\n1. Enter Color and Weight\n");
                System.out.println("2. Enter Color and use default Weight\n");
                System.out.println("3. Enter Weight and use default Color\n");
                System.out.println("4. Use default Color and Weight\n");
                input2 = sc.nextInt();
                System.out.println("-------------------------------------");
                switch (input2){
                    case 1 :
                        double weight;
                        String color;
                        System.out.print("Color : ");
                        color = sc.next();
                        System.out.print("Weight : ");
                        weight = sc.nextDouble();
                        bags[Bag.getTotalObjects()] = new Bag(color,weight);
                        break;
                    case 2:
                        System.out.print("Color : ");
                        color = sc.next();
                        bags[Bag.getTotalObjects()] = new Bag(color);
                        break;
                    case 3 :
                        System.out.print("Weight : ");
                        weight = sc.nextDouble();
                        bags[Bag.getTotalObjects()] = new Bag(weight);
                        break;
                    case 4:
                        bags[Bag.getTotalObjects()] = new Bag();
                        break;
                }
                break;
            case 2:
                display(bags);
                break;
            case 3:
                delete(bags);
                break;
        }
        return input;
    }

    public static void display(Bag[] bags){
        System.out.println("-------------------------------------");
        System.out.println("Serial Number       Color      Weight");

        for (int i = 0; i < Bag.getTotalObjects(); i++) {
            if (bags[i] != null){
                System.out.println("-------------------------------------");
                System.out.print((i+1)+"        ");
                bags[i].display();
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("=============== Total ================");
        System.out.println("Items                     Total Weight");
        System.out.println(Bag.getTotalObjects()+"\t\t\t\t\t\t\t\t"+Bag.getTotalWeight());


        System.out.println("\n");
    }

    public static void delete(Bag bags[]){
        int index;
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        bags[index - 1 ].loseWeight();
        for (int i = index-1; i < Bag.getTotalObjects(); i++) {
            if ((i+1) < Bag.getTotalObjects() ){
                bags[i] = bags[i+1];
            }

        }
        bags[bags.length -1] = null;

    }

}
