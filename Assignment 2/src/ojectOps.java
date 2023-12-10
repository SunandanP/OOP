import java.util.Scanner;

public class ojectOps {
    public static int count = 0;
    public static void main(String [] args){
        object obj[] = new object[3];
        int input = -1;
        while (input != 0){
            input = runApp(obj);
        }
    }

    public static int runApp(object obj[]){
        int input,weight,input1;
        String color;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Set Object ");
        System.out.println("2. Display ");
        input = sc.nextInt();
        switch (input){
            case 0:
                break;
            case 1:
                System.out.println("1. color ");
                System.out.println("2. weight ");
                System.out.println("3. color & weight ");
                System.out.println("4. None ");
                input1 = sc.nextInt();
                switch(input1){
                    case 1:
                        System.out.println("color : ");
                        color = sc.next();
                        obj[count] = new object(color);
                        count++;
                        break;
                    case 2:
                        System.out.println("weight : ");
                        weight = sc.nextInt();
                        obj[count] = new object(weight);
                        count++;
                        break;
                    case 3:
                        System.out.println("color :");
                        color = sc.next();
                        System.out.println("weight : ");
                        weight = sc.nextInt();
                        obj[count] = new object(color,weight);
                        count++;
                        break;
                    case 4:
                        obj[count] = new object();
                        count++;
                        break;
                }
                break;
            case 2:
                for (int i = 0; i < count; i++) {
                    obj[i].display();
                }
                break;
        }

        return input;
    }

}
