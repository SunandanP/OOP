public class object {
    private static String dColor = "Red";
    private static int dWeight = 25;
    private int weight;
    private String color;

    object(){
        color = dColor;
        weight = dWeight;
    }
    object(String color){
        this.color = color;
        weight = dWeight;
    }
    object(int weight){
        color = dColor;
        this.weight = weight;
    }
    object(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    void display(){
        System.out.println(color+" "+weight);
    }



}
