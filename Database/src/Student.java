import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private String addr;
    private static int studentCount  = 0;
    private int studentId = 0;
    private double SGPA;
    private int roll;
    private int age;

    Student(String name, String addr, double SGPA, int roll, int age){
        this.name = name;
        this.addr = addr;
        this.roll = roll;
        this.age = age;
        this.SGPA = SGPA;
        studentCount++;
        studentId = studentCount;
    }

    Student(String name, String addr, double SGPA, int roll, int age, boolean update, int studentId){
        this.name = name;
        this.addr = addr;
        this.roll = roll;
        this.age = age;
        this.SGPA = SGPA;
        if(!update) {
            studentCount++;
            this.studentId = studentCount;
        }
        else {
            this.studentId = studentId;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public int getRoll() {
        return roll;
    }

    public double getSGPA() {
        return SGPA;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAddr(String addr) {
        this.addr = addr;
    }


    public void setRoll(int roll) {
        this.roll = roll;
    }


    public void setSGPA(double SGPA) {
        this.SGPA = SGPA;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public static int getCount() {
        return studentCount;
    }

    public static void setCount(int count) {
        studentCount = count;
    }
}