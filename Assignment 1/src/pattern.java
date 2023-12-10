public class pattern {
    public static void main(String [] args){
        patternGenerator(10);
    }
    public static void patternGenerator(int num){
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= num ; j++) {
                if (j  <= i){
                    System.out.print(j);
                    if (!(i == j)){
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("\n");
        }
    }
}
