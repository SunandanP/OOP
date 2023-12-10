public class NewPattern {
    public static void star1(){
        int count = 1;
        while (count <= 3){
            for (int i = 1; i <= count; i++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }

    }
    public static void star2(){
        int count = 3;
        while (count >= 1){
            for (int i = 1; i <= count; i++) {
                System.out.print("*");
            }
            System.out.println();
            count--;
        }

    }
    public static void star3(){
        int count = 3;
        while (count >= 1){
            for (int i = 1; i <= count; i++) {

                System.out.print("*");
            }

            System.out.println();
            if (count <= 3){
                for (int i = 1; i < count-i; i++) {
                    System.out.print(" ");
                }

            }
            count--;
        }

    }
    public static void main(String[] args) {
//        star1();
//        star2();
    star3();
    }

}
