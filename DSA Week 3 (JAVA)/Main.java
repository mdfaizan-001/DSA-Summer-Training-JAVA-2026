class Student {
    String name;
    // constructor
    Student(String n) {
        this.name = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Faizan");
        System.out.println("Name:" + s.name);
    }
}
