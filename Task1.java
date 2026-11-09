import java.util.Scanner;
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        String nameInput = input.nextLine();

        System.out.print("Enter student age: ");
        int ageInput = input.nextInt();

        s.setName(nameInput);
        s.setAge(ageInput);

        System.out.println("Student Details ");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        input.close();
    }
}

