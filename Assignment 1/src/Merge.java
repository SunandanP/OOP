import java.util.Scanner;

public class Merge{

    static Scanner scanner = new Scanner(System.in);

    public static String[] merge(String[] list1, String[] list2){
        String[] pattern = new String[list1.length+list2.length];
        boolean flag = false;
        int count1 = 0, count2 = 0, count = 0;
        for (int i = 0; i < pattern.length; i++) {
            if (!flag){
                pattern[count] = list1[count1];
                count1++;
                count++;
                flag = true;
            }
            else {
                pattern[count] = list2[count2];
                count2++;
                count++;
                flag = false;
            }
        }
        return pattern;
    }

    public static void getData(String list[]){
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter element no. "+(i+1) +" : ");
            list[i] = scanner.next();
        }
    }

    public static void main(String[] args) {
        System.out.println("All Rights Reserved.");
        System.out.print("Enter the number of elements of list 1 :");
        int n1 = scanner.nextInt();
        String list1[] = new String[n1];
        getData(list1);
        System.out.print("Enter the number of elements of list 2 :");
        int n2 = scanner.nextInt();
        String list2[] = new String[n2];
        getData(list2);
        String[] merged = merge(list1,list2);
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]+ " ");
        }
    }
}