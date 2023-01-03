import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Database implements Serializable{
    ArrayList<Student> students;
    static Scanner sc = new Scanner(System.in);

    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;
    File file = new File("students.rec");


    Database(){
        students = new ArrayList<>();
        students.add(new Student("Ram","Pune",8.20,1,20));
    }

    public void beautify() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
    public void addRecord() {
        try {
            boolean present = false;
            String name, addr;
            double SGPA;
            int roll, age;
            System.out.println("----------------------------------------------- New Record --------------------------------------------------------");
            beautify();
            System.out.print("Enter the name of student : ");
            name = sc.next();
            System.out.print("Enter Address : ");
            addr = sc.next();
            System.out.print("Enter Age : ");
            age = sc.nextInt();
            System.out.print("Enter SGPA : ");
            SGPA = sc.nextDouble();
            System.out.print("Enter Roll Number : ");
            roll = sc.nextInt();
            Student temp = new Student(name, addr, SGPA, roll, age);
            for(int i = 0; i < students.size(); i++) {
                if(temp.equals(students.get(i))) {
                    present = true;
                    break;
                }
            }
            if(!present) {
                students.add(temp);
                System.out.println("Record added Successfully!");
            }
            else {
                System.out.println("Record is already present!");
            }
        }
        catch(Exception e) {
            addRecord();
        }
    }

    public int searchRecord(String name) {
        int index = -1;
        Student temp;
        for(int i = 0; i < students.size(); i++) {
            temp = students.get(i);
            if(temp.getName().toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Name : "+temp.getName());
                System.out.println("Age : "+temp.getAge());
                System.out.println("Address : "+temp.getAddr());
                System.out.println("Roll Number : "+temp.getRoll());
                System.out.println("SGPA : "+temp.getSGPA());
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteRecord(String name) {
        int index = searchRecord(name);
        if(index != -1) {
            students.remove(index);
            System.out.println("Record deleted Successfully!");
        }
        else
            System.out.println("Record not found!");
    }

    public void updateRecord(String name) {
        int index = searchRecord(name);
        Student temp;
        if(index != -1) {
            temp = students.get(index);
            String addr;
            double SGPA;
            int roll, age, confirm = 0;
            System.out.println("-------------------------------------------------- Update Record --------------------------------------------------");
            beautify();
            System.out.println("Update Name?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            confirm = sc.nextInt();
            if(confirm == 1) {
                System.out.print("Enter the name of student : ");
                name = sc.next();
            }
            else {
                name= temp.getName();
            }

            System.out.println("Update Address?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            confirm = sc.nextInt();
            if(confirm == 1) {
                System.out.print("Enter Address : ");
                addr = sc.next();
            }
            else {
                addr= temp.getAddr();
            }

            System.out.println("Update Age?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            confirm = sc.nextInt();
            if(confirm == 1) {
                System.out.print("Enter Age : ");
                age = sc.nextInt();
            }
            else {
                age = temp.getAge();
            }

            System.out.println("Update SGPA?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            confirm = sc.nextInt();
            if(confirm == 1) {
                System.out.print("Enter SGPA : ");
                SGPA = sc.nextDouble();
            }
            else {
                SGPA = temp.getSGPA();
            }

            System.out.println("Update Roll number?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            confirm = sc.nextInt();
            if(confirm == 1) {
                System.out.print("Enter Roll Number : ");
                roll = sc.nextInt();
            }
            else {
                roll = temp.getRoll();
            }

            temp = new Student(name, addr, SGPA, roll, age, true, temp.getStudentId());
            System.out.println("Do you want to update the record?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            confirm = sc.nextInt();
            switch(confirm) {
                case 1:
                    students.set(index, temp);
                    break;
                case 2:
                    System.out.println("Operation Cancelled!");
                    break;
                default:
                    System.out.println("Invalid Input.");
            }


        }
    }

    public void displayAll() {
        Student temp;
        System.out.println("---------------------------------------------- All Records ------------------------------------------------------------");
        System.out.println("Student ID\t\tName\t\tAddress\t\t\tAge\t\tRoll Number\t\tSGPA");
        beautify();
        for(int i = 0; i <  students.size(); i++) {
            temp = students.get(i);
            System.out.println(temp.getStudentId()+"\t\t\t\t"+temp.getName()+"\t\t"+temp.getAddr()+"\t\t\t"+temp.getAge()+"\t\t"+temp.getRoll()+"\t\t\t"+temp.getSGPA());
            beautify();
        }
    }

    private void writeFile(){
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject((ArrayList<Student>)students);
            oos.write((int)Student.getCount());;
            oos.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }


    private void readFile(){
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            if(file.exists()) {
                students = (ArrayList<Student>) ois.readObject();
                Student.setCount(ois.readInt());
            }
            oos.close();
        }
        catch(Exception e) {

        }


    }

    public void runApp() {
        readFile();
        int input = -1;
        String temp;
        while(input != 0){
            System.out.println("1. Display all the Records");
            System.out.println("2. Add a new Record");
            System.out.println("3. Search for Record");
            System.out.println("4. Delete a Record");
            System.out.println("5. Update a Record");
            System.out.println("6. Save and Quit");
            input = sc.nextInt();
            try {
                switch(input) {
                    case 1:
                        displayAll();
                        break;
                    case 2:
                        addRecord();
                        break;
                    case 3:
                        System.out.print("Enter name to be searched : ");
                        temp = sc.next();
                        searchRecord(temp);
                        break;
                    case 4:
                        System.out.print("Enter name of the student to delete record : ");
                        temp = sc.next();
                        deleteRecord(temp);
                        break;
                    case 5:
                        System.out.print("Enter the name of student record to be updated : ");
                        temp = sc.next();
                        updateRecord(temp);
                        break;
                    case 6:
                        writeFile();
                        input = 0;
                        break;
                }
            }
            catch(Exception e) {
                runApp();
            }
        }
    }
}