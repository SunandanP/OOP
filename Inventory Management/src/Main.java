public class Main {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.readFile();
        inventory.runApp();
        inventory.writeFile();
    }
}
