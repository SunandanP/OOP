public class Bag {

    private String color;
    private double weight;
    private static double totalWeight;
    private static int totalObjects;

    Bag(String color, double weight){
        this.color = color;
        this.weight = weight;
        totalWeight += this.weight;
        totalObjects++;
    }

    Bag(String color){
        this.color = color;
        this.weight = 25;
        totalWeight += this.weight;
        totalObjects++;
    }

    Bag(double weight){
        this.color = "Red";
        this.weight = weight;
        totalWeight += this.weight;
        totalObjects++;
    }

    Bag(){
        color = "Red";
        weight = 25;
        totalWeight += this.weight;
        totalObjects++;
    }

    void display(){
        System.out.println("\t\t\t"+color+(this.color.length() <= 3? "\t":"")+"\t\t"+weight);
    }

    public static int getTotalObjects(){
        return totalObjects;
    }
    public static double getTotalWeight(){
        return totalWeight;
    }
    public void loseWeight(){
        totalWeight -= this.weight;
        totalObjects--;
    }


}