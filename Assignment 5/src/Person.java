public class Person {
    protected String name;
    protected String employeeId;
    protected String PAN;
    protected String mobile;
    protected String email;
    protected int age;
    protected String DOB;

    public Person(String name, String employeeId, String PAN, String mobile, String email, int age, String DOB) {
        this.name = name;
        this.employeeId = employeeId;
        this.PAN = PAN;
        this.mobile = mobile;
        this.email = email;
        this.age = age;
        this.DOB = DOB;
    }

    public void displayData(){
        System.out.println("Name : "+name+"\t DOB : "+DOB);
        System.out.println("Age : "+age);
        System.out.println("Employee Id : "+employeeId+"\t PAN : "+PAN);
        System.out.println("Mobile Number : "+mobile);
    }
}
