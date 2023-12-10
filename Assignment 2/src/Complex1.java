// Java class having an ability to store 3 complex numbers per object.

import java.util.Scanner;
public class Complex1 {
    private float[] real = new float[3];
    private float[] img = new float[3];

    void getdata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first complex Number");
        System.out.print("Real : ");
        real[0] = scanner.nextFloat();
        System.out.print("Img : ");
        img[0] = scanner.nextFloat();

        System.out.println("Enter the Second complex Number");
        System.out.print("Real : ");
        real[1] = scanner.nextFloat();
        System.out.print("Img : ");
        img[1] = scanner.nextFloat();
    }

    void add(){
        real[2] = real[0] + real[1];
        img[2] = img[0] + img[1];
    }

    void sub(){
        real[2] = real[0] - real[1];
        img[2] = img[0] - img[1];
    }
    void multiply(){
        real[2] = (real[0] * real[1])-(img[0] * img[1]);
        img[2] = (real[0] * img[1]) + (real[1] * img[0]);
    }

    void divide(){
        float[] conjugate = new float[2];
        conjugate[0] = real[1];
        conjugate[1] = -img[1];
        float deno = ((real[1]*real[1])+(img[1]*img[1]));
        float[] multi = new float[4];
        multi[0] = real[0] * real[1];
        multi[1] = real[0] * img[1];
        multi[2] = real[1] * img[0];
        multi[3] = img[0] * img[1];

        real[2] = (multi[0] + multi[3])/deno;
        img[2] = (-multi[1] + multi[2])/deno;
    }

    void swap(){
        float[] temp = new float[2];
        temp[0] = real[0];
        temp[1] = img[0];
        real[0] = real[1];
        img[0] = img[1];
        real[1] = temp[0];
        img[1] = temp[1];
    }

    void display(String operation){
        System.out.println("The First complex number is "+real[0]+(img[0] == 0?"":((img[0] > 0)? "+":"-")+((img[0] < 0)?-img[0]:img[0])+"i"));
        System.out.println("The Second complex number is "+real[1]+((img[1] == 0)?"":((img[1] > 0)? "+":"-")+((img[1] < 0)?-img[1]:img[1])+"i"));
        System.out.println("The Resulting complex number is "+real[2]+((img[2] == 0)?"":((img[2] > 0)? "+":"-")+((img[2] < 0)?-img[2]:img[2])+"i"));

        System.out.println("\nMost recent operation : "+operation);

        System.out.println("\n------------------------------------");
    }

    void start(){
        String message = """
                  ______   ______   .___  ___. .______    __       __________   ___      ______     ___       __        ______  __    __   __          ___   .___________.  ______   .______     \s
                 /      | /  __  \\  |   \\/   | |   _  \\  |  |     |   ____\\  \\ /  /     /      |   /   \\     |  |      /      ||  |  |  | |  |        /   \\  |           | /  __  \\  |   _  \\    \s
                |  ,----'|  |  |  | |  \\  /  | |  |_)  | |  |     |  |__   \\  V  /     |  ,----'  /  ^  \\    |  |     |  ,----'|  |  |  | |  |       /  ^  \\ `---|  |----`|  |  |  | |  |_)  |   \s
                |  |     |  |  |  | |  |\\/|  | |   ___/  |  |     |   __|   >   <      |  |      /  /_\\  \\   |  |     |  |     |  |  |  | |  |      /  /_\\  \\    |  |     |  |  |  | |      /    \s
                |  `----.|  `--'  | |  |  |  | |  |      |  `----.|  |____ /  .  \\     |  `----./  _____  \\  |  `----.|  `----.|  `--'  | |  `----./  _____  \\   |  |     |  `--'  | |  |\\  \\----.
                 \\______| \\______/  |__|  |__| | _|      |_______||_______/__/ \\__\\     \\______/__/     \\__\\ |_______| \\______| \\______/  |_______/__/     \\__\\  |__|      \\______/  | _| `._____|
                                                                                                                                                                                                 \s
                """;
        System.out.println(message);
    }

}
