public class Person {
    private String name, address;
    private int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }

}
